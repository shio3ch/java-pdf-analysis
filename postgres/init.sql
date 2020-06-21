--init DB
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id serial NOT NULL ,
    name varchar(80) NOT NULL,
    PRIMARY KEY (id)
);
 
INSERT INTO users (name) VALUES ('アンクルジャム'),('チルドバター'),('二足歩行犬');

CREATE TABLE item (
    id serial PRIMARY KEY,
    name varchar(80) NOT NULL,
    introduction varchar(200),
    in_tax_price integer NOT NULL,
    content text
);

INSERT
    INTO item (id, name, introduction, in_tax_price, content)
    VALUES
        ( 1, 'アンパン', 'あんがたっぷり詰まったパンだパン。', '120', '# content' ),
        ( 2, '食パン', '味はしません。', '600', '# content' ),
        ( 3, 'カレーパン', '10辛よりも辛いです。', '240', '# content' )
;

CREATE TABLE item_image (
    id integer PRIMARY KEY REFERENCES item (id) ON DELETE CASCADE,
    image bytea
);

INSERT
    INTO item_image (id, image)
    VALUES
        ( 1, pg_read_binary_file('/docker-entrypoint-initdb.d/resources/anpan.png') ),
        ( 2, pg_read_binary_file('/docker-entrypoint-initdb.d/resources/breadpan.png') ),
        ( 3, pg_read_binary_file('/docker-entrypoint-initdb.d/resources/currypan.png') )
;
