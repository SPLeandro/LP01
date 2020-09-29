/*
  LEANDRO PEREIRA DOS SANTOS CB3005372
  RENAN JOSUÉ SILVA DE MATOS CB3007162

    11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
    sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
    calcular e exibir determinante da matriz.
*/

import java.util.Scanner;

class Ex11 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int qntdLC = 0;
    float atual;
    float constantem;
    
    do {
        System.out.println("Insira a quantidade de linhas e colunas: ");
        qntdLC = s.nextInt();
    } while (qntdLC > 10 && qntdLC < 1);


    float nums[][];
    nums = new float[qntdLC][qntdLC];

    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            System.out.println("Insira um numero");
            atual = s.nextFloat();
            nums[i][j] = atual;

           // nums[i][j] = i+j;
        }
    }

    System.out.println("");
    System.out.println("Matriz: ");
    for (int i = 0; i < nums.length; i++){
        for (int j = 0; j < nums[i].length; j++){
            System.out.print(nums[i][j] + " | ");
        }
        System.out.println("");        
    }





    switch(qntdLC){
        case 1:
            System.out.println("Determinante da matriz de ordem 1:" + nums[0][0]);
        break;

        case 2:
            System.out.println("Determinante da matriz de ordem 2:");
              
            float determinante = nums[0][0]*nums[1][0] - nums[0][1]*nums[1][0];
            System.out.println("Determinante da matriz de ordem 2 eh: " + determinante);        
                
        break;

        case 3:
        
            int x=0;
            float nums2[][];
            nums2 = new float[3][5];    


            // CLONANDO AS DUAS PRIMEIRAS COLUNAS
            for (int i = 0; i < nums.length; i++){
                x=0;
                for (int j = 0; j < nums2[i].length; j++){
                    if (j<3){
                        nums2[i][j] = nums[i][j];
                    } else if(j>2){
                        nums2[i][j] = nums[i][x];
                        x++;
                    }
                }
            }

            // EXIBINDO MATRIZ
            System.out.println("");
            System.out.println("Matriz 3X5 (Regra de Sarrus): ");
            for (int i = 0; i < nums2.length; i++){
                for (int j = 0; j < nums2[i].length; j++){
                    System.out.print(nums2[i][j] + " | ");
                }
                System.out.println("");        
            }

            // RESOLVENDO O DETERMINANTE
            double totaldireita = 0;
            for(int i = 0; i < 3; i++){
                totaldireita += (nums2[0][i]*nums2[1][i+1]*nums2[2][i+2]);                
            }
                
            double totalesquerda = 0;
            for(int i = 4; i > 1; i--){
                totalesquerda += (nums2[0][i]*nums2[1][i-1]*nums2[2][i-2]);
            }

            System.out.println("Determinante da matriz de ordem 3 eh: " + (totaldireita-totalesquerda));
        

        break;

        default:
        System.out.println("Nao ha infraestrutura suficiente para calcular o determinante dessa matriz... :(");
        break;

    }
    s.close();
  }
}