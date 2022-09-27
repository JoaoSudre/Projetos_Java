import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = x + y;

        scanner.close();
        
        System.out.println("A soma dos dois numeros é: " + z);
    }
}