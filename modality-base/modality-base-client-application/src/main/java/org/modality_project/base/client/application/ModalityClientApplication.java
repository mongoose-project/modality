package org.modality_project.base.client.application;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import dev.webfx.extras.imagestore.ImageStore;
import dev.webfx.stack.routing.activity.ActivityManager;
import dev.webfx.stack.orm.domainmodel.activity.viewdomain.ViewDomainActivityContext;
import dev.webfx.stack.ui.util.scene.SceneUtil;
import dev.webfx.stack.orm.datasourcemodel.service.DataSourceModelService;
import dev.webfx.kit.launcher.WebFxKitLauncher;
import dev.webfx.kit.util.properties.FXProperties;
import dev.webfx.platform.uischeduler.UiScheduler;
import dev.webfx.stack.com.bus.call.PendingBusCall;

import java.util.function.Consumer;

/**
 * @author Bruno Salmon
 */
public class ModalityClientApplication extends Application {

    private final ModalityClientActivity modalityClientActivity;

    public ModalityClientApplication(ModalityClientActivity modalityClientActivity) {
        this.modalityClientActivity = modalityClientActivity;
    }

    @Override
    public void init() {
        ActivityManager.runActivity(modalityClientActivity,
                ViewDomainActivityContext.createViewDomainActivityContext(DataSourceModelService.getDefaultDataSourceModel())
        );
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Rectangle2D screenVisualBounds = Screen.getPrimary().getVisualBounds();
        double width = screenVisualBounds.getWidth() * 0.8;
        double height = screenVisualBounds.getHeight() * 0.9;
        Scene scene = new Scene(root, width, height);
        scene.getStylesheets().addAll("org/modality_project/base/client/css/modality.css");
        //root.centerProperty().bind(modalityClientActivity.nodeProperty()); //
        scene.rootProperty().bind(FXProperties.compute(modalityClientActivity.nodeProperty(), n -> (Parent) n));
        // Activating focus owner auto scroll
        SceneUtil.installSceneFocusOwnerAutoScroll(scene);
        primaryStage.setScene(scene);
        primaryStage.show();
        setLoadingSpinnerVisibleConsumer(this::setLoadingSpinnerVisible);
    }

    private static void setLoadingSpinnerVisibleConsumer(Consumer<Boolean> consumer) {
        consumeInUiThread(FXProperties.compute(PendingBusCall.pendingCallsCountProperty(), pendingCallsCount -> pendingCallsCount > 0)
                , consumer);
    }

    public static <T> void consumeInUiThread(ObservableValue<T> property, Consumer<T> consumer) {
        FXProperties.consume(property, arg -> UiScheduler.scheduleDeferred(() -> consumer.accept(arg)));
    }


    private ImageView spinner;

    private void setLoadingSpinnerVisible(boolean visible) {
        Scene scene = WebFxKitLauncher.getPrimaryStage().getScene();
        Node root = scene == null ? null : scene.getRoot();
        if (root instanceof Pane) {
            Pane rootPane = (Pane) root;
            if (!visible) {
                rootPane.getChildren().remove(spinner);
            } else if (!rootPane.getChildren().contains(spinner)) {
                if (spinner == null) {
                    spinner = ImageStore.createImageView("org/modality_project/base/client/images/spinner.gif");
                    spinner.setManaged(false);
                }
                spinner.xProperty().bind(FXProperties.combine(rootPane.widthProperty(), spinner.getImage().widthProperty(), (w1, w2) -> (w1.doubleValue() - w2.doubleValue())/2 ));
                spinner.yProperty().bind(FXProperties.combine(rootPane.heightProperty(), spinner.getImage().heightProperty(), (h1, h2) -> (h1.doubleValue() - h2.doubleValue())/2 ));
                rootPane.getChildren().add(spinner);
            }
        }
    }
}
