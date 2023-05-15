CREATE DATABASE IF NOT EXISTS mydb;

\c mydb;


CREATE TABLE IF NOT EXISTS news (
  id SERIAL PRIMARY KEY,
  text TEXT NOT NULL
);

INSERT INTO news (text) 
VALUES 
('Hello world'), 
('Good news - I"m working');
