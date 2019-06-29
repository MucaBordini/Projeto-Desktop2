

CREATE TABLE public.jogo (
    jogo_nome varchar(100) PRIMARY KEY NOT NULL,
    jogo_dev varchar(50) NOT NULL,
    jogo_gen varchar(50) NOT NULL
);


CREATE TABLE public.usuario (
    usu_nome varchar(150) NOT NULL,
    usu_email varchar(100) PRIMARY KEY NOT NULL,
    usu_pass varchar(100) NOT NULL,
    usu_pass_conf varchar(100) NOT NULL
);

CREATE TABLE public.avaliacao (
    nota double precision,
    comentario varchar(300),
    usu_email_fk varchar(50) REFERENCES usuario (usu_email),
    jogo_nome_fk varchar(100) REFERENCES jogo (jogo_nome),
    PRIMARY KEY (usu_email_fk, jogo_nome_fk)
);


INSERT INTO usuario (usu_nome, usu_email, usu_pass, usu_pass_conf)
VALUES
    ('Sandro', 'sanders@mail.com', '1234', '1234');

INSERT INTO jogo (jogo_nome, jogo_dev, jogo_gen)
VALUES
    ('Dauntleis', 'EPIC', 'RPG');

INSERT INTO avaliacao (nota, comentario, usu_email_fk, jogo_nome_fk)
VALUES
    (8.75, 'Bom de mais', 'sanders@mail.com', 'Dauntleis');