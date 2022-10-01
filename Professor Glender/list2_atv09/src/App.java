import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int anoI;
        int anoF;
        int ano;
        double dias = 0;

        System.out.println("Ano inicial: ");
        anoI = sc.nextInt();

        System.out.println("Ano final: ");
        anoF = sc.nextInt();

        for (ano = anoI; ano <= anoF; ano++){
            if (ano % 4 == 0){
                dias = dias +366;
            } else {
                dias = dias +365;
            }
        }
        sc.close();

        System.out.println("Total de dias: " + dias);

    }
}
