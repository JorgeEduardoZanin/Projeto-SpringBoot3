###Projeto Spring Boot com Hibernate, JPA e Banco de Dados H2
Este é um projeto Spring Boot Java que utiliza Hibernate e JPA para a camada de persistência e um banco de dados H2 para fins de teste. O projeto implementa um sistema de gestão de pedidos com funcionalidades CRUD (Criar, Ler, Atualizar, Excluir) para entidades de usuário, produtos, categorias e pedidos.

###Entidades
O projeto inclui as seguintes entidades:

Usuário: Representa um usuário do sistema.
Produto: Representa um produto disponível para compra.
Categoria: Representa uma categoria de produtos.
Pedido: Representa um pedido feito por um usuário.
Item do Pedido (OrderItem): Representa um item individual em um pedido, contendo informações sobre o produto, quantidade e preço.
Status do Pedido (OrderStatus): Enumeração que define os possíveis estados de um pedido.
Pagamento (Payment): Representa o pagamento associado a um pedido.
###Estrutura do Projeto
O projeto segue a estrutura típica de uma aplicação Spring Boot, com as seguintes camadas:

Camada de Serviços (Services): Contém a lógica de negócios da aplicação, responsável por orquestrar as operações entre os recursos e os repositórios.
Camada de Recursos (Resources): Define os endpoints da API RESTful e lida com as requisições HTTP.
Camada de Repositórios (Repositories): Responsável pela interação com o banco de dados, incluindo operações CRUD e consultas.
###Dependências
O projeto utiliza as seguintes dependências:

Spring Boot Starter Web: Para construção de aplicativos web.
Spring Boot Starter Data JPA: Para integração com o Hibernate e JPA.
H2 Database: Para armazenamento de dados em um banco de dados H2 em memória.
Spring Boot Starter Test: Para testes automatizados.
###Executando o Projeto
Clone o repositório para sua máquina local.
Importe o projeto em sua IDE preferida (Eclipse, IntelliJ, etc.).
Certifique-se de ter o JDK e o Maven instalados.
Execute o comando mvn clean install na raiz do projeto para compilar e construir o pacote JAR.
Execute o comando java -jar target/nome-do-arquivo.jar para iniciar a aplicação.
###Endpoints da API
O projeto expõe os seguintes endpoints da API RESTful:

/usuarios: Manipula operações CRUD para entidade de usuário.
/produtos: Manipula operações CRUD para entidade de produto.
/categorias: Manipula operações CRUD para entidade de categoria.
/pedidos: Manipula operações CRUD para entidade de pedido.
A API permite operações como criação, leitura, atualização e exclusão de recursos, bem como procura por ID e procura por todos os recursos na tabela correspondente.

###Contribuindo
Sinta-se à vontade para contribuir com este projeto! Siga os padrões de codificação existentes e envie uma solicitação de pull com suas melhorias.

Espero que este README forneça uma visão geral clara do projeto e como executá-lo. Se houver alguma dúvida ou sugestão, não hesite em entrar em contato.

Obrigado por usar este projeto! 😊
