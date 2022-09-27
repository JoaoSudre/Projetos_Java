import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //ENTRADA

        System.out.print("Entre com o raio do círculo: ");
        double raio = sc.nextDouble();

        //PROCESSAMENTO

        double area = Math.PI * Math.pow(raio, 2);

        //SAÍDA

        System.out.print("A aréa do círculo é: " + area);

        sc.close();

    }
}
