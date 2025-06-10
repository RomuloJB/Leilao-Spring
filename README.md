# Projeto-Spring
Projeto full-stack React e Spring

application.properties: Armazena as configurações do projeto como a port por exemplo, um projeto pode conter mais de um arquivo para armazernar as configurações

pom.xml: Contém as informações do projeto, incluindo dependências como a do lombok, devTools, etc. No React essas dependecias seriam colocadas no package.json. O maven, cria um repositorio local na maquina, que por padrao fica sempre na pasta do usuario (pasta .m2)

Primeira coisa a definir é a estrutura de pacotes, que devem estar dentro da pasta principal do backend

Pastas padrao MVC:

Controle: Classes de controle receberao todas as requisições de clientes

Servico: São as regras de negocio da aplicação

Modelo:

Repository: Classes que possuem codigos com requisição com banco de dados

Configuração:

Security:

Exception:

Vamos utilizar o insomnia/postman para testar as requisições API

