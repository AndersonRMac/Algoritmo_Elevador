package org.example;

import java.util.Arrays;
import java.util.Scanner;

/*SISTEMA BÁSICO DE ELEVADOR

Um prédio com 03 elevadores lhe contratou para desenvolver um sistema que deverá calcular e decidir qual elevador irá atender o chamado do morador.
Levaremos em consideração apenas 02 parâmetros para efeito de decisão do sistema, são eles:
- A quantidade de andar que o elevador deverá passar para atender o morador
- A quantidade de pessoas dentro do elevador
Para simular o sistema, ao iniciar o código o python irá realizar 02 sorteios para cada elevador onde irá definir o andar que o elevador estar e quantas pessoas tem dentro de cada um. Os valores poderão variar de 0 a 5, ou seja do andar térreo ao quinto e de nenhuma pessoa dentro até a capacidade máxima de 5 pesssoas.
Após o sorteio, o sistema irá perguntar qual andar o morador estar (lembre-se, estamos simulando, na vida real ele já saberia), com essa informação o sistema irá decidir qual elevador chamar levando em consideração o número de pessoas e o quão distante ele estar do morado que o chamou.
Pense, use bastante lógica de programação e defina uma regra para que essas informações façam sentido.
Se você perdeu a explicação da tarefa no dia da aula (14/11), procure um colega e peça para que ele lhe oriente sobre o problema.
O trabalho é em grupo de até 05 pessoas, se você quiser melhorar mais ainda o código, trazendo ele mais próximo da realidade, isso é muito bom, afinal só quem ganha é você.
*/
public class Elevador {
    public static void main(String[] args) {

        int qtd_andares;
        int andar_pessoa;
        int andar_atual;
        int qtd_pessoas;
        final int limite_pessoas = 13;
        final int limite_peso = 975;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem Vindo!");

        System.out.println("Digite o numero de pessoas a entrar: ");
        qtd_pessoas = scan.nextInt();

        System.out.println("Quantos andares tem seu prédio?");
        qtd_andares = scan.nextInt();

        System.out.println("Em que andar você se encontra");
        andar_atual = scan.nextInt();

        System.out.println("Digite o andar que deseja ir:");
        andar_pessoa = scan.nextInt();

        movimento_elevador1(andar_atual,andar_pessoa,qtd_andares);
    }

    public static void peso_elevador (int qtd_pessoas){

    }
    public static void movimento_elevador1 (int andar_atual, int andar_pessoa, int qtd_andares){
        int [] total_andares = new int[qtd_andares];


       if (andar_pessoa < qtd_andares | andar_atual < andar_pessoa) {

           System.out.println("Subindo...");
           for (int i = andar_atual; i < total_andares.length; i++) {

               System.out.println("Subindo..." + i);
               if (i == andar_pessoa){
                   System.out.println("Você chegou no seu andar!");
                   break;
               }

           }

       }
    }

}