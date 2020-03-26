---------insert values-----------

insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(1,'indian elephant','11.5ft',4000,'elephas maximus indicus',48,36);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(2,'painted stork','3.3ft',4,'mycteria leucocephala',28,16);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(3,'black panther','5.5ft',160,'Panthera pardus',15,9);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(4,'a wine snake','60in',5,'ahaetulla nasuta',15,8);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(5,'king cobra','15.5ft',6,'ophiophagus hannah',20,9);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(6,'black bulbul','25cm',1,'hypsipetes leucocephalus',11,5);

insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(7,'White ibis','68cm',1,'eudocimus albus',20,13);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(8,'loris','23cm',1,'strepsirrhine primates',20,15);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(9,'sambar deer','5.25ft',3500,'rusa unicolor',20,15);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(10,'anamalai dot frog','5cm',1,'uperodon anamalaiensis',7,4);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(11,'rufous-bellied eagle','55cm',1,'lophotriorchis kienerii',30,20);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(12,'ristella','5.5in',1,'ristella rurkii',12,9);

insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(13,'bengal Tiger','5.5ft',150,'Panthera tigris tigris',20,15);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(14,'coppersmith barbet','17cm',1,'megalaima haemacephala',2,1);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(15,'bengal fox','4ft',3,'vulpes bengalensis',2,1);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(16,'pythons','20ft',91,'Pythonidae',30,19);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(17,'baya weaver','90cm',1,'ploceus philippinud',12,7);
insert into Animal(animal_id, name, height, weight, sci_name,life_span,age)VALUES(18,'gaur','11ft',800,'bos gaurus',30,22);

DELETE FROM animal;


insert into Category(category_id, category_name)values(1,'Extinct');
insert into Category(category_id, category_name)values(2,'Critically Endangered');
insert into Category(category_id, category_name)values(3,'Endangered');
insert into Category(category_id, category_name)values(4,'vulnerables');

DELETE FROM category;


insert into sub_category(sub_category_id, sub_category_name)values(1,'Birds');
insert into sub_category(sub_category_id, sub_category_name)values(2,'Mammal');
insert into sub_category(sub_category_id, sub_category_name)values(3,'Reptiles & Amphibians');

DELETE FROM sub_category;



insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(1,2,1,1);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(2,1,2,2);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(3,2,3,3);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(4,3,4,4);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(5,3,3,5);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(6,1,2,6);

insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(7,1,3,7);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(8,3,4,8);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(9,2,4,9);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(10,3,2,10);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(11,1,3,11);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(12,3,4,12);

insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(13,2,1,13);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(14,1,2,14);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(15,2,3,15);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(16,3,4,16);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(17,1,3,17);
insert into main_category(main_category_id, sub_category_id, category_id, animal_id)values(18,2,1,18);

DELETE FROM main_category;


insert into animal_details(animal_id, city_id, population)values(1,1,1000);
insert into animal_details(animal_id, city_id, population)values(2,1,1020);
insert into animal_details(animal_id, city_id, population)values(3,2,800);
insert into animal_details(animal_id, city_id, population)values(4,2,2000);
insert into animal_details(animal_id, city_id, population)values(5,3,1070);
insert into animal_details(animal_id, city_id, population)values(6,3,1250);

insert into animal_details(animal_id, city_id, population)values(7,4,1170);
insert into animal_details(animal_id, city_id, population)values(8,4,2206);
insert into animal_details(animal_id, city_id, population)values(9,5,5008);
insert into animal_details(animal_id, city_id, population)values(10,5,1123);
insert into animal_details(animal_id, city_id, population)values(11,6,1879);
insert into animal_details(animal_id, city_id, population)values(12,6,1989);

insert into animal_details(animal_id, city_id, population)values(13,7,1300);
insert into animal_details(animal_id, city_id, population)values(14,7,1576);
insert into animal_details(animal_id, city_id, population)values(15,8,3400);
insert into animal_details(animal_id, city_id, population)values(16,8,2134);
insert into animal_details(animal_id, city_id, population)values(17,9,1879);
insert into animal_details(animal_id, city_id, population)values(18,9,1549);
DELETE FROM animal_details;



insert into city(city_id ,city_name, state_id)values(1,'maysore',29);
insert into city(city_id ,city_name, state_id)values(2,'dandeli',29);
insert into city(city_id ,city_name, state_id)values(3,'Brahmagiri',29);

insert into city(city_id ,city_name, state_id)values(4,'ramanathapuram',33);
insert into city(city_id ,city_name, state_id)values(5,'coimbatore',33);
insert into city(city_id ,city_name, state_id)values(6,'pollachi',33);

insert into city(city_id ,city_name, state_id)values(7,'bethuadahari',19);
insert into city(city_id ,city_name, state_id)values(8,'aduria',19);
insert into city(city_id ,city_name, state_id)values(9,'bahadurpur',19);

DELETE FROM city;



insert into state(state_id,state_name)values(29,'karnataka');
insert into state(state_id,state_name)values(33,'tamil nadu');
insert into state(state_id,state_name)values(19,'west bengal');

DELETE FROM state;



