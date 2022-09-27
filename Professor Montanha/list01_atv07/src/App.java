import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //ENTRADA

        System.out.print("Digite o lado do quadrado em metros: ");
        double lado = sc.nextDouble();

        //PROCESSAMENTO

        double area = lado * lado;
        double resultado = area * 2;

        //SAIDA

        System.out.print("O dobro da area deste quadrado é: " + resultado);


        sc.close();
    }
}
