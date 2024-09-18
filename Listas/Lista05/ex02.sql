create database db_floricultura;
use db_floricultura;

create table tb_flores(
	id int primary key,
    especie varchar(255),
    preco decimal(5,2)
);

insert into tb_flores values(1,'Rosas', 350.5);
insert into tb_flores values(2,'Tulipas', 300.0);

select * from tb_flores;