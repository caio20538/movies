
# 🎬 MovieApp — Projeto Full Stack

MovieApp é um aplicativo full stack que combina um backend em Java 21 com Spring Boot e MongoDB, com um frontend em React para mostrar filmes, trailers e reviews. Os dados vêm do repositório [movieist/\_data](https://github.com/fhsinchy/movieist/tree/master/_data).

---

## Tecnologias usadas

**Backend:** Java 21, Spring Boot, MongoDB, Maven
**Frontend:** React, React Router, Axios, Bootstrap
**Infraestrutura:** Docker, Docker Compose

---

## Como rodar o projeto

**Pré-requisitos:** Docker e Docker Compose instalados
(Se quiser rodar localmente, precisa também de Java 21 e Node.js)

**Passos:**

1. Clone o repositório:
   `git clone https://github.com/seu-usuario/seu-repositorio.git`
   `cd seu-repositorio`

2. Rode tudo com Docker Compose:
   `docker-compose up --build`

Vai subir:

* MongoDB na porta 27017
* Backend Spring Boot na 8080
* Frontend React na 3000

---

## Endpoints principais da API

* **GET** `/api/v1/movies` — lista todos os filmes
* **GET** `/api/v1/movies/{imdbId}` — detalhes do filme
* **POST** `/api/v1/reviews` — cria review
* **GET** `/api/v1/reviews/{imdbId}` — lista reviews do filme

---

## Funcionalidades da aplicação

* Home com carrossel dos filmes
* Página de detalhes do filme (poster, sinopse, trailer)
* Seção de reviews com formulário e lista de comentários

---

## Dados usados

Os dados são do [movieist/\_data](https://github.com/fhsinchy/movieist/tree/master/_data), arquivos JSON convertidos para documentos MongoDB e importados manualmente ou via script.

---

## Testes

* Backend: testável via Postman, Insomnia ou curl
* Frontend: acessível pelo navegador após subir a aplicação

---

## Licença

Projeto open-source sob licença MIT.

---

## Autor

Desenvolvido por [Seu Nome](https://github.com/seu-usuario) 🚀

---

Quer ajuda com Dockerfiles, docker-compose ou scripts para importar os dados? É só pedir!
