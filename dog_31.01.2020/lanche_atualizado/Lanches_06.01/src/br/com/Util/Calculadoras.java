package br.com.Util;

import java.util.Scanner;  
  
// 1) Evite usar métodos estáticos - mas neste caso não deve haver problemas.  
//  
// 2) Evite usar nomes de variáveis curtos (a menos que, como no caso desta calculadora, seja melhor usar  
// os nomes curtos)  
//   
// 3) Dentro de um "case", se precisar definir uma nova variável, é melhor então  
// pôr o conteúdo do "case" dentro de chaves.   
  
public class Calculadoras {  
    public static void main(String[] args) {  
  
        Scanner scn = new Scanner(System.in);  
        int fim = 0;  
        int escolha;  
  
        System.out.println("!!Calculadora Cientifica!!");  
  
        while (fim == 0) {  
  
            System.out.println("Menu");  
            System.out.println("1 - Raiz quadrada \n2 - Exponenciacao \n3 - Raizes de uma equacao de 2 grau \n4 - Area do retangulo \n5 - Fatorial \n8- Sair do programa");  
            System.out.println("Escolha sua opcao:");  
            escolha = scn.nextInt();  
  
            switch (escolha) {  
            case 1:  
                System.out.println("Digite um valor:");  
                int r = scn.nextInt();  
                System.out.println();  
                System.out.println("Resultado: " + raiz(r));  
                System.out.println();  
                break;  
            case 2: {  
                System.out.println("Digite um valor para a base:");  
                double b = scn.nextDouble();  
                System.out.println("Digite um valor para o expoente:");  
                double e = scn.nextDouble();  
                System.out.println();  
                System.out.println("Resultado: " + expoente(b, e));  
                System.out.println();  
            }  
                break;  
            case 3: {  
                System.out.println("Digite um valor para a:");  
                double a = scn.nextDouble();  
                System.out.println("Digite um valor para b:");  
                double b = scn.nextDouble();  
                System.out.println("Digite um valor para c:");  
                double c = scn.nextDouble();  
                double[] x = equacao(a, b, c);  
                if (x.length == 0) {  
                    System.out.println("Equacao nao tem raizes reais");  
                } else if (x.length == 1) {  
                    System.out.println("A unica raiz da equacao eh " + x[0]);  
                } else if (x.length == 2) {  
                    System.out.println("A equacao tem 2 raizes, " + x[0] + " e " + x[1]);  
                }  
            }  
                break;  
            case 4: {  
                System.out.println("Digite um valor para a base:");  
                double base = scn.nextDouble();  
                System.out.println("Digite um valor para a altura:");  
                double altura = scn.nextDouble();  
                System.out.println("Resultado: " + retangulo(base, altura));  
                System.out.println();  
            }  
                break;  
            case 5: {  
                System.out.println("Digite um valor:");  
                double f = scn.nextDouble();  
                System.out.println();  
                System.out.println("Resultado: " + fatorial(f));  
                System.out.println();  
            }  
                break;  
            case 8:  
                System.out.println("Espero que tenha ajudado. ");  
                fim++;  
                break;  
            default:  
                System.out.println("Digite uma opcao valida :) ");  
                System.out.println();  
            }  
  
        }  
    }  
  
    // metodo pra raiz  
    public static double raiz(double a) {  
        double r = Math.sqrt(a);  
        return r;  
    }  
  
    // metodo pra exponenciacao  
    public static double expoente(double b1, double e1) {  
        // pra calcular o expoente  
        double r2 = 1;  
        for (int x = 0; x < e1; x++) {  
            r2 = r2 * b1;  
        }  
        return r2;  
    }  
  
    // metodo para o retangulo  
    public static double retangulo(double base2, double altura2) {  
        double area = 0;  
        area = base2 * altura2;  
        return area;  
    }  
  
    // metodo para fatorial  
    public static double fatorial(double f) {  
        double fat = 1;  
        for (int x = 0; x < f; x++) {  
            fat = fat * (f - x);  
        }  
        return fat;  
    }  
  
    // metodo para as raizes  
    public static double[] equacao(double a, double b, double c) {  
        double delta = (b * b) - (4 * a * c);  
        if (delta == 0) {  
            return new double[] { (-b + Math.sqrt(delta)) / (2 * a)  
            };  
        } else if (delta > 0) {  
            return new double[] {  
                (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)  
            };  
        } else {  
            return new double[0];  
        }  
    }  
}  