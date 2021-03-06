SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

INSERT INTO public.currency VALUES (1, 'XAF', 'CFA Franc BEAC', NULL);
INSERT INTO public.currency VALUES (2, 'XAU', 'Gold', NULL);
INSERT INTO public.currency VALUES (3, 'XBA', 'Bond Markets Unit European Composite Unit (EURCO)', NULL);
INSERT INTO public.currency VALUES (4, 'XBB', 'Bond Markets Unit European Monetary Unit (E.M.U.-6)', NULL);
INSERT INTO public.currency VALUES (5, 'XBC', 'Bond Markets Unit European Unit of Account 9 (E.U.A.-9)', NULL);
INSERT INTO public.currency VALUES (6, 'XBD', 'Bond Markets Unit European Unit of Account 17 (E.U.A.-17)', NULL);
INSERT INTO public.currency VALUES (7, 'XCD', 'East Caribbean Dollar', '$');
INSERT INTO public.currency VALUES (8, 'XDR', 'SDR (Special Drawing Right)', NULL);
INSERT INTO public.currency VALUES (9, 'XFU', 'UIC-Franc', NULL);
INSERT INTO public.currency VALUES (10, 'XOF', 'CFA Franc BCEAO', NULL);
INSERT INTO public.currency VALUES (11, 'XPD', 'Palladium', NULL);
INSERT INTO public.currency VALUES (12, 'XPF', 'CFP Franc', NULL);
INSERT INTO public.currency VALUES (13, 'XPT', 'Platinum', NULL);
INSERT INTO public.currency VALUES (14, 'XSU', 'Sucre', NULL);
INSERT INTO public.currency VALUES (15, 'XTS', 'Codes specifically reserved for testing purposes', NULL);
INSERT INTO public.currency VALUES (16, 'XUA', 'ADB Unit of Account', NULL);
INSERT INTO public.currency VALUES (17, 'XXX', 'The codes assigned for transactions where no currency is involved', NULL);
INSERT INTO public.currency VALUES (18, 'XAG', 'Silver', NULL);
INSERT INTO public.currency VALUES (19, 'BOV', 'Mvdol', NULL);
INSERT INTO public.currency VALUES (20, 'GHS', 'Ghana Cedi', NULL);
INSERT INTO public.currency VALUES (21, 'GIP', 'Gibraltar Pound', '£');
INSERT INTO public.currency VALUES (22, 'GMD', 'Dalasi', NULL);
INSERT INTO public.currency VALUES (23, 'GNF', 'Guinea Franc', NULL);
INSERT INTO public.currency VALUES (24, 'GTQ', 'Quetzal', 'Q');
INSERT INTO public.currency VALUES (25, 'GYD', 'Guyana Dollar', '$');
INSERT INTO public.currency VALUES (26, 'HKD', 'Hong Kong Dollar', '$');
INSERT INTO public.currency VALUES (27, 'HNL', 'Lempira', 'L');
INSERT INTO public.currency VALUES (28, 'HRK', 'Croatian Kuna', 'kn');
INSERT INTO public.currency VALUES (29, 'HTG', 'Gourde', NULL);
INSERT INTO public.currency VALUES (30, 'HUF', 'Forint', 'Ft');
INSERT INTO public.currency VALUES (31, 'IDR', 'Rupiah', 'Rp');
INSERT INTO public.currency VALUES (32, 'ILS', 'New Israeli Sheqel', '₪');
INSERT INTO public.currency VALUES (33, 'INR', 'Indian Rupee', NULL);
INSERT INTO public.currency VALUES (34, 'IQD', 'Iraqi Dinar', NULL);
INSERT INTO public.currency VALUES (35, 'IRR', 'Iranian Rial', '﷼');
INSERT INTO public.currency VALUES (36, 'ISK', 'Iceland Krona', 'kr');
INSERT INTO public.currency VALUES (37, 'JMD', 'Jamaican Dollar', 'J$');
INSERT INTO public.currency VALUES (38, 'MXN', 'Mexican Peso', '$');
INSERT INTO public.currency VALUES (39, 'MYR', 'Malaysian Ringgit', 'RM');
INSERT INTO public.currency VALUES (40, 'MZN', 'Mozambique Metical', 'MT');
INSERT INTO public.currency VALUES (41, 'NAD', 'Namibia Dollar', '$');
INSERT INTO public.currency VALUES (42, 'NGN', 'Naira', '₦');
INSERT INTO public.currency VALUES (43, 'NIO', 'Cordoba Oro', 'C$');
INSERT INTO public.currency VALUES (44, 'NOK', 'Norwegian Krone', 'kr');
INSERT INTO public.currency VALUES (45, 'NPR', 'Nepalese Rupee', '₨');
INSERT INTO public.currency VALUES (46, 'ANG', 'Netherlands Antillean Guilder', 'ƒ');
INSERT INTO public.currency VALUES (47, 'AED', 'UAE Dirham', NULL);
INSERT INTO public.currency VALUES (48, 'AFN', 'Afghani', '؋');
INSERT INTO public.currency VALUES (49, 'ALL', 'Lek', 'Lek');
INSERT INTO public.currency VALUES (50, 'AMD', 'Armenian Dram', NULL);
INSERT INTO public.currency VALUES (51, 'AOA', 'Kwanza', NULL);
INSERT INTO public.currency VALUES (52, 'ARS', 'Argentine Peso', '$');
INSERT INTO public.currency VALUES (53, 'AUD', 'Australian Dollar', '$');
INSERT INTO public.currency VALUES (54, 'AWG', 'Aruban Florin', 'ƒ');
INSERT INTO public.currency VALUES (55, 'AZN', 'Azerbaijanian Manat', 'ман');
INSERT INTO public.currency VALUES (56, 'BAM', 'Convertible Mark', 'KM');
INSERT INTO public.currency VALUES (57, 'BBD', 'Barbados Dollar', '$');
INSERT INTO public.currency VALUES (58, 'BDT', 'Taka', NULL);
INSERT INTO public.currency VALUES (59, 'BGN', 'Bulgarian Lev', 'лв');
INSERT INTO public.currency VALUES (60, 'BHD', 'Bahraini Dinar', NULL);
INSERT INTO public.currency VALUES (61, 'BIF', 'Burundi Franc', NULL);
INSERT INTO public.currency VALUES (62, 'BMD', 'Bermudian Dollar', '$');
INSERT INTO public.currency VALUES (63, 'BND', 'Brunei Dollar', '$');
INSERT INTO public.currency VALUES (64, 'BOB', 'Boliviano', '$b');
INSERT INTO public.currency VALUES (65, 'BRL', 'Brazilian Real', 'R$');
INSERT INTO public.currency VALUES (66, 'BSD', 'Bahamian Dollar', '$');
INSERT INTO public.currency VALUES (67, 'BTN', 'Ngultrum', NULL);
INSERT INTO public.currency VALUES (68, 'BWP', 'Pula', 'P');
INSERT INTO public.currency VALUES (69, 'BYR', 'Belarussian Ruble', 'p.');
INSERT INTO public.currency VALUES (70, 'BZD', 'Belize Dollar', 'BZ$');
INSERT INTO public.currency VALUES (71, 'CAD', 'Canadian Dollar', '$');
INSERT INTO public.currency VALUES (72, 'CDF', 'Congolese Franc', NULL);
INSERT INTO public.currency VALUES (73, 'CHE', 'WIR Euro', NULL);
INSERT INTO public.currency VALUES (74, 'CHF', 'Swiss Franc', NULL);
INSERT INTO public.currency VALUES (75, 'CHW', 'WIR Franc', NULL);
INSERT INTO public.currency VALUES (76, 'CLF', 'Unidades de fomento', NULL);
INSERT INTO public.currency VALUES (77, 'CLP', 'Chilean Peso', '$');
INSERT INTO public.currency VALUES (78, 'CNY', 'Yuan Renminbi', '¥');
INSERT INTO public.currency VALUES (79, 'COP', 'Colombian Peso', '$');
INSERT INTO public.currency VALUES (80, 'COU', 'Unidad de Valor Real', NULL);
INSERT INTO public.currency VALUES (81, 'CRC', 'Costa Rican Colon', '₡');
INSERT INTO public.currency VALUES (82, 'CUC', 'Peso Convertible', NULL);
INSERT INTO public.currency VALUES (83, 'CUP', 'Cuban Peso', '₱');
INSERT INTO public.currency VALUES (84, 'CVE', 'Cape Verde Escudo', NULL);
INSERT INTO public.currency VALUES (85, 'CZK', 'Czech Koruna', 'Kč');
INSERT INTO public.currency VALUES (86, 'DJF', 'Djibouti Franc', NULL);
INSERT INTO public.currency VALUES (87, 'DKK', 'Danish Krone', 'kr');
INSERT INTO public.currency VALUES (88, 'DOP', 'Dominican Peso', 'RD$');
INSERT INTO public.currency VALUES (89, 'DZD', 'Algerian Dinar', NULL);
INSERT INTO public.currency VALUES (90, 'EGP', 'Egyptian Pound', '£');
INSERT INTO public.currency VALUES (91, 'ERN', 'Nakfa', NULL);
INSERT INTO public.currency VALUES (92, 'ETB', 'Ethiopian Birr', NULL);
INSERT INTO public.currency VALUES (94, 'FJD', 'Fiji Dollar', '$');
INSERT INTO public.currency VALUES (95, 'FKP', 'Falkland Islands Pound', '£');
INSERT INTO public.currency VALUES (96, 'GBP', 'Pound Sterling', '£');
INSERT INTO public.currency VALUES (97, 'GEL', 'Lari', NULL);
INSERT INTO public.currency VALUES (98, 'NZD', 'New Zealand Dollar', '$');
INSERT INTO public.currency VALUES (99, 'OMR', 'Rial Omani', '﷼');
INSERT INTO public.currency VALUES (100, 'PAB', 'Balboa', 'B/.');
INSERT INTO public.currency VALUES (101, 'PEN', 'Nuevo Sol', 'S/.');
INSERT INTO public.currency VALUES (102, 'PGK', 'Kina', NULL);
INSERT INTO public.currency VALUES (103, 'PHP', 'Philippine Peso', '₱');
INSERT INTO public.currency VALUES (104, 'PKR', 'Pakistan Rupee', '₨');
INSERT INTO public.currency VALUES (105, 'PLN', 'Zloty', 'zł');
INSERT INTO public.currency VALUES (106, 'PYG', 'Guarani', 'Gs');
INSERT INTO public.currency VALUES (107, 'QAR', 'Qatari Rial', '﷼');
INSERT INTO public.currency VALUES (108, 'RON', 'New Romanian Leu', 'lei');
INSERT INTO public.currency VALUES (109, 'RSD', 'Serbian Dinar', 'Дин.');
INSERT INTO public.currency VALUES (110, 'RUB', 'Russian Ruble', 'руб');
INSERT INTO public.currency VALUES (111, 'RWF', 'Rwanda Franc', NULL);
INSERT INTO public.currency VALUES (112, 'SAR', 'Saudi Riyal', '﷼');
INSERT INTO public.currency VALUES (113, 'SBD', 'Solomon Islands Dollar', '$');
INSERT INTO public.currency VALUES (114, 'SCR', 'Seychelles Rupee', '₨');
INSERT INTO public.currency VALUES (115, 'JOD', 'Jordanian Dinar', NULL);
INSERT INTO public.currency VALUES (116, 'JPY', 'Yen', '¥');
INSERT INTO public.currency VALUES (117, 'KES', 'Kenyan Shilling', NULL);
INSERT INTO public.currency VALUES (118, 'KGS', 'Som', 'лв');
INSERT INTO public.currency VALUES (119, 'KHR', 'Riel', '៛');
INSERT INTO public.currency VALUES (120, 'KMF', 'Comoro Franc', NULL);
INSERT INTO public.currency VALUES (121, 'KPW', 'North Korean Won', '₩');
INSERT INTO public.currency VALUES (122, 'KRW', 'Won', '₩');
INSERT INTO public.currency VALUES (123, 'KWD', 'Kuwaiti Dinar', NULL);
INSERT INTO public.currency VALUES (124, 'KYD', 'Cayman Islands Dollar', '$');
INSERT INTO public.currency VALUES (125, 'KZT', 'Tenge', 'лв');
INSERT INTO public.currency VALUES (126, 'LAK', 'Kip', '₭');
INSERT INTO public.currency VALUES (127, 'LBP', 'Lebanese Pound', '£');
INSERT INTO public.currency VALUES (128, 'LKR', 'Sri Lanka Rupee', '₨');
INSERT INTO public.currency VALUES (129, 'LRD', 'Liberian Dollar', '$');
INSERT INTO public.currency VALUES (130, 'LSL', 'Loti', NULL);
INSERT INTO public.currency VALUES (131, 'LTL', 'Lithuanian Litas', 'Lt');
INSERT INTO public.currency VALUES (132, 'LVL', 'Latvian Lats', 'Ls');
INSERT INTO public.currency VALUES (133, 'LYD', 'Libyan Dinar', NULL);
INSERT INTO public.currency VALUES (134, 'MAD', 'Moroccan Dirham', NULL);
INSERT INTO public.currency VALUES (135, 'MDL', 'Moldovan Leu', NULL);
INSERT INTO public.currency VALUES (136, 'MGA', 'Malagasy Ariary', NULL);
INSERT INTO public.currency VALUES (137, 'MKD', 'Denar', 'ден');
INSERT INTO public.currency VALUES (138, 'MMK', 'Kyat', NULL);
INSERT INTO public.currency VALUES (139, 'MNT', 'Tugrik', '₮');
INSERT INTO public.currency VALUES (140, 'MOP', 'Pataca', NULL);
INSERT INTO public.currency VALUES (141, 'MRO', 'Ouguiya', NULL);
INSERT INTO public.currency VALUES (142, 'MUR', 'Mauritius Rupee', '₨');
INSERT INTO public.currency VALUES (143, 'MVR', 'Rufiyaa', NULL);
INSERT INTO public.currency VALUES (144, 'MWK', 'Kwacha', NULL);
INSERT INTO public.currency VALUES (145, 'MXV', 'Mexican Unidad de Inversion (UDI)', NULL);
INSERT INTO public.currency VALUES (146, 'SDG', 'Sudanese Pound', NULL);
INSERT INTO public.currency VALUES (147, 'SEK', 'Swedish Krona', 'kr');
INSERT INTO public.currency VALUES (148, 'SGD', 'Singapore Dollar', '$');
INSERT INTO public.currency VALUES (149, 'SHP', 'Saint Helena Pound', '£');
INSERT INTO public.currency VALUES (150, 'SLL', 'Leone', NULL);
INSERT INTO public.currency VALUES (151, 'SOS', 'Somali Shilling', 'S');
INSERT INTO public.currency VALUES (152, 'SRD', 'Surinam Dollar', '$');
INSERT INTO public.currency VALUES (153, 'SSP', 'South Sudanese Pound', NULL);
INSERT INTO public.currency VALUES (154, 'STD', 'Dobra', NULL);
INSERT INTO public.currency VALUES (155, 'SVC', 'El Salvador Colon', '$');
INSERT INTO public.currency VALUES (156, 'SYP', 'Syrian Pound', '£');
INSERT INTO public.currency VALUES (157, 'SZL', 'Lilangeni', NULL);
INSERT INTO public.currency VALUES (158, 'THB', 'Baht', '฿');
INSERT INTO public.currency VALUES (159, 'TJS', 'Somoni', NULL);
INSERT INTO public.currency VALUES (160, 'TMT', 'Turkmenistan New Manat', NULL);
INSERT INTO public.currency VALUES (161, 'TND', 'Tunisian Dinar', NULL);
INSERT INTO public.currency VALUES (162, 'TOP', 'Pa''anga', NULL);
INSERT INTO public.currency VALUES (163, 'TRY', 'Turkish Lira', 'TL');
INSERT INTO public.currency VALUES (164, 'TTD', 'Trinidad and Tobago Dollar', 'TT$');
INSERT INTO public.currency VALUES (165, 'TWD', 'New Taiwan Dollar', 'NT$');
INSERT INTO public.currency VALUES (166, 'TZS', 'Tanzanian Shilling', NULL);
INSERT INTO public.currency VALUES (167, 'UAH', 'Hryvnia', '₴');
INSERT INTO public.currency VALUES (168, 'UGX', 'Uganda Shilling', NULL);
INSERT INTO public.currency VALUES (169, 'USD', 'US Dollar', '$');
INSERT INTO public.currency VALUES (170, 'USN', 'US Dollar (Next day)', NULL);
INSERT INTO public.currency VALUES (171, 'USS', 'US Dollar (Same day)', NULL);
INSERT INTO public.currency VALUES (172, 'UYI', 'Uruguay Peso en Unidades Indexadas (URUIURUI)', NULL);
INSERT INTO public.currency VALUES (173, 'UYU', 'Peso Uruguayo', '$U');
INSERT INTO public.currency VALUES (174, 'UZS', 'Uzbekistan Sum', 'лв');
INSERT INTO public.currency VALUES (175, 'VEF', 'Bolivar', 'Bs');
INSERT INTO public.currency VALUES (176, 'VND', 'Dong', '₫');
INSERT INTO public.currency VALUES (177, 'VUV', 'Vatu', NULL);
INSERT INTO public.currency VALUES (178, 'WST', 'Tala', NULL);
INSERT INTO public.currency VALUES (179, 'YER', 'Yemeni Rial', '﷼');
INSERT INTO public.currency VALUES (180, 'ZAR', 'Rand', 'R');
INSERT INTO public.currency VALUES (181, 'ZMK', 'Zambian Kwacha', NULL);
INSERT INTO public.currency VALUES (182, 'ZWL', 'Zimbabwe Dollar', NULL);
INSERT INTO public.currency VALUES (93, 'EUR', 'Euro', '€');
