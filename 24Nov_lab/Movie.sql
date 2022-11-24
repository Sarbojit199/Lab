use newdb;
CREATE TABLE MOVIE(Mv_no int, 
foreign key(Cust_id) references CUSTOMER(Cust_id), 
Title varchar(10) not null, Star varchar(10) not null, Price int(4));

INSERT INTO MOVIE VALUES
(1 ,'Blody','abc' ,55,'A02'),
(2, 'The Firm','TC', 200, 'A03'),
(3, 'PrettyWo' ,'RG', 151,'A04'),
(4, 'HomeALONE' ,'MC', 150,'A06'),
(5 ,'The Fugitive','MF' ,200,'A05'),
(6, 'Coma' ,'MD', 100, 'A01');

select Title from Movie where Price>100 and Price<200;
select Star from Movie where Star='TC' or Star ='RG';
select * FROM CUSTOMER  WHERE AREA LIKE '%A';
select Title from Movie where Price<200 and LENGTH(TITLE) = 4;
SELECT Title,Price, Price*1.10 as Increment from Movie;
SELECT Fname from CUSTOMER WHERE PHONE IS NULL;
UPDATE CUSTOMER SET Phone='6291259' where phone IS NULL;
select distinct CUST_id from Movie;
delete FROM CUSTOMER WHERE Cust_id='A01';
DELETE FROM MOVIE WHERE MV_no=1;

