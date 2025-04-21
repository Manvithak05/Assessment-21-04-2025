create table students(id serial primary key, name varchar(50) not null, email varchar(50) unique, age int,marks decimal(10,2));
insert into students (name,email,age,marks) values ('Alice','alice@gmail.com',23,35),('Bob','bob@gmail.com',25,42),('Charlie','charlie@gmail.com',21,31),('David','david@gmail.com',19,37),('Ethan','ethan@gmail.com',33,45);
select * from students;

--2
select * from students where age>21;

--3
update students set email='rahul@gmail.com' where id=5;
select * from students;

--4
delete from students where age<18;

--5
select max(marks)from students limit 1 offset 1;

--6
create table student (id serial primary key,name varchar(50),age int);
create table courses (course_id int primary key,student_id int, course_name varchar(50),foreign key(student_id) references student(id));

insert into student values (1,'Rahul',22),(2,'Priya',21),(3,'Akash',23);
insert into courses values (101,1,'Java'),(102,2,'Python'),(103,1,'SQL');

select * from student;
select * from courses;

select s.name as Student_Name,c.course_name as Course_Name from student s inner join courses c on s.id=c.student_id;