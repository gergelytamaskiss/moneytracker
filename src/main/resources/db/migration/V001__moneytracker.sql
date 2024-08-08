CREATE TABLE role
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(64) NOT NULL,
    enabled     BOOLEAN     NOT NULL,
    created_by  INTEGER,
    created_on  TIMESTAMP   NOT NULL,
    modified_by INTEGER,
    modified_on TIMESTAMP   NOT NULL
);

-- testing purposes
INSERT INTO role (name, enabled, created_on, modified_on)
VALUES ('ROLE_USER', TRUE, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('ROLE_ADMIN', TRUE, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

CREATE TABLE app_user
(
    id          SERIAL PRIMARY KEY,
    email       VARCHAR(256) NOT NULL UNIQUE,
    password    VARCHAR(128) NOT NULL,
    first_name  VARCHAR(128),
    last_name   VARCHAR(128),
    role_id     INTEGER REFERENCES role (id),
    enabled     BOOLEAN      NOT NULL,
    last_login  TIMESTAMP,
    created_by  INTEGER REFERENCES app_user (id),
    created_on  TIMESTAMP    NOT NULL,
    modified_by INTEGER REFERENCES app_user (id),
    modified_on TIMESTAMP    NOT NULL
);
