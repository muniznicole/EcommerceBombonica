-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

insert into usuario (id, nome, email, senha, cpf) 
values(1,'Nicole Araujo Muniz','muniznicole@unitins.br','NI1234','024.523.441-17');

insert into estado (nome) values('Tocantins');
insert into estado (nome) values('Bahia');
insert into estado (nome) values('São Paulo');
insert into estado (nome) values('Pará');

insert into municipio (nome, id_estado) values( 'Palmas', 1);
insert into municipio (nome, id_estado) values( 'Serrinha', 2);
insert into municipio (nome, id_estado) values( 'Pilar do Sul', 3);
insert into municipio (nome, id_estado) values( 'Canaa dos Carajas', 4);