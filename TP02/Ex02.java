/*
LEANDRO PEREIRA DOS SANTOS CB3005372
RENAN JOSUÉ SILVA DE MATOS CB3007162

2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
*/

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    float atual;
    float maior = 0;
    float total = 0;
    float media = 0;

    for (int i = 0; i<10; i++){
	do {
      	System.out.println("Insira o valor " + (i+1) + ":");
      	atual = s.nextFloat();
	}
	while(atual<0);
	total += atual;

      if ( i == 0 ){
        maior = atual;
      } else if (atual > maior ){
        maior = atual;
      }

    }
    media = total/10;

    System.out.println("Maior valor: " + maior + ". Soma total: " + total + ". Media: " + media);
    s.close();
  }
}
