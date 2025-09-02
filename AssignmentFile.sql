create database assignmentDB;
use assignmentDB;

-- creating course table 
create table course(
courseID int primary key,
cName varchar(25) not null,
Fees decimal(10 , 2)
);

-- creating student table 

create table student(
rollNo int primary key, 
fName varchar(25) not null,
lName varchar(25) not null,
Phone varchar (15) unique,
cId int ,
email varchar(25) unique,
Constraint fk_studentCourse
foreign key (cID) references course(courseID)
);

create table faculty(
fId int primary key,
fName varchar(30) not null,
Desig varchar(25),
Qualification varchar(25) ,
PhoneNo varchar(15) unique,
cId int,
constraint fk_facultyCourse foreign key (cId) references
course(courseID)
);

create table library(
LId int primary key,
BookId int ,
IssueDate Date,
ReturnDate Date,
rollNo int , 
constraint fk_libraryStudent
foreign key (rollNo) references student(rollNo),
constraint fk_libraryBook 
foreign key (BookId) references book(bId)
);

create table book(
bId int primary key , 
BName varchar(35) unique,
Author varchar(25),
Publisher varchar(35),
Price decimal(10,2),
Qty int
);

create table address(
AddId int Primary key  ,
houseNo varchar(15),
street varchar(25),
city varchar(20),
state varchar(20),
pincode int ,
rNo int,
constraint fk_addressStudent 
foreign key (rNo) references student(rollNo)
);


-- inserting data

insert into course values 
(101,'CSE', 100000.00),
(102,'EE', 90000.00),
(103,'ME', 80000.00);

select * from course;
desc course;

insert into student values 
(11 , 'Shozaib' , 'Zulfiqar' , 9897969594 , 101 , 'shozaib@dmail.com'),
(12 , 'Abul' , 'Hasan' , 9988998899 , 102 , 'abul@dmail,com'),
(13 , 'Sonu' , 'Sharma' , 8877887788 , 103 , 'sou@dmail,com'),
(14 , 'Bandy' , 'Man', 9876657587 , 103 , 'sandy@dmail.com');

select * from student;

insert into faculty values 
(1, 'Sam Bandy', 'Professor', 'MSc Marine Studies', '8887776661', 101),
(2, 'Haryy Potter', 'Head', 'MSc Phys Ed', '9898989495', 102),
(3, 'Buzo Singh', 'Assistant', 'BTech', '9999888878', 103),
(4, 'Rume Ross', 'Lecturer', 'MPhil English', '9098909890', 101);

select * from faculty;

INSERT INTO book VALUES
(1, 'Chum Cuisine', 'Plankton', 'Oceanic Reads', 199.99, 7),
(2, 'Magic Tricks for Starfish', 'Patrick Star', 'SeaShell Press', 89.99, 6),
(3, 'Advanced Snail Racing', 'Gary', 'SnailSpeed Publications', 129.50, 5),
(4, 'Bubble Blowing Secrets', 'SpongeBob', 'Oceanic Reads', 159.75, 8);

insert into library values
(1, 1, '2025-08-01', '2025-08-15', 11),
(2, 2, '2025-08-02', '2025-08-18', 12),
(3, 3, '2025-08-03', '2025-08-20', 14),
(4, 4, '2025-08-04', '2025-08-19', 13);

insert into address values 
(1, '742', 'Evergreen Terrace', 'Springfield', 'Illinois', '62704', 11),
(2, '1313', 'Mockingbird Lane', 'Mockingbird Heights', 'California', '91001', 12),
(3, '10', 'Downing Street', 'London', 'Greater London', '88552', 13),
(4, '1600', 'Pennsylvania Avenue NW', 'Washington', 'DC', '20500', 14);

select * from address;

