INSERT INTO company (id_company, codigo_company, name_company, description_company) VALUES
(1, 'C001', 'Company One', 'Description One'),
(2, 'C002', 'Company Two', 'Description Two');

INSERT INTO application (app_id, app_code, app_name, app_description) VALUES
(1, 'A001', 'App One', 'App Description One'),
(2, 'A002', 'App Two', 'App Description Two');

INSERT INTO version (version_id, version, version_description) VALUES
(1, 'v1.0', 'Version 1.0 Description'),
(2, 'v2.0', 'Version 2.0 Description');

INSERT INTO version_company (version_company_id, company_id, version_id, app_id, version_company_description) VALUES
(1, 1, 1, 1, 'Company One - App One - Version 1.0'),
(2, 2, 2, 2, 'Company Two - App Two - Version 2.0');
