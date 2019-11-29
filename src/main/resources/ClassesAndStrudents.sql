drop table student;
drop table class;
drop table enrollment;


create table student 
(student_id int primary key,
first_name varchar(255),
last_name varchar(255),
email varchar(255) unique not null);


create table class(
class_id int primary key,
title varchar(255),
room_number varchar(255),
instructor varchar(255));

create table enrollment(
student_id int not null references student(student_id),
class_id int not null references class(class_id)
);


