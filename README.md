# UNIVERSIDADE CATÓLICA DE PERNAMBUCO

<p align="center">
   <img src="http://www1.unicap.br/icam/wp-content/uploads/2019/06/marca_nova.svg" />
  </p>

  # ÍNDICE
* [Índice](#índice)
* [Descrição do Projeto](#descrição-do-projeto)
* [Case 1](#Case-1)
* [Case 2](#Case-2)
* [Case 3](#Case-3)
* [Perguntas para facilitar a tomada de decisão](#Perguntas-para-facilitar-a-tomada-de-decisão)
* [Desenvolvedores do Projeto](#desenvolvedores-do-projeto)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Licença](#licença)


  # DESCRIÇÃO DO PROJETO

  <p align ="justify">
O objetivo deste projeto é desenvolver uma aplicação em Java que simule sistemas de gerenciamento para três cenários distintos: uma clínica médica, um sistema de eventos e um restaurante. A aplicação será capaz de modelar e manipular objetos que representem os elementos principais desses sistemas, utilizando noções de manipulação de classes, atributos, métodos, conceitos de decisão e repetição, modularização e encapsulamento.
  </p>

# CASE 1

## SISTEMA DE GERENCIAMENTO DE CLÍNICA MÉDICA

### Feito por:
 - Adryan Rafael


## Como este sistema funciona?

O sistema de gerenciamento de clínica médica possui uma interface simples para o usuário, permitindo o controle eficiente dos atendimentos médicos com as seguintes funções:

- Marcar consultas
- Cancelar consultas
- Concluir consultas
- Exibir prontuário de pacientes
- Análise de consultas e gestão de agenda médica

## Classes

As classes seguem o paradigma de orientação a objetos e são projetadas para facilitar o gerenciamento de médicos, pacientes e consultas dentro da clínica. O sistema inclui classes para "Paciente", "Medico" e "Consulta", além da classe "ClinicaMedica" que integra essas funcionalidades para uso prático.

### -> Consulta
  

Esta classe tem como objetivo definir uma consulta. A consulta possui: Paciente, Médico, Data da Consulta, e Status da Consulta (Agendada, Cancelada ou Concluída). Seus atributos são protegidos por encapsulamento, com um construtor definido, bem como os métodos _getters_ e _setters_.

A classe Consulta pode:
- Exibir detalhes da consulta
- Concluir a consulta com um resultado médico
- Cancelar uma consulta
- Atualizar o status da consulta

### -> Medico


Esta classe tem como finalidade definir um médico. Um médico possui: Nome, CRM, Especialidade, Horário de Atendimento, e uma lista de consultas atribuídas a ele. Seus atributos estão encapsulados, e os métodos _getters_ e _setters_ estão definidos.

A classe Medico pode:
- Verificar a disponibilidade para uma data específica
- Adicionar uma consulta à sua agenda
- Exibir todas as consultas agendadas

### -> Paciente


Esta classe define um paciente. Um paciente possui: Nome, CPF, Email, Senha, Telefone, Histórico Médico e Convênio. Seus atributos estão protegidos, e os métodos _getters_ e _setters_ estão definidos.

A classe Paciente pode:
- Adicionar uma consulta ao seu prontuário
- Exibir o prontuário completo com todas as consultas realizadas

### -> ClinicaMedica


Esta classe reúne todas as outras classes e métodos mencionados, permitindo que o sistema funcione de forma integrada para o usuário final. Ela contém um método `main(String[] args)` que inicializa o sistema e oferece uma interface interativa com opções numéricas para uso.

O usuário pode:
- Marcar consultas
- Cancelar consultas
- Concluir consultas
- Exibir prontuário de pacientes
- Exibir informações gerais e específicas de consultas

Dentro das opções de análise, há 5 funcionalidades que respondem a perguntas e facilitam a tomada de decisão no gerenciamento da clínica médica. São elas:

- Quantas consultas estão agendadas para um médico específico?
- Quantas consultas foram canceladas?
- Qual foi o resultado da última consulta realizada?
- Qual é a próxima consulta do paciente?
- Há algum horário disponível para uma nova consulta no dia X?



# CASE 2

## SISTEMA DE GERENCIAMENTO DE EVENTOS

### Feito em conjunto por:
 - Jonas Mendes
 - José Roberval

\* _Este sistema é um case participativo dos três cases pedidos pelo professor Lucas Rodolfo, feitos em paralelo com o auxilio de Adryan Rafael, Lucas Vinícius e Gabriel de Souza._


## Como este sistema funciona?

O sistema de gerenciamento de eventos possui um sistema simples de utilização, estando nas mãos do usuário a utilização plena do sistema com as seguintes funções:

- Cadastro de eventos
- Exclusão de eventos
- Adicição de participantes
- Remoção de participantes
- Análises referente aos eventos

## Classes

As classes contemplam a orientação aos objetos definidos ao longo do projeto, contendo uma classe para definição de "Local", "Event", "Participante" e uma classe adicional para o condensamento das classes referidas e utilização efetiva das mesmas.

### -> Event
  
\* _Classe e métodos definidos por Jonas_

Esta classe possui a finalidade de definir um evento. O evento possui: Nome, Capacidade, Participantes Inscritos (CONTAGEM NUMÉRICA), um Array de participantes e o local. Seus atributos estão protegidos por encapsulamento e o seu construtor está definido, bem como os métodos _getters_ e _setters._

A classe Event pode: 
- Adicionar participantes a si mesma(caso o objeto evento permita), bem como removê-los.
- Salvar eventos criados
- Mostrar estatísticas de eventos
- Atualizar os eventos no arquivo CSV

### -> Local

\* _Classe e métodos definidos por Roberval_

Esta classe possui a finalidade de definir um local. Um local possui: Nome, Capacidade, Disponibilidade e um Array de eventos atribuídos a ele. Seus atributos estão protegidos por encapsulamento e seu construtor está definido, bem como os métodos _getters_ e _setters_.

A classe Local pode:
- Receber um evento
- Salvar um local
- Mostrar um local
- Verificar a ocupação

### -> Participante

\* _Classe e métodos definidos por Roberval_

Esta classe possui a finalidade de definir um participante. Um participante possui: Nome. Os participantes podem ser adicionados a eventos e serem removidos deles.

### -> MenuEventos

\* _Classe e métodos feitos em conjunto por Jonas e Roberval_

Esta classe possui a finalidade de usar as classes e métodos descritos anteriormente de forma coesa e funcional para o usuário final. A classe possui uma função `main(String[] args)` que inicia os locais durante uma nova execução e oferece ao usuario uma serie de opções de utilização do sistema de acordo com um input numérico.

O usuário, agora, pode:

- Criar eventos
- Excluir eventos
- Adicionar participantes a eventos
- Remover participantes de eventos
- Exibir opções de análise de estatisticas
- Exibir informações gerais dos eventos
- Exibir informações especificas dos eventos

Dentro das opções de análise, temos 5 opções que respondem e facilitam uma tomada de decisão no gerenciamento de eventos. São elas:

- Qual o evento registrado com maior taxa de adesão?
- Qual o evento registrado com a menor taxa de adesão?
- Qual o evento com a menor capacidade?
- Qual o total de participantes em todos os eventos?
- Qual o local mais popular para fazer eventos?

# CASE 3

# SISTEMA DE GERENCIAMENTO DE RESTAURANTE

### Feito em conjunto por:
- Gabriel Araújo;
- Lucas Vinícius;

## Como este sistema funciona?

O sistema de gerenciamento de restaurante tem o intuito de auxiliar os garçons e garçonetes em seus trabalhos para registrar e manipular os pedidos dos clientes que ocupam o estabelecimento. A estrutura desse algoritmo opera sobre os cenários:

- Ocupação de Mesa;
- Anotar Pedidos;
- Remover Pedido;
- Fechar Conta de uma Mesa;
- Imprimir Relátorio Atual dos Pedidos das Mesas;

## Classes

As classes do códigos realizam as funções que foram requisitadas pelo professor avaliador com o intuito de gerar um sistema coeso e funcional, contribuindo para que o código em sua totalidade opere com êxito ao ajudar os trabalhadores que necessitam do mesmo.

### -> SistemaRestaurante

\* _Classe e métodos definidos por Lucas_

Esta classe é a estrutura mais importante do código, uma vez que ele carrega a main dele e conecta as demais classes afim de permitir que o codigo seja efetuado com sucesso. 

Ela carrega consigo algumas funções que realizam as operações supracitadas e faz a chamada das outras classes, além de criar uma interface que permite que o usuário interaja com o sistema, realize as operações requeridas por ele e veja as informações adicionais do restaurante, como o cardápio e a a relação atual mesa-pedido;

### -> Mesa 

\* _Classe e métodos definidos por Gabriel_

O intuito da criação dessa classe está na capacidade de verificação da disponibilidade de uma mesa e na inserção do cliente a mesa escolhida por ele. Dessarte, Ela conta com métodos para adicionar itens à mesa selecionada previamente, assim como remover e vizualizar os pedidos.

### -> Pedido

\* _Classe e métodos definidos por Gabriel_

As funcionalidades dessa função inclue: uma adição (por trás das cenas) dos pedidos feitos e os inserem dentro de um array, o cálculo de soma total dos custos de uma mesa, adiciona os pedidos ao array específico, bem como a remoção deles e imprime o pedido feito quando solicitado.


### -> itensDoPedido

\* _Classe e métodos definidos por Gabriel_

O objetivo dessa classe se limita a impressão e a construção de métodos para expor os pedidos da mesa e calcular o total dos custos totais.

# Perguntas para facilitar a tomada de decisão

Para cada case, algumas perguntas que facilitam a tomada de decisão foram implementadas. 

### Case 1

- Quantas consultas estão agendadas para o médico?
- Qual é a próxima consulta do paciente?
- Quantas consultas foram canceladas pelo médico ou pelo paciente?
- Qual foi o resultado da última consulta realizada?
- Há algum horário disponível para uma nova consulta no dia X?

### Case 2 -Gerenciamento de eventos

- Qual o evento registrado com maior taxa de adesão?
- Qual o evento registrado com a menor taxa de adesão?
- Qual o evento com a menor capacidade?
- Qual o total de participantes em todos os eventos?
- Qual o local mais popular para fazer eventos?

### Case 3 - Gerenciamento do Restaurante

- Quais são os pedidos que cada mesa possui?
- Qual o custo total levando em consideração a quantidade solicitada de um pedido?
- O sistema consegue expor todos os pedidos da mesa que fechará a conta e o custo total?
- O sistema lida com a remoção e a inserção de pedidos na conta de uma mesa?
- Em casos de comandos inválidos, o sistema notifica o erro ocorrido para o funcionário que desconhece a causa do mesmo?

# DESENVOLVEDORES DO PROJETO
* [Adryan Rafael](https://github.com/Adryan-raf)
* [Gabriel Araújo](https://github.com/Gabriel-SL-Araujo)
* [Jonas Mendes](https://github.com/jonas-jhz)
* [José Roberval](https://github.com/robervalgneto)
* [Lucas Vinicius](https://github.com/lucavinini/)




### TECNOLOGIAS UTILIZADAS
As seguintes ferramentas estão atualmente sendo utilizadas na construção desse projeto:

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [IntelliJ IDEA Ultimate JETBRAIN IDE](https://www.jetbrains.com/help/idea/installation-guide.html)


### LICENÇA
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
