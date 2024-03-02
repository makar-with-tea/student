--liquibase formatted sql

create table student
(
    id           uuid primary key,
    name         varchar(255),
    surname  varchar(1000),
    secondName     varchar(255),
    course        varchar(255)
);
--rollback drop table product;
