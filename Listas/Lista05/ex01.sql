create database db_empresa_eventos;
use db_empresa_eventos;

create table tb_eventos(
	id int primary key,
    nome varchar(255),
    localizacao varchar(255),
    preco_ingresso decimal(6,2)
);

insert into tb_eventos values(1, 'Bienal', 'SP - Sao Paulo', 23.4);
insert into tb_eventos values(2, 'Conferência Praise Internacional de Dança Cristã 2024', 'Bela Vista', 24.4);

select * from tb_eventos;