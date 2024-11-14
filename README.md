O sistema ListGames é uma aplicação web desenvolvida em Java utilizando o framework Spring Boot. Ele permite que os
usuários criem e gerenciem listas de jogos, adicionando e removendo jogos de suas listas.

Requisitos do Sistema

    Java 21
    Spring Boot 3.3.5
    Maven 4.0.0
    Banco de dados H2 ou PostgreSQL

Funcionalidades do Sistema

    Criar e gerenciar listas de jogos
    Adicionar e remover jogos de listas
    Visualizar listas de jogos
    Buscar jogos por nome ou descrição

Arquitetura do Sistema

    O sistema é dividido em três camadas:
        Camada de apresentação: responsável por lidar com as requisições e respostas do usuário
        Camada de negócios: responsável por processar as requisições e realizar as operações de negócios
        Camada de dados: responsável por armazenar e recuperar os dados do sistema

Tecnologias Utilizadas

    Java 21
    Spring Boot 3.3.5
    Maven 4.0.0
    H2 ou PostgreSQL como banco de dados
    Spring Data JPA para persistência de dados
    Spring Web para lidar com requisições e respostas

Instalação e Execução

    Clone o repositório do sistema
    Execute o comando mvn clean install para compilar e empacotar o sistema
    Para executar o sistema com o banco de dados H2, execute o comando java -jar target/listgames-0.0.1-SNAPSHOT.jar
    Para executar o sistema com o banco de dados PostgreSQL, siga as etapas abaixo:
        Certifique-se de ter o Docker instalado em sua máquina
        Certifique-se de ter o Docker Compose instalado em sua máquina
        Abra o terminal na pasta raiz do projeto
        Execute o comando docker-compose up -d para iniciar o contêiner do PostgreSQL
        Execute o comando java -jar target/listgames-0.0.1-SNAPSHOT.jar --spring.datasource.url=jdbc:postgresql://localhost:5432/listgames --spring.datasource.username=listgames --spring.datasource.password=listgames para executar o sistema com o banco de dados PostgreSQL

Contribuições

    O sistema é um projeto de código aberto e aceita contribuições de qualquer pessoa
    Para contribuir, basta criar um fork do repositório e enviar um pull request com as alterações desejadas

Banco de Dados H2 para Testes

    O sistema inclui um banco de dados H2 para testes
    O banco de dados H2 é uma solução de banco de dados em memória que é usada para testes e desenvolvimento
    Ele é inicializado automaticamente quando o sistema é executado com o banco de dados H2

Banco de Dados PostgreSQL com Docker Compose

    O sistema pode ser executado com o banco de dados PostgreSQL usando o Docker Compose
    Para subir o banco de dados PostgreSQL, siga as etapas abaixo:
        Certifique-se de ter o Docker instalado em sua máquina
        Certifique-se de ter o Docker Compose instalado em sua máquina
        Abra o terminal na pasta raiz do projeto
        Execute o comando docker-compose up -d para iniciar o contêiner do PostgreSQL
        O banco de dados PostgreSQL será acessível na porta 5432
        Para gerenciar o banco de dados PostgreSQL, utilize o pa

Observações

    O sistema ListGames é um projeto de estudos e está em constante evolução
    A parte de testes e exceções será melhorada com o passar do tempo
    Qualquer contribuição ou sugestão é bem-vinda para melhorar o sistema
