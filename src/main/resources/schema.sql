drop table persona if exists;

create table persona (
 id integer auto_increment PRIMARY KEY ,
 primer_nombre varchar2(20) ,
 segundo_nombre varchar2(20),
 telefono varchar2(10)
);