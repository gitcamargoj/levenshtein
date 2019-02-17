Está é uma classe Java construída com o intuito de mostrar a proximidade entre duas palavras.
Se as palavras forem iguais, o algoritmo retorna 1;
Se forem diferentes ele retorna um numero entre 2 e 5, onde 2 é o mais próximo da primeira palavra e 5 é o mais distante.
Para chamar a classe a partir do método Main você deve utilizar o construtor da classe da seguinte forma:

Levenshtein palavras = new Levenshtein("Junior", "Camargo");

Para exibir você pode fazer da seguinte forma:

System.out.println(palavras.criterioZero(palavras.getPrimaria(), palavras.getSecundaria()));

Contato: camargo.cv@icloud.com.
