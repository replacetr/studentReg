# studentReg



All function program complete. Front-end need to clean up with javascript function

jar file required

1. mysql-connector-java-8.0.22.jar -- mysql j connector 
2. servlet-api.jar -- apache tomcat 9
3. jstl-1.2.jar -- jstl library


This app required java jdk 15.0.1

Database management.

1. use mysql version 8.0.22
2. database connection detail shaiful.DbConnection.java
3. need to create database name "studentdb" with a "student" table
	SQL query for creating the db
	
	CREATE DATABASE `studentdb;
	CREATE TABLE `student` (
 	`icno` double NOT NULL,
  	`sname` varchar(45) DEFAULT NULL,
  	`birthday` varchar(45) DEFAULT NULL,
  	`pname` varchar(45) DEFAULT NULL,
  	`phone` varchar(45) DEFAULT NULL,
  	`address` varchar(45) DEFAULT NULL,
  	PRIMARY KEY (`icno`);
	
	


created by Shaiful