## Alunos:
Vinícius de Oliveira Guimarães, 802431<br>
Vitor Kasai Tanoue, 801904<br>
Karen Barcelos, 799657

## Pré-requisitos:
```
Java JDK 17
Apache Maven 3.9.1
```

## Como rodar?

### Rodar o nosso analisador léxico
Entre na pasta do projeto

Insira no arquivo **entrada.txt** o conteúdo que o parser vai ler.

(Opcional) Você pode escolher compilar o projeto do zero ou não (Nós já compilamos e deixamos o arquivo JAR do projeto pronto aqui no GitHub)
```
// compilando o projeto do zero
mvn clean
mvn generate-sources
mvn package
```

Agora, no terminal, execute:
```
java -jar ./target/AlgumaParser-1.0-SNAPSHOT-jar-with-dependencies.jar entrada.txt saida.txt
```
Pronto, o resultado gerado pelo parser estará no arquivo saida.txt dentro da pasta do projeto.

## Rodando o corretor automático
(Obs: Todos os resultados gerados pelo corretor automático já estão dentro do diretório t1/correcaoAutomatica/temp/saidaProduzida/saida_t1)

Entre na pasta correcaoAutomatica

Com terminal aberto na pasta correcaoAutomatica insira no terminal: <br>
```
 java -jar compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar ../AlgumaParser/target/AlgumaParser-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc temp casos-de-teste "802431 801904 799657" t2
```

O resultado gerado pelo corretor automático vai estar na pasta /temp/saidaProduzida/saida_t2
