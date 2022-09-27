import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int kills;
        int assists;
        int deaths;
        String partida;

        //ENTRADA

        do {
            System.out.print("Numero de kills: ");
            kills = sc.nextInt();
            System.out.print("Numero de assists: ");
            assists = sc.nextInt();
            System.out.print("Numero de deaths: ");
            deaths = sc.nextInt();

         if (kills <= 5) {
                System.out.print("Noob \n" );
            } else if (kills >= 20) {
                System.out.print("Master \n" ); }

         if (deaths >= 20) {
            System.out.print("Houston, we have a problem \n");
         }

         if (assists >= 20) {
            System.out.print("Team work \n"); }

            System.out.println("A partida teve um vencedor?");
            partida = sc.nextLine();

        } while (!partida.equals("Sim"));

        sc.close();

    }//
}//
