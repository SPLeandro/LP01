/*
  LEANDRO PEREIRA DOS SANTOS CB3005372
  RENAN JOSUÉ SILVA DE MATOS CB3007162

  1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
  Caso contrário solicitar novamente apenas o segundo valor. 
*/


import java.util.Scanner;

class Ex01 {
  public static void main(String[] args) {

    float fvalor = 0;
    float svalor = 0;
     Scanner s = new Scanner(System.in);
    
    System.out.println("Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor. .");

    System.out.println("Insira o primeiro valor: ");
      fvalor = s.nextFloat();
    do {
      System.out.println("Insira o segundo valor: ");
      svalor = s.nextFloat();
    }
    while (fvalor >= svalor );
    System.out.println("Primeiro valor: " + fvalor + ". Segundo valor: " + svalor);
    s.close();
  }
}