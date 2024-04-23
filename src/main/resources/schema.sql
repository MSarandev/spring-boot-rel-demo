CREATE SCHEMA rel_demo;

CREATE TABLE rel_demo.books
(
    id         INT          NOT NULL PRIMARY KEY,
    title      VARCHAR(128) NOT NULL,
    created_at DATETIME     NOT NULL,
    updated_at DATETIME     NOT NULL
);

CREATE TABLE rel_demo.authors
(
    id         INT          NOT NULL PRIMARY KEY,
    first_name VARCHAR(128) NOT NULL,
    last_name  VARCHAR(128) NOT NULL,
    created_at DATETIME     NOT NULL,
    updated_at DATETIME     NOT NULL
);

CREATE TABLE rel_demo.libraries
(
    id         INT          NOT NULL PRIMARY KEY,
    city_name  VARCHAR(128) NOT NULL,
    is_open    BIT          NOT NULL,
    created_at DATETIME     NOT NULL,
    updated_at DATETIME     NOT NULL
);