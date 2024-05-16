# Cria as bases de dados locais, limpando as que já existem

# Cria a tabela de ferramentas
CREATE DATABASE IF NOT EXISTS TBFerramentas;
USE TBFerramentas;
DROP TABLE IF EXISTS TBFerramentas;
CREATE TABLE TBFerramentas (
	id INTEGER NOT NULL,
	nome VARCHAR(100),
	preco DOUBLE,
	PRIMARY KEY(id)
);

# TODO: Tabela de amigos