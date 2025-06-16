# Projeto-Spring
Projeto full-stack React e Spring

application.properties: Armazena as configurações do projeto como a port por exemplo, um projeto pode conter mais de um arquivo para armazernar as configurações

pom.xml: Contém as informações do projeto, incluindo dependências como a do lombok, devTools, etc. No React essas dependecias seriam colocadas no package.json. O maven, cria um repositorio local na maquina, que por padrao fica sempre na pasta do usuario (pasta .m2)

Primeira coisa a definir é a estrutura de pacotes, que devem estar dentro da pasta principal do backend

Pastas padrao MVC:

Controle: Classes de controle receberao todas as requisições de clientes --> Requisições de banco de dados e api não são passadas nessa pasta --> Recebe as coisas e repassa para outros arquivos/pastas

Servico: São as regras de negocio da aplicação -> Engloba as pastas Modelo e Repositorio --> Sempre deve conter um @Service para o Spring identificar o arquivo como serviço

Modelo: Recebe a requisição das entidades Pessoa

Repository: Classes que possuem codigos com requisição com banco de dados

Configuração:

Security:

Exception:

Repositorio: É uma classe que vai gerenciar o banco de dados da aplicação

Vamos utilizar o insomnia/postman para testar as requisições API

