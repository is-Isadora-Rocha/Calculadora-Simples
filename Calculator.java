package CalculadoraSimples;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean chave = true;
        while (chave) {
            double a, b;
            int menu;
            System.out.println("Digite o primeiro valor: ");
            Scanner coleta = new Scanner(System.in);
            a = coleta.nextDouble();

            System.out.println("Digite o segundo valor: ");
            coleta = new Scanner(System.in);
            b = coleta.nextDouble();

            System.out.println("Escolha a operação: ");
            System.out.println("(1) Soma");
            System.out.println("(2) Subtração");
            System.out.println("(3) Multiplicação");
            System.out.println("(4) Divisão");
            System.out.println("(5) Potenciação");
            System.out.println("(6) Porcentagem");
            System.out.println("(7) Origem");
            System.out.println("(8) Hipotenusa");
            System.out.println("(9) Sair");

            coleta = new Scanner(System.in);
            menu = coleta.nextInt();

            switch (menu) {
                case 1:
                    somar(a,b);
                    break;
                case 2:
                    subtracao(a,b);
                    break;
                case 3:
                    multiplicar(a,b);
                    break;
                case 4:
                    divisao(a,b);
                    break;
                case 5:
                    potencia(a,b);
                    break;
                case 6:
                    porcentagem(a,b);
                    break;
                case 7:
                    origem(a,b);
                    break;
                case 8:
                    hipotenusa(a,b);
                    break;
                default:
                    chave = false;
                    break;
            }
        }
    }

    public static void somar(double a, double b) { //1
        double c = a+b;
        System.out.println(" "+c);
    }

    public static void subtracao(double a, double b) { //2
        double c = a-b;
        System.out.println(" "+c);
    }

    public static void multiplicar(double a, double b) { //3
        double c = a*b;
        System.out.println(" "+c);
    }

    public static void divisao(double a, double b) { //4
        double c = a/b;
        System.out.println(" "+c);
    }

    public static void potencia(double base, double exp){ //5

        double resultado = base;
        for(int i = 0; i< (int)exp; i++){
            resultado = resultado * base;
            System.out.println("A potência é "+resultado);
        }
    }

    public static void porcentagem(double a, double b){ //6
        double porcenta = (a * 100 / b);
        System.out.println("O valor da porcentagem é: "+porcenta+ "%");
    }

    public static void origem(double a, double b){
        double distancia = Math.sqrt((Math.pow(a,2+Math.pow(b,2))));
        System.out.println("O valor da origem é: "+distancia);
    }
    public static void hipotenusa(double a, double b){
        double hipo = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("O resultado dos catetos "+a+ " e " +b+ " = " +hipo);
    }
}
