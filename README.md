# Projeto ContaBanco

Este projeto tem como objetivo exercitar os conceitos apresentados no módulo de Sintaxe, implementando um sistema de conta bancária que recebe dados via terminal.

## Descrição do Projeto

O projeto **ContaBanco** recebe dados inseridos pelo usuário via terminal contendo as características de uma conta bancária. Os dados coletados são:

- Número da Conta (inteiro)
- Agência (texto)
- Nome do Cliente (texto)
- Saldo (decimal)

Após a coleta das informações, o sistema exibe uma mensagem de confirmação com os dados inseridos.

## Estrutura do Projeto

Dentro do projeto, temos a classe `ContaTerminal.java`, que é responsável por toda a codificação do programa. 

## Atributos

Os atributos da classe `ContaTerminal` e exemplos de valores são:
- **Número** (inteiro): Exemplo: `1021`
- **Agência** (texto): Exemplo: `067-8`
- **Nome Cliente** (texto): Exemplo: `MARIO ANDRADE`
- **Saldo** (decimal): Exemplo: `237.48`

## Funcionamento

O usuário receberá mensagens solicitando a inserção dos dados necessários, por exemplo:
Programa: "Por favor, digite o número da Agência !" Usuário: 1021 (depois ENTER para o próximo campo)

Após a inserção de todas as informações, o sistema exibirá a seguinte mensagem de confirmação:
```
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
```

Os campos entre colchetes serão preenchidos com as informações fornecidas pelo usuário.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior
- Um editor de texto ou IDE de sua preferência

## Executando o Projeto

1. Clone o repositório para a sua máquina local:
    ```
    git clone https://github.com/seu-usuario/Trilha-Java-basico.git
    ```

2. Navegue até o diretório do projeto:
    ```
    cd ContaBanco
    ```

3. Compile o arquivo `ContaTerminal.java`:
    ```
    javac ContaTerminal.java
    ```

4. Execute o programa:
    ```
    java ContaTerminal
    ```

## Contribuição

Se você deseja contribuir com o projeto, sinta-se à vontade para abrir um pull request ou relatar um problema.

