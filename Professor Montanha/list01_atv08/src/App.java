import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double salario;
        double horas;
        double total;

        //ENTRADA

        System.out.println("Quanto é o seu salário por hora?");
        salario = sc.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês?");
        horas = sc.nextDouble();

        //PROCESSAMENTO

        total = salario * horas;

        //SAÍDA

        System.out.print("O seu salario esse mês é de: " + total);

        sc.close();

    }//
}//
