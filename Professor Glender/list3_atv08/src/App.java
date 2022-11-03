import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double[][] vendas = new double[12][4];
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double[] valorM = new double[12];
        double[] valorS = new double[4];
        double vendasT = 0;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("\n" + mes[i]);
            int semana = 1;
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite o valor de vendas da semana "+ semana +": ");
                vendas[i][j] = sc.nextDouble();
                semana++;
            }
        }        

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                valorM[i] = valorM[i] + vendas[i][j];
            }
            vendasT = vendasT + valorM[i];
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                valorS[i] = valorS[i] + vendas[j][i]; 
            }
        }

        for (int i = 0; i < valorM.length; i++) {
            System.out.println("O total vendido no mês de " + mes[i] +" foi de: "+ valorM[i]);
        }
        for (int i = 0; i < valorS.length; i++) {
            System.out.println("O total vendido nas semanas durante todo o ano foi de: " + valorS[i]);
        }
        
        System.out.println("O total vendido no ano foi de: " + vendasT);

        sc.close();
    }
}