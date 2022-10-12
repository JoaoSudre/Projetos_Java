import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String retorno = verificarNumero(n);

        System.out.println("O número " + n + " é " + retorno);
    }

    public static String verificarNumero(int n) {
        if (n <= 0) {
            return "N";
        } else {
            return "P";
        }
        
    }
}
