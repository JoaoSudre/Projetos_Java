import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //ENTRADA

        System.out.print("Entre com a primeira medida em metros: ");
        double metros = sc.nextDouble();

        //PROCESSAMENTO

        double centimetros = metros * 100;

        //SAIDA
        System.out.print("A sua medida em centímetros é: " + centimetros);

        sc.close();
    }
}
