CREATE TABLE company (
    id_company NUMBER PRIMARY KEY,
    codigo_company VARCHAR2(255) UNIQUE,
    name_company VARCHAR2(255),
    description_company VARCHAR2(255)
);

CREATE TABLE application (
    app_id NUMBER PRIMARY KEY,
    app_code VARCHAR2(255) UNIQUE,
    app_name VARCHAR2(255),
    app_description VARCHAR2(255)
);

CREATE TABLE version (
    version_id NUMBER PRIMARY KEY,
    version VARCHAR2(255),
    version_description VARCHAR2(255)
);

CREATE TABLE version_company (
    version_company_id NUMBER PRIMARY KEY,
    company_id NUMBER,
    version_id NUMBER,
    app_id NUMBER,
    version_company_description VARCHAR2(255),
    CONSTRAINT fk_company_id FOREIGN KEY (company_id) REFERENCES company(id_company),
    CONSTRAINT fk_version_id FOREIGN KEY (version_id) REFERENCES version(version_id),
    CONSTRAINT fk_app_id FOREIGN KEY (app_id) REFERENCES application(app_id)
);
