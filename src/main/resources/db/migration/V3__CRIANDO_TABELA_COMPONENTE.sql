CREATE TABLE componente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    quantidade INT,
    box_id INT,
    FOREIGN KEY (box_id) REFERENCES box(id)
);