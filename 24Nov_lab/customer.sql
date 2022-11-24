use newdb;

CREATE TABLE CUSTOMER(Cust_id Varchar(5) primary key not null,Fname Varchar (15) not null,
Lname   Varchar(15) not null,Area char(3) not null,
Phone   bigint(10),DOB  Date,Payment NUMERIC(6,2));

INSERT INTO CUSTOMER VALUES
('A01', 'Ivan' ,'Ross','SA' ,6125467,'1886-01-15' ,'800.5'), 
('A02', 'Vandana' , 'Ray', 'MU', 5560379 ,'1887-04-19', '1000.75'),
('A03', 'Pramada', 'Jauguste', 'DA', 4560389, '1967-04-14', '500.00'),
('A04' ,'Basu' ,'Navindi' ,'BA' ,6125401 ,'1956-02-16', '860.00');

SELECT * FROM CUSTOMER;
insert into CUSTOMER(DOB) values(curdate());
SELECT * FROM CUSTOMER;
update CUSTOMER set Phone='123456' where Cust_id = 'A02';
update CUSTOMER set DOB='1999-08-11' where Cust_id = 'A04';
SELECT * FROM CUSTOMER;
DELETE FROM CUSTOMER WHERE Cust_id='A03';
DELETE FROM CUSTOMER WHERE Cust_id='A04';
INSERT INTO CUSTOMER VALUES
('A07', 'Ivn' ,'Ross','SA' ,612546,'1886-01-15' ,'800.5'), 
('A09', 'Vndana' , 'Ray', 'MT', 556079 ,'1887-04-19', '1000.75'),
('A010', 'Prmada', 'Jaugust', 'DM', 460389, '1967-04-14', '500.00'),
('A011' ,'Bsu' ,'Navind' ,'BA' ,612401 ,'1956-02-16', '860.00');
update CUSTOMER set Phone='567895' where Cust_id = 'A07';
DELETE FROM CUSTOMER WHERE Cust_id='A011';





 
