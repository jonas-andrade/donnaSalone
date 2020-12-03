create database donnaSalone;
use donnaSalone;

create table admin (
idAdmin int auto_increment,
login varchar(12) not null,
pass varchar(5) not null,
primary key (idAdmin) );

create table client (
idClient int auto_increment,
nomeClient varchar(30) not null,
sexoClient varchar(2),
dateClient varchar(12),
emailClient varchar(35),
telephoneClient varchar(30),
primary key (idClient) );

create table address (
idAddress  int auto_increment, 
street     varchar(20), 
neighborhood varchar(30),
county    varchar(30), 
state     varchar(30), 
country   varchar(30), 
nationality varchar(30),
primary key (idAddress) );


create table service (
idService int auto_increment,
nomeService varchar(20), 
precoService   varchar(10),
typeService    char(1),
describeService  text,  
primary key (idService) );


insert into admin (login,pass) values ("jonas","admin");
insert into client (nomeClient,sexoClient,dateClient,emailClient,telephoneClient) values ("client teste","M","0000-00-00","teste@email.com","00000000000");
insert into service (nomeService,precoService,typeService,describeService) values ("service test","12,20","A","teste teste");