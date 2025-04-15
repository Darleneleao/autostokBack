# Autostok Back-End

Este projeto é o back-end do sistema **Autostok**, responsável por fornecer a API que gerencia os dados de estoque, usuários, armários, caixas e itens. Ele serve como ponte entre o front-end e o banco de dados.

## 📌 Funcionalidades

- **Autenticação de Administradores e Usuários**
- **CRUD de Itens, Caixas, Armários e Usuários**
- **Validações de segurança e controle de acesso**
- **APIs RESTful para integração com o front-end**

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** JavaScript (Node.js)
- **Framework:** Spring Boot
- **Banco de Dados:** PostgreSQL
- **Autenticação:** JWT (JSON Web Token)

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Darleneleao/autostokBack.git

2. **Instale as dependências:**

   ```bash
    npm install
   

3. **Configure as variáveis de ambiente:**

- Crie um arquivo .env na raiz do projeto.
- Adicione as seguintes variáveis (exemplo):

   ```ini

    DB_HOST=localhost
    DB_USER=root
    DB_PASSWORD=sua_senha
    DB_NAME=autostok
    PORT=8080
    JWT_SECRET=umSegredoSeguro
    
4. **Configure o banco de dados:**

- Crie o banco de dados no MySQL com o nome definido em DB_NAME.
- Importe o arquivo SQL caso exista (ex: autostok.sql).

5. **Inicie o servidor:**

    ```bash
    npm start
    
A API estará disponível em http://localhost:8080.

