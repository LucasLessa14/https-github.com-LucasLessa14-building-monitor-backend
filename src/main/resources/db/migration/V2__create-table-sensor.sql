CREATE TABLE sensores (
    id BIGINT NOT NULL AUTO_INCREMENT,
    id_edificacao BIGINT NOT NULL, -- Relacionamento com a tabela edificacoes

    nome VARCHAR(255) NOT NULL,
    tipo_sensor VARCHAR(100) NOT NULL,
    valor_atual VARCHAR(100) NOT NULL,
    unidade VARCHAR(100) NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (id_edificacao) REFERENCES edificacoes(id) ON DELETE CASCADE ON UPDATE CASCADE
);
