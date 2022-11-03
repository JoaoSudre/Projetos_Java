import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        int posicao = 0;
        int soma = 0;
        int quant = 0;

        System.out.println("Informe 6 números:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("RELATÓRIO:");
        System.out.println("Os números pares são:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                posicao = i + 1;
                System.out.println("Número "+ array[i] +" na posição "+ posicao);
                soma = soma + array[i];
            } else {                
            }
        }
        System.out.println("Soma dos pares = "+ soma);

        System.out.println("\nOs números ímpares são:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
            } else {
                posicao = i + 1;
                System.out.println("Número "+ array[i] +" na posição "+ posicao);
                quant = quant + 1;
            }
        }
        System.out.println("Quantidade de ímpares = "+ quant);
        sc.close();
    }
}