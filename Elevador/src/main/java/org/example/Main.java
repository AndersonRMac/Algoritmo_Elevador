package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main extends Thread{
    public static void main(String[] args) {

        int andar_pessoa;
        int andar_atual;
        int qtd_pessoas;
        int limite_peso_atual;
        final int limite_peso = 975;
        final int qtd_andares = 20;

        Elevador1 elevador_1 = new Elevador1();
        Elevador2 elevador_2 = new Elevador2();
        Elevador3 elevador_3 = new Elevador3();

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Digite o numero de pessoas a entrar: ");
            qtd_pessoas = scan.nextInt();

            if (qtd_pessoas > 13) {
                System.out.println("Numero do pessoas acima do limite permitido!!!");
                break;
            }

            System.out.println("Em que andar voce se encontra");
            andar_atual = scan.nextInt();

            System.out.println("Digite o andar que deseja ir:");
            andar_pessoa = scan.nextInt();

            limite_peso_atual = peso_elevador(qtd_pessoas);

            if (limite_peso_atual < limite_peso) {
                int elevador1 = sorteio_andares();
                int elevador2 = sorteio_andares();
                int elevador3 = sorteio_andares();

                System.out.println(elevador1 + " " + elevador2 + " " + elevador3);

                if (andar_atual <= elevador1) {
                    elevador_1.run();
                    movimento_elevador1(qtd_pessoas, andar_atual, andar_pessoa, qtd_andares);
                }else if (andar_atual <= elevador2){
                    elevador_2.run();
                    movimento_elevador2(qtd_pessoas, andar_atual, andar_pessoa, qtd_andares);
                } else if (andar_atual <= elevador3) {
                    elevador_3.run();
                    movimento_elevador3(qtd_pessoas, andar_atual, andar_pessoa, qtd_andares);
                }else System.out.println("Elevador em deslocamento, chame novamente!");

            } else {
                System.out.println("Quantidade de pessoas acima do limite de segurança!");
            }
        }
    }
    public static int peso_elevador (int qtd_pessoas){

        int peso_atual = qtd_pessoas * 75;

        System.out.print("Elevador com " + peso_atual + "Kg, agora.");

        return peso_atual;

    }
    public static int sorteio_andares() {
        List<Integer> numero_1 = new ArrayList<Integer>();
        numero_1.add(1);
        numero_1.add(2);
        numero_1.add(3);
        numero_1.add(4);
        numero_1.add(5);
        numero_1.add(6);
        numero_1.add(7);
        numero_1.add(8);
        numero_1.add(9);
        numero_1.add(10);
        numero_1.add(11);
        numero_1.add(12);
        numero_1.add(13);
        numero_1.add(14);
        numero_1.add(15);
        numero_1.add(16);
        numero_1.add(17);
        numero_1.add(18);
        numero_1.add(19);
        numero_1.add(20);
        Collections.shuffle(numero_1);
        int resultado = 0;
        for (int i = 0; i < 1; i++) {
            resultado = numero_1.get(i);
        }
        return resultado;
    }
    public static void movimento_elevador1 (int qtd_pessoas, int andar_atual, int andar_pessoa, int qtd_andares){
        int [] total_andares = new int[qtd_andares];
        if (andar_pessoa < qtd_andares | andar_atual < andar_pessoa) {
            if (andar_pessoa > andar_atual) {
                System.out.println("Elevador subindo com " + qtd_pessoas + " pessoas.");
                for (int i = andar_atual; i < total_andares.length; i++) {
                    System.out.println("Subindo..." + i);
                    if (i == andar_pessoa) {
                        System.out.println("Voce chegou no seu andar!");
                        break;
                    }
                }
            }
            if (andar_pessoa > qtd_andares | andar_atual > andar_pessoa) {
                System.out.println("Vamos Descer!");
                System.out.println("Elevador descendo com " + qtd_pessoas + " pessoas.");
                for (int i = (andar_atual - 1); i > 0; i--) {
                    System.out.println("Descendo..." + i);
                    if (i == andar_pessoa) {
                        System.out.println("Voce chegou no seu andar!");
                        break;
                    }
                }
            }
        }
    }
    public static void movimento_elevador2 (int qtd_pessoas, int andar_atual, int andar_pessoa, int qtd_andares){
        int [] total_andares = new int[qtd_andares];
        if (andar_pessoa < qtd_andares | andar_atual < andar_pessoa) {
            if (andar_pessoa > andar_atual) {
                System.out.println("Elevador subindo com " + qtd_pessoas + " pessoas.");
                for (int i = andar_atual; i < total_andares.length; i++) {
                    System.out.println("Subindo..." + i);
                    if (i == andar_pessoa) {
                        System.out.println("Voce chegou no seu andar!");
                        break;
                    }
                }
            }
            if (andar_pessoa > qtd_andares | andar_atual > andar_pessoa) {
                System.out.println("Vamos Descer!");
                System.out.println("Elevador descendo com " + qtd_pessoas + " pessoas.");
                for (int i = (andar_atual - 1); i > 0; i--) {
                    System.out.println("Descendo..." + i);
                    if (i == andar_pessoa) {
                        System.out.println("Voce chegou no seu andar!");
                        break;
                    }
                }
            }
        }
    }
    public static void movimento_elevador3 (int qtd_pessoas, int andar_atual, int andar_pessoa, int qtd_andares){
        int [] total_andares = new int[qtd_andares];
        if (andar_pessoa < qtd_andares | andar_atual < andar_pessoa) {
            if (andar_pessoa > andar_atual) {
                System.out.println("Elevador subindo com " + qtd_pessoas + " pessoas.");
                for (int i = andar_atual; i < total_andares.length; i++) {
                    System.out.println("Subindo..." + i);
                    if (i == andar_pessoa) {
                        System.out.println("Voce chegou no seu andar!");
                        break;
                    }
                }
            }
            if (andar_pessoa > qtd_andares | andar_atual > andar_pessoa) {
                System.out.println("Vamos Descer!");
                System.out.println("Elevador descendo com " + qtd_pessoas + " pessoas.");
                for (int i = (andar_atual - 1); i > 0; i--) {
                    System.out.println("Descendo..." + i);
                    if (i == andar_pessoa) {
                        System.out.println("Voce chegou no seu andar!");
                        break;
                    }
                }
            }
        }
    }


}

