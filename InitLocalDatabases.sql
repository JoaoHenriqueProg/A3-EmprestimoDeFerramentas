# Cria as bases de dados locais, limpando as que já existem

# Cria a tabela de ferramentas
CREATE DATABASE IF NOT EXISTS TBFerramentas;
USE TBFerramentas;
DROP TABLE IF EXISTS TBFerramentas;
CREATE TABLE TBFerramentas (
	id INTEGER NOT NULL,
	nome VARCHAR(100),
	preco DOUBLE,
    quantidade INTEGER,
	PRIMARY KEY(id)
);

# Cria a tabela de amigas
CREATE DATABASE IF NOT EXISTS TBAmigos;
USE TBAmigos;
DROP TABLE IF EXISTS TBAmigos;
CREATE TABLE TBAmigos(
	id INTEGER NOT NULL,
	nome VARCHAR(100),
	endereco VARCHAR(100),
	numero VARCHAR(11),
	PRIMARY KEY(id)
);

# Cria a tabela de empréstimos
CREATE DATABASE IF NOT EXISTS TBEmprestimos;
USE TBEmprestimos;
DROP TABLE IF EXISTS TBEmprestimos;
CREATE TABLE TBEmprestimos(
	id INTEGER NOT NULL,
	amigo INT,
	ferramenta INT,
	quantidade INT,
	data_inicio DATE DEFAULT (CURRENT_DATE),
	data_final DATE,
	PRIMARY KEY(id)
);
