import java.util.Scanner;

public class Conversor{
    public static void main(String[] args) {
        //Declaração de variáveis
        double cel, fah; //cel - temperatura em graus celsius; fah - tempereratura em graus fahrenheit
        int op; // Opção do usuário

        //Criação instanciado objeto de entrada
        Scanner entrada = new Scanner (System.in);

        do{
            //Apresentação do programa
            System.out.println("\n\t\t\t -- Conversor --\n");

            //Menu
            System.out.println("1. ºC para °F");
            System.out.println("2. °F para °C");
            System.out.println("3. Sair");

            //Ler a opção escolhida pelo usuário
            System.out.print("\nOpção: ");
            op = entrada.nextInt();

            if(op == 1){
                //Entradas
                System.out.print("Informe a temperatura em °C: ");
                cel = entrada.nextDouble();

                //Processamento
                fah = cel * 9 / 5 + 32;

                //Saida
                System.out.println("\n" + cel + "°C = " + fah + "°F\n");
            } else if(op == 2){
                //Converter Fahrenheit para Celsius
                System.out.println("Em construção... aguarde!");
            } else if(op == 3){
                System.out.println("\nAbraço!!!");
            } else {
                System.out.println("Opção " + op + " incorreta!");
            }
        }while(op!=3);
    }
}