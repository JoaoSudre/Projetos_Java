import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite três argumentos para a soma: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        sc.close();

        somaArgumentos(x, y, z);
    }

    private static void somaArgumentos(int x, int y, int z) {

        int soma = x + y + z;
        System.out.println("A soma dos três argumentos é de: " + soma);
        
    }
}
