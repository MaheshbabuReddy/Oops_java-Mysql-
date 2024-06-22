show databases;
USE mahesh;

CREATE TABLE Customer (
    Customer_ID  varchar(10) primary key,
    Product  varchar(20) Not NULL ,
    Amount int NOT NULL
);

CREATE TABLE Product (
    Product_ID  varchar(10) primary key,
    Customer_ID varchar(10),
    FOREIGN KEY (Customer_ID) REFERENCES Customer(Customer_ID),
    Product  varchar(20) Not NULL ,
    Price int NOT NULL
);
insert into  Product values('10L1','1D1','Laptop' , 50000);
insert into  Product values('10T2','1D2','TV', 21000);
insert into  Product values('10F3','1D3','Fridge' ,40000);
insert into  Product values('10S4','1D4','Smart Phone',21000);  

select * from Product;

insert into  Customer values('1D1','Laptop' , 45000);
insert into  Customer values('1D2','TV', 25000);
insert into  Customer values('1D3','Fridge' , 50000);
insert into  Customer values('1D4','Smart Phone' , 20000); 

select * from Customer;
--Counting  no of Customers
SELECT Customer_ID, COUNT(Customer_ID) AS no_customers
FROM Customer 
GROUP BY Customer_ID;
--Joining 
select * from Customer as c  FULL OUTER JOIN  Product as p on c.Customer_ID = P.Product_ID;
rollback --Where it is used to Undo the changes
