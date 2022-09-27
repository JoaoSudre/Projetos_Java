import java.util.Scanner;
public class App {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);

            //ENTRADA: PEÇA QUATRO NOTAS

            System.out.print("Digite sua primeira nota: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite sua segunda nota: ");
            double n2 = sc.nextDouble();
            System.out.print("Digite sua terceira nota: ");
            double n3 = sc.nextDouble();
            System.out.print("Digite sua quarta nota: ");
            double n4 = sc.nextDouble();

            //PROCESSAMENTO: CALCULAR A MEDIA

            double media = (n1 + n2 + n3 + n4)/4;

            //SAIDA: IMPRIMIR A MEDIA DAS NOTAS

            System.out.print("A média das notas é de:" + media);

            sc.close();


    }//
}//
