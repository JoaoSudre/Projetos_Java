import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite 5 numeros: ");
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        int x5 = sc.nextInt();

        System.out.println("Digite mais 5 numeros: ");

        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();
        int y4 = sc.nextInt();
        int y5 = sc.nextInt();

        sc.close();

        intercalarArgumentos(x1, x2, x3, x4, x5, y1, y2, y3, y4, y5);
    }

    private static void intercalarArgumentos(int x1, int x2, int x3, int x4, int x5, int y1, int y2, int y3, int y4, int y5) {

        System.out.println("O resultado de Z é: " + x1 + y1 + x2 + y2 + x3 + y3 + x4 + y4 + x5 + y5 );
        
    }

}
