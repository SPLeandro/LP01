/*
LEANDRO PEREIRA DOS SANTOS CB3005372
RENAN JOSUÉ SILVA DE MATOS CB3007162

3 Entrar via teclado com "N" valores quaisquer. O valor "N" (que representa a quantidade de números) será digitado, deverá ser positivo, porém menor que vinte. 
Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos "N" valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos; 

Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente "S" ou "N" e encerrar o
programa em função dessa resposta.

*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String repetir = "S";
        float qntdnum;
        float atual;
        float maior = 0;
        float menor = 0;
        float total = 0;
        float media = 0;
        float positivo = 0;
        float negativo = 0;

        do {
    
            System.out.println("Quantos numeros deseja inserir: ");
            qntdnum = s.nextFloat();

            for (int i = 0; i<qntdnum; i++){
                System.out.println("Insira o " + (i+1) + " valor: ");
                atual = s.nextFloat();
                total += atual;

                if ( i == 0 ){
                maior = atual;
                menor = atual;
                } else if (atual > maior ){
                maior = atual;
                } else if (atual < menor) {
                menor = atual;
                }

                if(atual >= 0 ){
                positivo++;
                }else {
                negativo++;
                }

            }
            positivo = (positivo/qntdnum)*100;
            negativo = (negativo/qntdnum)*100;
            media = total/qntdnum;

            System.out.println("Maior valor: " + maior + ". Menor valor " + menor);

            System.out.println("Soma total: " + total + ". Media: " + media);
            System.out.println("Porcentagem positiva: " + positivo + ". Porcentagem negativa: " + negativo);

            do {
            System.out.println("Deseja executar novamente: ");  
            repetir = s.next();
            } while (!repetir.equalsIgnoreCase("S") && !repetir.equalsIgnoreCase("N"));   

        } while (repetir.equalsIgnoreCase("S"));  
        s.close(); 
        
    }
}
