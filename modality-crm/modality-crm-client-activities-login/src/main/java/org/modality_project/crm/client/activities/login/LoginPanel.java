package org.modality_project.crm.client.activities.login;

import dev.webfx.stack.i18n.I18nControls;
import dev.webfx.stack.ui.controls.button.ButtonFactory;
import dev.webfx.stack.ui.controls.dialog.GridPaneBuilder;
import dev.webfx.stack.routing.uirouter.uisession.UiSession;
import dev.webfx.stack.ui.util.anim.Animations;
import dev.webfx.stack.ui.util.layout.LayoutUtil;
import dev.webfx.stack.ui.util.scene.SceneUtil;
import dev.webfx.stack.authn.AuthenticationRequest;
import dev.webfx.stack.authn.UsernamePasswordCredentials;
import dev.webfx.kit.util.properties.FXProperties;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import org.modality_project.event.client.controls.sectionpanel.SectionPanelFactory;
import org.modality_project.base.client.activity.ModalityButtonFactoryMixin;
import org.modality_project.base.client.validation.ModalityValidationSupport;


/**
 * @author Bruno Salmon
 */
public final class LoginPanel implements ModalityButtonFactoryMixin {
    private final Node node;
    private final TextField usernameField;
    private final PasswordField passwordField;
    private final Button button;
    private final Property<Boolean> signInMode = new SimpleObjectProperty<>(true);
    private final ModalityValidationSupport validationSupport = new ModalityValidationSupport();

    public LoginPanel(UiSession uiSession) {
        BorderPane loginWindow = SectionPanelFactory.createSectionPanel("SignInWindowTitle");
        Hyperlink hyperLink = newHyperlink("ForgotPassword?", e -> signInMode.setValue(!signInMode.getValue()));
        GridPane gridPane;
        loginWindow.setCenter(
                gridPane = new GridPaneBuilder()
                        .addNodeFillingRow(usernameField = newMaterialTextField("Email"))
                        .addNodeFillingRow(passwordField = newMaterialPasswordField("Password"))
                        .addNewRow(hyperLink)
                        .addNodeFillingRow(button = newLargeGreenButton(null))
                        .build()
        );
        gridPane.setPadding(new Insets(20));
        GridPane.setHalignment(hyperLink, HPos.CENTER);
        hyperLink.setOnAction(e -> signInMode.setValue(!signInMode.getValue()));
        LayoutUtil.setUnmanagedWhenInvisible(passwordField, signInMode);
        FXProperties.runNowAndOnPropertiesChange(() ->
                        I18nControls.bindI18nProperties(button, signInMode.getValue() ? "SignIn>>" : "SendPassword>>")
                , signInMode);
        node = LayoutUtil.createGoldLayout(loginWindow);
        initValidation();
        button.setOnAction(event -> {
            if (validationSupport.isValid())
                new AuthenticationRequest()
                        .setUserCredentials(new UsernamePasswordCredentials(usernameField.getText(), passwordField.getText()))
                        .executeAsync()
                        .onFailure(cause -> Animations.shake(loginWindow))
                        .onSuccess(uiSession::setUserPrincipal);
        });
        prepareShowing();
    }

    private void initValidation() {
        validationSupport.addRequiredInput(usernameField, "Username is required");
        validationSupport.addRequiredInput(passwordField, "Password is required");
    }

    public Node getNode() {
        return node;
    }

    public void prepareShowing() {
        // Resetting the default button (required for JavaFX if displayed a second time)
        ButtonFactory.resetDefaultButton(button);
        SceneUtil.autoFocusIfEnabled(usernameField);
    }
}
