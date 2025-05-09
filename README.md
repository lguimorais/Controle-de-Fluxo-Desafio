# 🚀 Desafio de Controle de Fluxo - Java | DIO

Este projeto foi desenvolvido como parte do **Desafio de Controle de Fluxo** da **Digital Innovation One (DIO)**. O objetivo foi colocar em prática os conhecimentos sobre estruturas de decisão (`if`, `else`) e laços de repetição (`for`), além da criação e uso de **exceções personalizadas** em Java.

---

O sistema funciona da seguinte maneira:

- O usuário digita **dois números inteiros** no terminal.
- O sistema verifica se o **segundo número é maior que o primeiro**.
- Caso seja, ele calcula a diferença entre os dois e **imprime no console mensagens de contagem**, como:


- Se o **primeiro número for maior ou igual ao segundo**, o programa lança uma exceção customizada chamada `ParametrosInvalidosException`, exibindo a seguinte mensagem:

---

## ✅ O que foi praticado

- Receber entrada do usuário com `Scanner`
- Conversão e uso de `int`
- Criação de métodos com `throws Exception`
- Laços de repetição com `for`
- Criação de classes auxiliares
- Exceções personalizadas

---

## 🛠 Estrutura do Projeto

O projeto é dividido em **3 classes Java**:

1. **Contador.java**  
 Classe principal com o método `main`, responsável por ler os dados do usuário e executar o método de contagem.

2. **ContadorService.java**  
 Contém o método `contar()`, onde está toda a lógica de validação e contagem.

3. **ParametrosInvalidosException.java**  
 Representa a exceção personalizada que é lançada quando o segundo número não é maior que o primeiro.

---

## 🧾 Exemplo de Execução

```bash
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
9

Imprimindo o número 1  
Imprimindo o número 2  
Imprimindo o número 3  
Imprimindo o número 4

