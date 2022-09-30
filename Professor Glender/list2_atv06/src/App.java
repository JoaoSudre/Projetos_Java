import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //ENTRADA

        String resposta;

        System.out.print("Digite o valor da conta: ");
        double conta = sc.nextDouble();

        System.out.print("Digite o valor da dose: ");
        double dose = sc.nextDouble();

        //SAIDA

        do {

         System.out.println("\nOuvir mais um modão? (1 para não/2 para sim) ");
         resposta = sc.next();

         conta = conta + dose;
         conta = conta + (conta * 0.1);

         System.out.print("O valor da sua conta atual é de: " + conta);
         System.out.print("O valor da porcentagem é de: " + conta * 0.1);

        } while (resposta.equals("2"));

        sc.close();
    }
}
