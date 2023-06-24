CREATE TABLE box (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(255),
    armario_id INT,
    FOREIGN KEY (armario_id) REFERENCES armario(id)
);
