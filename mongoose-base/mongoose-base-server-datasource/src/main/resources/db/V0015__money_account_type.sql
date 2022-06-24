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

INSERT INTO public.money_account_type VALUES (3, 'bank', 'Bank account', NULL, false, false, true);
INSERT INTO public.money_account_type VALUES (4, 'safe', 'Safe', NULL, false, false, true);
INSERT INTO public.money_account_type VALUES (5, 'cardterm', 'Card terminal', NULL, false, false, true);
INSERT INTO public.money_account_type VALUES (7, 'bag', 'Money bag', NULL, false, false, true);
INSERT INTO public.money_account_type VALUES (8, 'chqenv', 'Cheque envelope', NULL, false, false, true);
INSERT INTO public.money_account_type VALUES (6, 'pos', 'Point of sale', NULL, false, false, true);
INSERT INTO public.money_account_type VALUES (9, 'gateway', 'Gateway account', NULL, false, false, true);
INSERT INTO public.money_account_type VALUES (1, 'customer', 'Customer account', NULL, true, false, false);
INSERT INTO public.money_account_type VALUES (2, 'supplier', 'Supplier account', NULL, false, true, false);
