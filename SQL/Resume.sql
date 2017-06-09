CREATE DATABASE `Resume`;

USE `Resume`;

CREATE TABLE NameAndEmail(
	id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (300),
    email VARCHAR (300)
);
CREATE TABLE Education(

	id INTEGER AUTO_INCREMENT PRIMARY KEY,
    education_name VARCHAR (300)
);
CREATE TABLE Work(
	id INTEGER AUTO_INCREMENT PRIMARY KEY,
    work_name VARCHAR (300)
);
CREATE TABLE Skills(
	id INTEGER AUTO_INCREMENT PRIMARY KEY,
    skills_name VARCHAR (300)
);

SELECT * FROM Education;
SELECT * FROM NameAndEmail;
SELECT * FROM Work;
SELECT * FROM Skills;

DROP TABLE Education;
DROP TABLE NameAndEmail;
DROP TABLE Work;
Drop Table Skills;

DROP TABLE NameAndEmail, Education, Work, Skills;

INSERT INTO Education (education_name) Values ('test');