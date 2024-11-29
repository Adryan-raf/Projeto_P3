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
* [Conceitos SOLID utilizados](#Conceitos-SOLID-utilizados)
* [Beneficios da integração com os principios SOLID](#Beneficios-da-integração-com-os-principios-SOLID)
* [Diagrama de classes UML](#Diagrama-de-classes-UML)
* [Fluxo de diagrama UML](#Fluxo-de-diagrama-UML)
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

Ela carrega consigo algumas funções que realizam as operações supracitadas e faz a chamada das outras classes.

### -> Mesa 

\* _Classe e métodos definidos por Gabriel_ e Lucas_

O intuito da criação dessa classe está na capacidade de verificação da disponibilidade de uma mesa e na inserção do cliente a mesa escolhida por ele. Dessarte, ela conta com métodos para adicionar itens à mesa selecionada previamente, assim como remover e vizualizar os pedidos.

### -> Pedido

\* _Classe e métodos definidos por Gabriel_ e Lucas_

A classe Pedido representa o conjunto de itens consumidos em uma única mesa no restaurante.

### -> itensDoPedido

\* _Classe e métodos definidos por Gabriel_ e Lucas_

O objetivo dessa classe se limita a impressão e a construção das informações que cincundeiam um pedido, armazenando informações sobre ele tais como o nome do produto e preço.

### -> Gerenciador de Mesas
\* _Classe e métodos definidos por Gabriel_

A classe GerenciadorDeMesas é responsável por controlar e organizar as mesas disponíveis no restaurante. Ela gerencia o estado de ocupação das mesas e interage com outras classes para realizar operações relacionadas ao fluxo de atendimento.

### -> Gerenciador de Vendas
\* _Classe e métodos definidos por Gabriel_

A classe a seguir tem como objetivo organizar os gastos totalizados do consumo de um cliente numa mesa e somá-los conforme estabelecido na classe Cardápio para sinalizar ao consumidor o quanto ele deve pagar. 

### -> Cardápio

\* _Classe e métodos definidos por Gabriel_ e Lucas_

Esta classe visa trazer a temática do código abordado ao expor um cardápio criado pela equipe para simbolizar as opções de ofertas que o restaurante trás.

### IMPLEMENTAÇÃO DO MÉTODO SOLID

S - Single Resposibility Principle: A classe Pedido tem a responsabilidade exclusiva de gerenciar os itens consumidos em um pedido. Ela é responsável apenas por armazenar os itens do itensDoPedido, calcular o total do pedido e exibir o pedido. Não há outras responsabilidades dentro desta classe, como, por exemplo, manipular a ocupação das mesas, que é tratada pela classe Mesa.

O - Open/Closed Principle: A classe de Gerenciador De Mesas pode ser estendida para adicionar novos métodos ou comportamentos sem modificar o código existente.

L - Liskov Substitution Principle: Se em algum momento for necessário criar subclasses de Mesa ou Pedido, essas devem funcionar corretamente em qualquer parte do código que esperar um objeto da classe Mesa ou Pedido.

I - Interface Segregation Principle: Em vez de criar uma interface única e complexa para todas as operações do sistema, o código se divide em classes específicas como Pedido, Mesa e GerenciadorDeMesas, cada uma com responsabilidades bem definidas. Desse modo, percebe-se que cada classe oferece métodos específicos e relacionados ao seu contexto.

D - Dependency Inversion Principle: A classe GerenciadorDeMesas depende de interfaces ou classes abstratas como o GerenciadorDeVendas para processar o total das vendas. Isso permite que a implementação do GerenciadorDeVendas seja alterada sem afetar a GerenciadorDeMesas, já que ambas as classes não dependem diretamente de uma implementação concreta, mas de abstrações.


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

# Conceitos SOLID utilizados

### Responsabilidade Única (SRP):
Cada módulo (Clinica, Eventos, Restaurante) possui classes específicas para suas funções principais, como Consulta, Evento e Pedido. Isso garante organização e facilita manutenção.

### Aberto/Fechado (OCP):
É possível adicionar novas funcionalidades (ex.: novos tipos de eventos ou menus sazonais no restaurante) sem alterar o núcleo dos sistemas.

### Substituição de Liskov (LSP):
Classes como Usuario (base) podem ser substituídas por suas subclasses (Paciente, Organizador, Cliente) em qualquer parte do sistema, mantendo a coerência.

### Segregação de Interface (ISP):
Cada módulo implementa apenas os métodos relevantes ao seu escopo, evitando sobrecarga desnecessária. Exemplo: métodos de agendamento são usados apenas onde necessário.

### Inversão de Dependência (DIP): 
Os módulos dependem de abstrações, como uma interface Reservavel, usada para Consulta, Reserva de Evento e Mesa, permitindo integração sem acoplamento rígido.

# Beneficios da integração com os principios SOLID

### Modularidade: 
Cada sistema pode ser tratado como um módulo independente (Clinica, Eventos, Restaurante), compartilhando classes base comuns, como Usuario e Reserva.

### Extensibilidade:
Facilita a adição de funcionalidades específicas para cada módulo (ex.: Consulta para a clínica, Cardápio para o restaurante, e Agenda para eventos), sem afetar os demais.

### Reutilização de Código: 
Classes e métodos comuns, como autenticação ou gerenciamento de usuários, podem ser reutilizados em todos os sistemas.

### Escalabilidade: 
O uso de abstrações permite expandir o sistema integrado com novas funcionalidades sem reescrever o código existente.

# Diagrama de classes UML
 <img src="uml.png" alt="Diagrama UML" width="1000">

# Fluxo de Diagrama de classes UML
<img src="fluxoUML.png" alt="Fluxo de Diagrama UML" width="500">

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
