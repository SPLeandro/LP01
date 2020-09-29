/*
  LEANDRO PEREIRA DOS SANTOS CB3005372
  RENAN JOSUÉ SILVA DE MATOS CB3007162

  6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. 
*/


import java.util.Scanner;

class Ex06 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    String atual;
    
    String nomes[][];
    nomes = new String[2][3];

    for (int i = 0; i < 2; i++){
        for (int j = 0; j < 3; j++){
            System.out.println("Insira um nome: ");
            atual = s.next();
            nomes[i][j] = atual;
        }
    }

    for (int i = 0; i < 2; i++){
        for (int j = 0; j < 3; j++){
            System.out.print(nomes[i][j] + " | ");
        }
        System.out.println("");        
    }

    s.close();
  }
}