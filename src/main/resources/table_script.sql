DROP DATABASE if exists COURIER_DB;
CREATE DATABASE COURIER_DB;
USE  COURIER_DB;


create table Booking(
	booking_id INT primary key auto_increment,
	weight INT,
	booking_date DATE,
	source VARCHAR(20),
	destination VARCHAR(20),
	priority VARCHAR(20),
	booking_amount FLOAT(9,2),
	status VARCHAR(20) NOT NULL
);


INSERT INTO Booking VALUES (1001, 230,SYSDATE()-INTERVAL 177 DAY,"MUMBAI", "DELHI","HIGH",300.0,"BOOKED");
INSERT INTO Booking VALUES (1002, 454,SYSDATE()-INTERVAL 3 DAY,"KOLKATA","MUMBAI","LOW", 608.0,"DISPATCHED");
INSERT INTO Booking VALUES (1003, 68,SYSDATE()-INTERVAL 34 DAY,"DELHI","MYSORE", "MEDIUM", 200.0,"BOOKED");
INSERT INTO Booking VALUES (1004, 346,SYSDATE()-INTERVAL 65 DAY,"MYSORE","BANGALORE", "HIGH", 392.0,"IN_TRANSIT");
INSERT INTO Booking VALUES (1005, 2332,SYSDATE()-INTERVAL 45 DAY,"BANGALORE","KOLKATA", "MEDIUM", 1500.0,"DELIVERED");

USE  COURIER_DB;
select * from Booking;
