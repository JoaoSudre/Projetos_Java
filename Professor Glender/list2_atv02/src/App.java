import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //ENTRADA

        System.out.print("Altura: ");
        int aa = sc.nextInt();
        System.out.print("Beleza: ");
        int bb = sc.nextInt();
        System.out.print("Carisma: ");
        int cc = sc.nextInt();

        //SAIDA

        if (aa > 7 && bb > 7 && cc > 7) {
            System.out.print("Booooraa");
        } else if ( aa > 7 && bb > 7 || aa > 7 && cc > 7 || cc > 7 && bb > 7) {
            System.out.print("só vai...");
        } else if ( aa > 7 || bb > 7 || cc > 7) {
            System.out.print("Fé em deus...");
        } else {
            System.out.print("Misericórdia");
        }

        sc.close();
    }//
}//
