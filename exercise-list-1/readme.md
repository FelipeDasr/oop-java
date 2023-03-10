# Exercise list 1

### Question 1

Escreva um programa que imprima na tela a string "Olá, mundo!"

Por exemplo:

| Resultado         |
|-------------------|
| **`Ola, mundo!`** |

</br>

### Question 2

Escreva um programa que lê duas notas de um aluno (ambas doublegg) e calcule a média aritmética dessas notas. Caso essa média seja maior ou igual  a 6, imprima Aprovado. Caso contrário, imprima Reprovado

Por exemplo:

| Entrada | Resultado       |
|---------|-----------------|
| 10 10   | **`Aprovado`**  |
| 5.9 6   | **`Reprovado`** |

</br>

### Question 3

Leia um número inteiro do console e imprima Par se ele for par ou Impar se ele for ímpar

Por exemplo:

| Entrada | Resultado   |
|---------|-------------|
| 12      | **`Par`**   |
| 9       | **`Impar`** |

</br>

### Question 4

Queremos escrever um programa que simula uma calculadora simples. Essa calculadora deve ser capaz de receber diversas operações e realizá-las em sequência.
As operações devem ser realizadas entre dois valores double, e o resultado deve ser impresso na tela logo após cada operação é lida. As operações possíveis são soma **("+")**, subtração **("-")**, multiplicação **("*")** e divisão **("/")**. O final do programa é sinalizado quando a operação lida é um **"x"**.

Você sempre deve realizar ao menos uma operação antes do programa se encerrar.

Por exemplo:

| Entrada                                                   | Resultado                                                  |
|-----------------------------------------------------------|------------------------------------------------------------|
| 1.2 + 3 </br>0 x 0                                        | **`4.2`**                                                  |
| 2 * 3 </br>4 / 2 </br>1.3 / 2</br>2.75 - 1</br>0 x 0</br> | **`6.0`**</br>**`2.0`**</br>**`0.65`**</br>**`1.75`**</br> |

### Question 5

Escreva um programa que leia um valor inteiro n e imprima a soma de todos os múltiplos de n presente no intervalo entre 1 e 1000.

Por exemplo:

| Entrada | Resultado  |
|---------|------------|
| 500     | **`1500`** |
| 100     | **`5500`** |

</br>

### Question 6

Este é Bob. Bob é um rapaz muito simpático, mas também é muito peculiar. Bob adora alguns números, mas odeia outros. Em particular, Bob gosta muito de números que são quadrados perfeitos (números cuja raíz quadrada é um valor inteiro). 

Qualquer outro número o deixa muito irritado. Não queremos irritar Bob, portanto precisamos garantir que todos os números que mostraremos a ele são quadrados perfeitos.
Aí entra você! Seu objetivo aqui é, dados n números inteiros, imprimir na saída apenas aqueles que são quadrados perfeitos.


Entrada
Sua entrada é composta por diversas linhas. Na primeira linha, leia um inteiro n. Logo após, leia n linhas, cada uma contendo um número inteiro.
Saída
A sua saída deve conter (na ordem em que foram lidos) apenas os números que são quadrados perfeitos, um em cada linha.


Dica: Você deve usar o método sqrt() da API do Java para cálculo da raíz quadrada. Importe a biblioteca usando 

**import java.lang.Math;**


e chame o método utilizando **Math.sqrt();**

Por exemplo:

| Entrada                   | Resultado             |
|---------------------------|-----------------------|
| 3 </br> 1 </br> 2 </br> 9 | **`1`** </br> **`9`** |
| 3</br>2</br>4</br>10      | **`4`**               |
