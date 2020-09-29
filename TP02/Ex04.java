/*
  LEANDRO PEREIRA DOS SANTOS CB3005372
  RENAN JOSUÉ SILVA DE MATOS CB3007162

  4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela
*/


import java.util.Scanner;

class Ex04 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    float atual;
    
    float nums2[][];
    nums2 = new float[2][3];

    for (int i = 0; i < 2; i++){
        for (int j = 0; j < 3; j++){
            System.out.println("Insira um numero");
            atual = s.nextFloat();
            nums2[i][j] = atual;
        }
    }

    for (int i = 0; i < 2; i++){
        for (int j = 0; j < 3; j++){
            System.out.print(nums2[i][j] + " | ");
        }
        System.out.println("");        
    }

    s.close();
  }
}