/*
  LEANDRO PEREIRA DOS SANTOS CB3005372
  RENAN JOSUÉ SILVA DE MATOS CB3007162

  5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela
*/


import java.util.Scanner;

class Ex05 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    float atual;
    
    float nums2[][];
    nums2 = new float[3][2];

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 2; j++){
            System.out.println("Insira um numero");
            atual = s.nextFloat();
            nums2[i][j] = atual;
        }
    }

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 2; j++){
            System.out.print(nums2[i][j] + " | ");
        }
        System.out.println("");        
    }

    s.close();
  }
}