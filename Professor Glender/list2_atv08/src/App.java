import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int multiplos = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                multiplos++;
            }
        }
        System.out.println("Entre 1 e 1000 há " +multiplos+" múltiplos de 2, 3 e 5");
        sc.close();
    }
}
