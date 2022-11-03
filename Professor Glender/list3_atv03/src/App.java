import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] inteiros = new int[9];

        System.out.println("Digite 9 números inteiros: ");
        for (int i = 0; i<inteiros.length; i++){
            inteiros[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Números primos: ");
        
        for (int i = 0; i < inteiros.length; i++); {
            int n = inteiros[i];
            boolean primos = true;

            for (int j = 2; j < n; j++) {
                if(n % j == 0) {
                    primos = false;
                }
            }
            if (primos){
                System.out.println(n + " que estão na posição: " + i);
            }
        }
    }
}
