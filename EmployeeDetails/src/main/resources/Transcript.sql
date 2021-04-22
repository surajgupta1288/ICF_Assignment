--DROP Existing Database
DROP database IF EXIST temp;

-- To Create a temp Database
CREATE DATABASE temp;

-- To use that Particular Database
USE temp;


-- Create Employee Table 
CREATE TABLE Employee(
  id int AUTO_INCREMENT PRIMARY KEY,
  first_name varchar(20),
  last_name varchar(20),
  employment_id varchar(10),
  start_date date,
  designation varchar(20),
  department varchar(20),
  end_date date,
  status varchar(20),
  dob date,
  reporting_manager varchar(10),
  gender varchar(20),
  blood_group varchar(3),
  address varchar(30)
);



-- Insert Data into Employee Data
INSERT INTO Employee 
( first_name, last_name, employment_id, start_date, designation, department, end_date, status, dob, reporting_manager, gender, blood_group, address ) 

VALUES
("Parundeep","Singh","EMP1","2021-01-01","Software Engineer","XYZ",null,"Working","1998-07-14","EMP21","M","B+","XYZ Colony"),
( "Vivek", "Sharma", "EMP2", "2021-01-01", "Manager", "XYZ", "2021-02-01", "Non-Working", "1996-09-10", "EMP20", "M", "AB+", "ABC Colony" ), 
( "Sia", "Gupta", "EMP3", "2020-03-14", "Team Lead", "PQQ", null, "Working", "1996-09-10", "EMP21", "F", "O+", "PQR Colony" );



-- Display all the data
SELECT * FROM EMPLOYEE;