import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] mes = {"1.Janeiro", "2.Fevereiro", "3.Março", "4.Abril", "5.Maio", "6.Junho", "7.Julho", "8.Agosto", "9.Setembro", "10.Outubro", "11.Novembro", "12.Dezembro"};
        double[] media = new double[12];
        int flag = 0; 
        int maiorT = 0; 
        int menorT = 0;
        double maiorT2 = 0; 
        double menorT2 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < media.length; i++) {
            System.out.print("Informe a temperatura média do mês "+ mes[i] +": ");
            media[i] = sc.nextDouble();
        }
        
        sc.close();

        for (int i = 0; i < media.length; i++) {
            if(flag == 0){
                maiorT2 = media[i];
                menorT2 = media[i];
                flag++;
            } else {
                if(media[i] > maiorT2){
                    maiorT2 = media[i];
                    maiorT = i;
                } else if (media[i] < menorT2){
                    menorT2 = media[i];
                    menorT = i;
                }
            }
        }
        
        System.out.println("A maior temperatura em um mês foi em "+ mes[maiorT] +" onde fizeram "+ maiorT2 +"°");
        System.out.println("A menor temperatura em um mês  foi em "+mes[menorT] +" onde fizeram "+ menorT2 +"°");
    }
}