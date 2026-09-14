CREATE DATABASE IF NOT EXISTS petshop;
USE petshop;

CREATE TABLE clientes (
    id_cliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(50) NOT NULL,
    telefone VARCHAR(20)
);

CREATE TABLE pets (
    id_pet INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_pet VARCHAR(50) NOT NULL,
    raca VARCHAR(50),
    porte VARCHAR(20),
    idade INT,
    id_cliente INT NOT NULL,

    FOREIGN KEY (id_cliente)
        REFERENCES clientes(id_cliente)
);

CREATE TABLE servicos (
    id_servico INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_servico VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE adicionais (
    id_adicional INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_adicional VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE agendamentos (
    id_agendamento INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_pet INT NOT NULL,
    id_servico INT NOT NULL,
    data_agendamento DATE NOT NULL,
    horario TIME NOT NULL,
    transporte VARCHAR(20) NOT NULL,
    status VARCHAR(20) DEFAULT 'AGENDADO',

    FOREIGN KEY (id_pet)
        REFERENCES pets(id_pet),

    FOREIGN KEY (id_servico)
        REFERENCES servicos(id_servico)
);

CREATE TABLE agendamento_adicionais (
    id_agendamento INT NOT NULL,
    id_adicional INT NOT NULL,

    PRIMARY KEY (id_agendamento, id_adicional),

    FOREIGN KEY (id_agendamento)
        REFERENCES agendamentos(id_agendamento),

    FOREIGN KEY (id_adicional)
        REFERENCES adicionais(id_adicional)
);