# Sistema de Ordem de Serviço

## Descrição

Projeto desenvolvido em Java com Spring Boot para gerenciamento de Ordens de Serviço.

O sistema permite o cadastro, consulta, atualização e remoção de ordens de serviço, auxiliando no controle e acompanhamento das atividades realizadas.

---

## Problema Resolvido

Muitas empresas ainda realizam o controle de atendimentos e serviços de forma manual ou utilizando planilhas, dificultando o acompanhamento das solicitações e o controle do status de cada atividade.

Este sistema foi desenvolvido para centralizar e organizar o gerenciamento das Ordens de Serviço, proporcionando maior controle e rastreabilidade do processo.

---

## Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* Banco de Dados H2
* JUnit
* Mockito
* Postman

---

## Funcionalidades

* Criar Ordem de Serviço
* Listar Ordens de Serviço
* Buscar Ordem de Serviço por ID
* Atualizar Ordem de Serviço
* Excluir Ordem de Serviço
* Validação de dados
* Tratamento global de exceções
* Controle de status da Ordem de Serviço

---

## Estrutura do Projeto

```text
src
├── controller
├── service
├── repository
├── model
├── dto
├── exception
└── enums
```

---

## Endpoints

### Criar Ordem de Serviço

```http
POST /ordens
```

### Listar Todas as Ordens

```http
GET /ordens
```

### Buscar Ordem por ID

```http
GET /ordens/{id}
```

### Atualizar Ordem

```http
PUT /ordens/{id}
```

### Excluir Ordem

```http
DELETE /ordens/{id}
```

---

## Exemplo de Requisição

```json
{
  "titulo": "Troca de cabo de rede",
  "descricao": "Cliente está sem internet",
  "prioridade": "ALTA"
}
```

---

## Como Executar o Projeto

### Pré-requisitos

* Java 21
* Maven
* Git

### Clonar o Repositório

```bash
git clone https://github.com/Ryanwarley/ordem-servico-backend.git
```

### Entrar na Pasta do Projeto

```bash
cd ordem-servico-backend/backend
```

### Executar a Aplicação

```bash
mvn spring-boot:run
```

ou

```bash
./mvnw spring-boot:run
```

---

## Executar os Testes Unitários

```bash
mvn test
```

ou

```bash
./mvnw test
```

---

## Banco de Dados H2

O projeto utiliza o banco de dados H2 em memória para facilitar os testes e execução da aplicação.

---

## Princípios Aplicados

Durante o desenvolvimento foram aplicados conceitos de:

* Engenharia de Software
* Orientação a Objetos
* Princípios SOLID
* Arquitetura em Camadas
* Testes Unitários
* Padrões de Projeto

---

## Autores

**Ryan Warley Alves Fernandes** – 125111385720

**João Vittor Medeiros de Araújo** – 124116941
