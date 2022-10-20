INSERT INTO sr_university(university_name)VALUES
('TUIT sht');
INSERT INTO sr_university(university_name)VALUES
('SamGU frks');

INSERT INTO sr_faculty(university_id,faculty_name)VALUES
(1,'noDasturiy injiring');
INSERT INTO sr_faculty(university_id,faculty_name)VALUES
(1,'slave faculty');
INSERT INTO sr_faculty(university_id,faculty_name)VALUES
(2,'noComputer injiring');
INSERT INTO sr_faculty(university_id,faculty_name)VALUES
(2,'slave faculty2');

INSERT INTO sr_student(sur_name,given_name,middle_name,
date_of_birth,passport_seria,passport_number,passport_date)VALUES
('Terran','Treyaris','Balingan','2000-04-16','1234','123456','2016-05-30');

INSERT INTO sr_student_document(std_number,std_date,expired_date,student_id
,faculty_id,student_form)VALUES('123456','2017-03-29','2021-06-19',1,1,1);



SELECT *FROM sr_faculty
DELETE FROM sr_faculty
DELETE FROM sr_student
DELETE FROM sr_student_document
DELETE FROM sr_university