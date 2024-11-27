create table edificacoes(
    id bigint not null auto_increment,
    nome varchar(255) not null,
    endereco varchar(255) not null,
    tipo varchar(100) not null,
    status varchar(100) not null,

    primary key(id)
);