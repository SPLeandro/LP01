/*
  LEANDRO PEREIRA DOS SANTOS CB3005372
  RENAN JOSUÉ SILVA DE MATOS CB3007162

    Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
    sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
    elementos, calcular e exibir a matriz transposta. 
*/

import java.util.Scanner;

class Ex09 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int linhas = 0;
    int colunas = 0;
    float atual;
    float constantem;
    
    do {
        System.out.println("Insira a quantidade de linhas: ");
        linhas = s.nextInt();
    } while (linhas > 10 && linhas < 1);

    do {
        System.out.println("Insira a quantidade de colunas: ");
        colunas = s.nextInt();
    } while (colunas > 10 && colunas < 1);

    float nums[][];
    nums = new float[linhas][colunas];

    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            System.out.println("Insira um numero");
            atual = s.nextFloat();
            nums[i][j] = atual;
        }
    }

    System.out.println("");
    System.out.println("Matriz oficial: ");
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            System.out.print(nums[i][j] + " | ");
        }
        System.out.println("");        
    }






    float nums2[][];
    nums2 = new float[colunas][linhas];    

    System.out.println("");
    System.out.println("Matriz transposta: ");
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            nums2[j][i] = nums[i][j];
        }
    }

    for (int i = 0; i < nums2.length; i++){
        for (int j = 0; j < nums2[i].length; j++){
            System.out.print(nums2[i][j] + " | ");
        }
        System.out.println("");        
    }

    s.close();
  }
}