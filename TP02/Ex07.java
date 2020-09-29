/*
  LEANDRO PEREIRA DOS SANTOS CB3005372
  RENAN JOSUÉ SILVA DE MATOS CB3007162

 7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
    digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
    valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes. 
*/

import java.util.Scanner;

class Ex07 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    float atual;
    float constantem;
    
    float nums[][];
    nums = new float[3][4];

    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            System.out.println("Insira um numero");
            atual = s.nextFloat();
            nums[i][j] = atual;
        }
    }

    System.out.println("Essa foi a matriz inserida: ");
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            System.out.print(nums[i][j] + " | ");
        }
        System.out.println("");        
    }
    System.out.println("");

    System.out.println("Insira a constante multiplicativa: ");
    constantem = s.nextFloat();

    System.out.println("");
    System.out.println("A matriz apos a multiplicacaoo: ");
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            nums[i][j] *= constantem;
        }
    }


    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            System.out.print(nums[i][j] + " | ");
        }
        System.out.println("");        
    }

    s.close();
  }
}