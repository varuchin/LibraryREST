CREATE TABLE LIBRARY (ID CHAR(3) NOT NULL, NAME VARCHAR(50) NOT NULL, AUTHOR VARCHAR(30),PRICE NUMBER(30,2), STOCK VARCHAR(30));

/**
SELECT * FROM LIBRARY;
**/
INSERT INTO LIBRARY VALUES ('1', 'Head First Java', 'Kathy Sierra', 1000, 'Moscow');

INSERT INTO LIBRARY VALUES ('2', 'Thinking In Java', 'Bruce Eckel', 1500, 'Moscow');

INSERT INTO LIBRARY VALUES ('3', 'A Programmer’s Guide to Java', 'Khalid Azim Mughal', 800, 'Nizhny Novgorod');

INSERT INTO LIBRARY VALUES ('4', 'The Pragmatic Programmer', 'Andrew Hunt', 1000, 'Saint Petersburg');

INSERT INTO LIBRARY VALUES ('5', 'The elements of Java style', ' Scott Ambler', 1300, 'Moscow');

INSERT INTO LIBRARY VALUES ('6', 'Effective Java', 'Joshua Bloch', 1700, 'Nizhny Novgorod');

INSERT INTO LIBRARY VALUES ('7', ' Bitter Java', 'Bruce Tate', 700, 'Saint Petersburg');

INSERT INTO LIBRARY VALUES ('8', 'Head First design patterns', 'Eric Freeman', 1000, 'Moscow');

INSERT INTO LIBRARY VALUES ('9', 'The Java language specification', 'Sun', 500, 'Saint Petersburg'); 

INSERT INTO LIBRARY VALUES ('10', 'Clean Code', ' Robert C. Martin', 1200, 'Moscow');

/**
UPDATE LIBRARY 
SET STOCK = 'Moscow' 
WHERE AUTHOR = 'Kathy Sierra';

UPDATE LIBRARY 
SET STOCK = 'Moscow' 
WHERE AUTHOR = 'Bruce Eckel';
**/

