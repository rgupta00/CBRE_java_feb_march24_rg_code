
create table product_table
(
	id int not null primary key auto_increment, 
	name varchar(80) not null, 
	price DECIMAL(10,2) not null,
 	isAvailable TINYINT not null
);

insert into product_table(name, price, isAvailable) values('laptop',56777,1);


