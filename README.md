# Sistema de Ordem de Serviço

Projeto desenvolvido em Java com Spring Boot para gerenciamento de ordens de serviço.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- Banco H2
- Postman

---

## Funcionalidades

- Criar ordem de serviço
- Listar ordens de serviço
- Buscar ordem por ID
- Atualizar ordem
- Deletar ordem
- Validação de dados
- Tratamento global de exceções

---

## Estrutura do Projeto

```bash
controller
service
repository
model
dto
exception
enums
```

---

## Endpoints

### Criar Ordem de Serviço

POST /ordens

### Listar Todas

GET /ordens

### Buscar por ID

GET /ordens/{id}

### Atualizar

PUT /ordens/{id}

### Deletar

DELETE /ordens/{id}

---

## Exemplo JSON

```json
{
  "titulo": "Troca de cabo de rede",
  "descricao": "Cliente está sem internet",
  "prioridade": "ALTA"
}
```

---

## Como Executar

1. Clonar o repositório
2. Abrir no IntelliJ
3. Executar a classe:

```bash
OrdemservicoApplication
```

4. A API estará disponível em:

```bash
http://localhost:8080
```

---

## Autores

Ryan Warley alves fernandes - 125111385720

João Vittor Medeiros Araújo - 124116941
