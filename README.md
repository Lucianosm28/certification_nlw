# Certification Nlw

# Sobre o projeto

Certification Nlw é uma aplicação backend em Java construída durante a 14ª edição da Next Level Week, evento organizado pela Rocketseat no seu canal do Youtube.

A aplicação consiste em realizar uma certificação para um usuário, o estudante vai inserir o email e a tecnologia que ele quer para uma prova, perguntas serão listadas com alternativas para escolher, logo após ele responder as perguntas, vai aparecer a quantidade de acertos que ele fez. Também com isso mostar um ranking top 10 de notas dos melhores alunos cadastrados dentro do banco de dados.

## Modelo conceitual
![Modelo Conceitual](https://github.com/Lucianosm28/Imagens/blob/main/Imagens/Assets/certification_nlw%20diagrama.jpg)

# Tecnologias utilizadas
- Java
- Spring 
- Maven
- Rest Client
- Postgres
- Docker

# Como executar o projeto

Pré-requisitos: Java 17

```bash
# Clonar repositório(Exemplo: Git)
git clone https://github.com/Lucianosm28/certification_nlw.git

# Entrar na pasta do projeto back end (Exemplo, coloque o endereço onde está guardado a pasta do projeto certification_nlw)
cd C:\Users\(seu nome de usuário)\Desktop\Projetos java\certification_nlw

# Executar o projeto(No terminal do seu editor de código ou IDE, exemplo: VsCode, Intellij...)
mvn spring-boot:run

# Inicializar o banco de dados(No terminal do seu editor de código ou IDE)
docker-compose up -d
```

# Autor

Educador(a) da Rocketseat

Daniele Leão

https://github.com/danileao
