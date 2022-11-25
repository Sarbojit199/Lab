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


desc movie;
#prove that entity integrity constant is ensured by both tables
insert into Movie values('11','Joker','LT',150); 		#this entity will not allow because referntial integrity constrainsts will not allow
insert into CUSTOMER values(null,'Rakesh','Aiyar','PM',364673);			#this entity will not allowed because integrity constraints not satisfied


#prove that referential integrity constraints ensured by both the tables
insert into Movie values('11','A01','harry' ,'LO',200); #here cust_id 'A01' PRESRNT IN customer table 

#prove that domain integrity constraints ensured by movie tables
insert into Movie values('12', 'A01','gone','DD',BB); #this entity not allow because data type  of domain includes integer not match

select Title from Movie where Price between 100 and 200;
select Star from Movie where Star='TC' or Star ='RG';
select * FROM CUSTOMER  WHERE AREA LIKE '%A';
select Title from Movie where Price<200 and LENGTH(TITLE) = 4;
SELECT Title,Price, Price*1.10 as Increment from Movie;
SELECT Fname from CUSTOMER WHERE PHONE IS NULL;
UPDATE CUSTOMER SET Phone='6291259' where phone IS NULL;
select distinct CUST_id from Movie;
delete FROM CUSTOMER WHERE Cust_id='A01';
DELETE FROM MOVIE WHERE MV_no=1;

