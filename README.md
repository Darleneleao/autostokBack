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
- [Yarn](https://classic.yarnpkg.com/lang/en/) ou [npm](https://www.npmjs.com/)
- [MongoDB](https://www.mongodb.com/try/download/community) (ou acesso a uma instância online)

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

### ⚙️ Configuração

Crie um arquivo `.env` na raiz do projeto com as variáveis de ambiente necessárias. Exemplo básico:

```env
PORT=3001
MONGODB_URI=mongodb://localhost:27017/autostok
```

> ⚠️ Verifique se o nome da variável e a porta estão corretos conforme usado no seu código.

### ▶️ Executando o Projeto

Para iniciar o servidor em modo de desenvolvimento:

```bash
npm run dev
```

Ou em modo padrão:

```bash
npm start
```

O backend estará disponível em:

```
http://localhost:8000
```

