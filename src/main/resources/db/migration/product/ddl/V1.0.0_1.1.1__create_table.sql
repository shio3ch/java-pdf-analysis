CREATE TABLE users (
    id serial NOT NULL ,
    name varchar(80) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE item (
    id serial PRIMARY KEY,
    name varchar(80) NOT NULL,
    introduction varchar(200),
    in_tax_price integer NOT NULL,
    content text
);

CREATE TABLE item_image (
    id integer PRIMARY KEY REFERENCES item (id) ON DELETE CASCADE,
    image bytea
);
