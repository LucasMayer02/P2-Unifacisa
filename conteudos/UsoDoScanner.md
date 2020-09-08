# Uso do Scanner

Tem a finalidade de facilitar a entrada de dados no modo Console.

Um scanner de texto simples pode analisar os tipos primitivos e strings usando expressões regulares.

Com essa classe podem ser convertidos textos para tipos primitivos, sendo que esses textos podem ser considerados como objetos do tipo String, InputStream e arquivos.

## Na Prática

Essa classe ajuda na leitura dos dados informados. Para fazer essa ação na prática, é necessário criar um objeto do tipo Scanner que passa como argumento o objeto System.in dentro construtor, do seguinte modo:
```java 
import java.util.Scanner;

public class TestaDeclaracaoScanner {
  public static void main(String[] args) {
    //Lê a partir da linha de comando
    Scanner sc1 = new Scanner(System.in);
    String textoString = "Maria Silva";
    //Lê a partir de uma String
    Scanner sc2 = new Scanner(textoString);
  }
}
```
## Principais Métodos

O objeto System.in é o que faz a leitura do que se escreve no teclado. Veja abaixo como são invocados alguns dos métodos principais que correspondem com a assinatura que retorna um valor do tipo que foi invocado. Ou seja, para cada um dos primitivos existe uma chamada do método para retornar o valor especificado na entrada de dados, sempre seguindo o formato nextTipoDado().
```java
Scanner sc = new Scanner(System.in);

float numF = sc.nextFloat();
int num1 = sc.nextInt();
byte byte1 = sc.nextByte();
long lg1 = sc.nextLong();
boolean b1 = sc.nextBoolean();
double num2 = sc.nextDouble();
String nome = sc.next();
```
