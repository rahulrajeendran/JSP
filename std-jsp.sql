create database clgrg;
use clgrg;
create table admin(username varchar(20),pass varchar(20));
create table result(rollno int,Engg_phy int,Engg_che int,Engg_math int,Engg_gra int,Electronics int);
create table student(rollno int,Name varchar(20),father varchar(20),gender varchar(20),course varchar(10),branch varchar(20));
insert into admin values("Admin","admin@12");
show tables;