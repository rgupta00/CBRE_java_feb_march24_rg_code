create table books(id int not null primary key auto_increment,
 isbn varchar(20) not null,
title varchar(20) not null,
author varchar(20) not null,
price double not null);

 insert into books(isbn, title,author,price) values('121A','java basics','raj',240);