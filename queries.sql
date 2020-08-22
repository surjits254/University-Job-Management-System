--Below is the script for creating tables in the database:

--This table will contain login in formation for employers
CREATE TABLE dbo.employerLogin (
userid VARCHAR (50) Primary Key NOT NULL,
password VARCHAR (50) NOT NULL
);
insert into dbo.employerLogin(userid,password) values('surjit','surjit');
insert into dbo.employerLogin(userid,password) values('karan','karan');

--This table will contain login in formation for faculty
CREATE TABLE dbo.facultyLogin (
userid INT PRIMARY KEY NOT NULL,
password VARCHAR (50) NOT NULL
);
insert into dbo.facultyLogin(userid,password) values(1234,'surjit');
insert into dbo.facultyLogin(userid,password) values(5678,'karan');

--This table will contain login in formation for students
CREATE TABLE studentLogin (
userid INT PRIMARY KEY NOT NULL,
password VARCHAR (50) NOT NULL
);
insert into dbo.studentLogin(userid,password) values(1234,'surjit');
insert into dbo.studentLogin(userid,password) values(5678,'karan');

-- table containing faculty information
CREATE TABLE dbo.faculty (
staffId bigINT PRIMARY KEY,
staffName VARCHAR (50) NOT NULL,
dob DATE NOT NULL,
email VARCHAR (50) NOT NULL,
contact INT NOT NULL,
address VARCHAR (255) NOT NULL,
staffType VARCHAR (50) NOT NULL,
staffStatus VARCHAR (50) NOT NULL
);
insert into dbo.faculty values(1234,'henry','08/27/1970','henry@syr.edu',51633921,'111,NY,13210','teaching','active');
insert into dbo.faculty values(5678,'mark','12/20/1980','mark@syr.edu',223458,'171,MA,02115','non-teaching','active');

-- table containing student information
drop table dbo.student;
CREATE TABLE dbo.student (
studentId INT PRIMARY KEY,
studentName VARCHAR (50) NOT NULL,
dob DATE NOT NULL,
email VARCHAR (50) NOT NULL,
contact INT NOT NULL,
address VARCHAR (255) NOT NULL,
studentType VARCHAR (50) NOT NULL,
major VARCHAR (50) NOT NULL,
expectedGraduation DATE NOT NULL,
currentGPA FLOAT,
profileURL VARCHAR (255) NOT NULL
);
insert into dbo.student values(1234,'surjit','08/27/1994','surjit@syr.edu',531280,'444 westcott,13210','active','ads','05/15/2021',3.5,'linkedin.com/surjit');
insert into dbo.student values(5678,'karan','11/20/1995','karan@syr.edu',632281,'1337 madison Street,13210','active','ads','05/15/2021',3.2,'linkedin.com/karan');
insert into dbo.student values(2222,'abi','08/20/1994','abi@syr.edu',599230,'303 south beach street','active','CIS','05/15/2021',2.8,'linkedin.com/abi');
insert into dbo.student values(3344,'john','01/01/1993','john@syr.edu',21120,'1320 east fayette','active','CIS','05/15/2021',3.2,'linkedin.com/john');
insert into dbo.student values(5567,'mick','10/11/1996','mick@syr.edu',333800,'1021 lancaster
Final Implementation Report
ave','inactive','ee','12/15/2021',2.4,'linkedin.com/mick');

-- table containing employers information
CREATE TABLE dbo.employers(
employerId VARCHAR(50) PRIMARY KEY,
emloyerName VARCHAR (50) NOT NULL,
industryType VARCHAR(50),
employerType VARCHAR (50),
address VARCHAR (50) NOT NULL,
website VARCHAR(50) NOT NULL
);
insert into dbo.employers values('surjit','apple','electronics','private','seattle','www.apple.com')
insert into dbo.employers values('karan','google','search engine','private','texas','www.google.com')

-- table containing events information
CREATE TABLE dbo.events(
eventId INT PRIMARY KEY,
eventName VARCHAR (50) NOT NULL,
description VARCHAR (255) NOT NULL,
startDate DATE NOT NULL,
endDate DATE NOT NULL,
primaryApprover INT,
secondaryApprover INT,
host varchar(255)
CONSTRAINT FK_events FOREIGN KEY (primaryApprover) REFERENCES dbo.faculty (staffId)
);
insert into dbo.events values(1234,'resume building','learn resume building','12/09/2019','12/11/2019',1234,5678,'corney');
insert into dbo.events values(5678,'cover letter building','learn cover letter building','12/26/2019','11/26/2019',1234,5678,'venkat');
insert into dbo.events values(91011,'using linkedin correctly','learn how to use linkedin','12/15/2019','12/20/2019',1234,5678,'shane');

-- table containing enrolled events information
CREATE TABLE dbo.enrolledEvents(
enrollmentId INT PRIMARY KEY IDENTITY (1,1),
eventId INT,
Final Implementation Report
studentId INT,
approverId bigINT,
enrollmentStatus VARCHAR (50) NOT NULL,
attendance VARCHAR (50),
CONSTRAINT FK_approver FOREIGN KEY (approverId) REFERENCES dbo.faculty (staffId),
CONSTRAINT FK_student FOREIGN KEY (studentId) REFERENCES dbo.student (studentId),
CONSTRAINT FK_enrolledEvent FOREIGN KEY (eventId) REFERENCES dbo.events (eventId)
);

-- table containing jobs information
CREATE TABLE dbo.jobs(
jobId INT PRIMARY KEY,
jobName VARCHAR (50) NOT NULL,
description VARCHAR (255) NOT NULL,
jobType VARCHAR (50) NOT NULL,
location VARCHAR (50) NOT NULL,
applicationDeadline DATE NOT NULL,
jobURL VARCHAR (50) NOT NULL,
posterId VARCHAR(50),
CONSTRAINT FK_jobs FOREIGN KEY (posterId) REFERENCES dbo.employers (employerId)
);
insert into dbo.jobs values(1234,'software engineer intern','application development','intern','seattle','12/30/2019','apple.com/jobs/sei','surjit');
insert into dbo.jobs values(5678,'software engineer','application development','fulltime','seattle','12/30/2019','apple.com/jobs/se','surjit');
insert into dbo.jobs values(22345,'data science intern','analytics','intern','seattle','12/30/2019','google.com/jobs/dsi','karan');
insert into dbo.jobs values(19681,'data science','analytics','fulltime','seattle','12/30/2019','google.com/jobs/ds','karan');
insert into dbo.jobs values(33358,'embedded engineer','electrical','fulltime','seattle','12/30/2019','google.com/jobs/ee','karan');

-- table containing applied jobs information
CREATE TABLE dbo.appliedjobs(
applicationId INT PRIMARY KEY IDENTITY (1, 1),
jobId INT,
studentId INT,
Final Implementation Report
jobStatus VARCHAR (50) NOT NULL,
CONSTRAINT FK_appJobs FOREIGN KEY (jobId) REFERENCES dbo.jobs (jobId),
CONSTRAINT FK_jobStudent FOREIGN KEY (studentId) REFERENCES dbo.student (studentId)
);


--SQL Statements for Answering Major Data Questions

--1. Check application status for all students who applied for job
Select appj.applicationId,jb.jobName,stud.studentName,stud.email,stud.contact,stud.major,stud.expectedGraduation,stud.currentGPA,appj.jobStatus
FROM (select * from dbo.appliedjobs) appj JOIN (select * from dbo.student) stud on appj.studentId = stud.studentId
JOIN (select * from dbo.jobs) jb on appj.jobId=jb.jobId;

--2. Check total number of students enrolled per course
select count(*) as cnt,major from dbo.student group by major;

--3. Check total number of students placed per course
select count(stud.studentName) as cnt,stud.major
FROM (select * from dbo.appliedjobs) appj JOIN (select * from dbo.student) stud on appj.studentId = stud.studentId where appj.jobStatus='accepted'
group by stud.major;

--4. View detailed information of students and jobs who applied for that job when a employer is logged in
select appj.applicationId,appj.jobId,jb.jobName,stud.studentName,stud.dob,stud.email,stud.contact,stud.major,stud.expectedGraduation,stud.currentGPA,stud.profileURL,appj.jobStatus
FROM (select * from dbo.appliedjobs) appj JOIN (select * from dbo.student) stud on appj.studentId = stud.studentId
JOIN (select * from dbo.jobs) jb on appj.jobId=jb.jobId where jb.posterId='surjit';