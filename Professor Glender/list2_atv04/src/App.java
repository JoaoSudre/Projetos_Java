import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //ENTRADA

        int n;

        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();


        //SAIDA

        for (int i = 1; i <= n; i++){;
            System.out.println("O valor de " + i + " elevado a " + i + " é de: " + Math.pow(i, i));
        }

        sc.close();

    }//
}//
