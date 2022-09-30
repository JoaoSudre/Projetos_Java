import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int kills;
        int assists;
        int deaths;
        int killsT = 0;
        int assistsT = 0;
        int deathsT = 0;
        int numeral = 0;
        boolean partida = false;

        //ENTRADA

      while (partida == false) {

        numeral++;

        System.out.println("Partida " + numeral);

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

        killsT = killsT + kills;
        deathsT = deathsT + deaths;
        assistsT = assistsT + assists;

        System.out.println("Kills da rodada: " + kills);
        System.out.println("Deaths da rodada: " + deaths);
        System.out.println("Assists da rodada: " + assists);

        System.out.println("Kills total: " + killsT);
        System.out.println("Deaths total: " + deathsT);
        System.out.println("Assists total: " + assistsT);

        System.out.println("A partida teve um vencedor? (true/false)");
        partida = sc.nextBoolean();
      }

      System.out.println("Fim da partida.");

      sc.close();

    }//
}//
