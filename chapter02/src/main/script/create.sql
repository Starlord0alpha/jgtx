create database if not exists demo; 

use demo;

-- drop table if exists customer;
-- 
-- create table customer
-- (
--     id bigint not null auto_increment comment 'id自增主键',
--     name varchar(255) not null comment '客户名称',
--     contact varchar(255) not null comment '联系人',
--     telephone varchar(255) comment '电话号码',
--     email varchar(255) comment '邮箱地址',
--     remark text comment '备注',
--     primary key (id)
-- ) comment '客户端' engine=InnoDB CHARSET=utf8;

truncate table customer;
insert into customer values ('1', 'customer1', 'Jack', '13512345678', 'jack@gmail.com', null);
insert into customer values ('2', 'customer2', 'Rose', '13623456789', 'rose@gmail.com', null);
