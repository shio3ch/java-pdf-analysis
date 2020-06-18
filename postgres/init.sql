--init DB
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id SERIAL NOT NULL ,
  name VARCHAR(80) NOT NULL,
  PRIMARY KEY (id)
);
 
INSERT INTO users (name) VALUES ('テスト1'),('テスト2'),('テスト3');