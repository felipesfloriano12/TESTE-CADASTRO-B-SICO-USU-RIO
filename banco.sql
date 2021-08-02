CREATE SCHEMA RHFcadastrobasico;


create table RHFcadastrobasico.usuario
(
	id bigserial not null primary key,
	codigo integer not null,
	nome character varying(50),
	data_Nascimento date,
	img_id bigint references RHFcadastrobasico.imagens (id)
);

create table RHFcadastrobasico.imagens
(
	id  bigserial not null primary key,
	nome_img varchar(50) not null default ' ',
    tipo_img varchar(25) not null,
    img BYTEA not null
);