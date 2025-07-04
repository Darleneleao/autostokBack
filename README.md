# Autostok Back-End

Este projeto é o back-end do sistema **Autostok**, responsável por fornecer a API que gerencia os dados de estoque, usuários, armários, caixas e itens. Ele serve como ponte entre o front-end e o banco de dados.

## 📌 Funcionalidades

- **Autenticação de Administradores e Usuários**
- **CRUD de Itens, Caixas, Armários e Usuários**
- **Validações de segurança e controle de acesso**
- **APIs RESTful para integração com o front-end**

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Framework:** Spring Boot
- **Banco de Dados:** PostgreSQL
- **Autenticação:** JWT (JSON Web Token)

## 🚀 Como Executar o Projeto Backend

Siga os passos abaixo para rodar o backend localmente.

### ✅ Pré-requisitos

Antes de começar, você precisa ter instalado na sua máquina:

- [Node.js (versão recomendada: 18+)](https://nodejs.org/)
- [Git](https://git-scm.com/)
- [PostgreSQL](https://www.postgresql.org/download/) (versão 13 ou superior)
- [Yarn](https://classic.yarnpkg.com/lang/en/) ou [npm](https://www.npmjs.com/)

### 🔧 Instalação

1. Clone este repositório:

```bash
git clone https://github.com/Darleneleao/autostokBack.git
```

2. Acesse o diretório do projeto:

```bash
cd autostokBack
```

3. Instale as dependências:

Usando **npm**:

```bash
npm install
```

Ou usando **yarn**:

```bash
yarn install
```

### ⚙️ Configuração do Banco de Dados

1. Crie um banco de dados no PostgreSQL com o nome desejado, por exemplo:

```sql
CREATE DATABASE autostok;
```

2. Crie um arquivo `.env` na raiz do projeto com as variáveis de ambiente necessárias. Exemplo:

```env
PORT=8000
DB_HOST=localhost
DB_PORT=5432
DB_USER=seu_usuario_postgres
DB_PASSWORD=sua_senha_postgres
DB_NAME=autostok
```

> ⚠️ Substitua `seu_usuario_postgres` e `sua_senha_postgres` pelas suas credenciais reais.

3. Execute as **migrations** ou scripts SQL, se houver, para criar as tabelas no banco.

### ▶️ Executando o Projeto

Para iniciar o servidor:

```bash
npm start
```

Ou, se houver suporte a modo de desenvolvimento:

```bash
npm run dev
```

A API estará disponível em:

```
http://localhost:8000
```
