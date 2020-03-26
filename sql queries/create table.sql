--------------table creation------------------

--create table animal---
CREATE TABLE animal(
animal_id number(8) not null,
name	varchar(30) NOT NULL,	 
height	varchar(6) NOT NULL,
weight	number(5) NOT NULL,
sci_name varchar(30)	NOT NULL,	  
life_span number(3)  NOT NULL,	
age number(3) NOT NULL,
CONSTRAINT animal PRIMARY KEY(animal_id)
);

DROP TABLE animal;



--create table category---
CREATE TABLE category(
category_id number(1) NOT NULL,
category_name varchar(50) NOT NULL,
CONSTRAINT category PRIMARY KEY(category_id)
);

DROP TABLE category;


--create table sub_category---
CREATE TABLE sub_category(
sub_category_id number(1) NOT NULL,
sub_category_name varchar(50) NOT NULL,
CONSTRAINT sub_category PRIMARY KEY(sub_category_id)
);

DROP TABLE sub_category;


--create table main_category---
CREATE TABLE main_category(
main_category_id number(2) NOT NULL,
CONSTRAINT main_category PRIMARY KEY(main_category_id),
sub_category_id number(1) NOT NULL,
CONSTRAINT fk_maincategory FOREIGN KEY(sub_category_id) REFERENCES sub_category(sub_category_id),
category_id number(1) NOT NULL,
CONSTRAINT fk_maincategory1 FOREIGN KEY(category_id) REFERENCES category(category_id),
animal_id number(8) NOT NULL,
CONSTRAINT fk_maincategory2 FOREIGN KEY(animal_id) REFERENCES animal(animal_id)
);

DROP TABLE main_category;


--create table state---
CREATE TABLE state(
state_id number(2) NOT NULL,
CONSTRAINT state PRIMARY KEY(state_id),
state_name varchar(50) NOT NULL	
);

DROP TABLE state;



--create table city---
CREATE TABLE city(
city_id	number(3) NOT NULL ,
CONSTRAINT city PRIMARY KEY(city_id),	
city_name varchar(50) NOT NULL,	
state_id number(2) NOT NULL,
CONSTRAINT fk_city FOREIGN KEY(state_id) REFERENCES state(state_id) 
);

DROP TABLE city;



--create table animal_details---
CREATE TABLE animal_details(
animal_id number(8)NOT NULL,
CONSTRAINT fk_animaldetail2 FOREIGN KEY(animal_id) REFERENCES animal(animal_id), 
city_id number(3) NOT NULL,
CONSTRAINT fk_animaldetail1 FOREIGN KEY(city_id) REFERENCES city(city_id) ,
population number(7) NOT NULL
);

DROP TABLE animal_details;
