create table students(id serial primary key, stname varchar(50) not null, email varchar(50) unique, age int,marks decimal(10,2));
insert into students (stname,email,age,marks) values ("Alice","alice@gmail.com",23,35),("Bob","bob@gmail.com",25,42),("Charlie","charlie@gmail.com",21,31);
drop table students;