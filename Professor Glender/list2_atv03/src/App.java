import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //ENTRADA 

        double desconto = 0.0d;
        double vale = 0.0d;
        double restante = 0.0d;
        double valorfinal = 0.0d;

        System.out.print("Digite seu salario bruto: ");
        double salario = sc.nextDouble();

        System.out.print("Digite seu primeiro boleto: ");
        double boleto1 = sc.nextDouble();
        System.out.print("Digite seu segundo boleto: ");
        double boleto2 = sc.nextDouble();
        System.out.print("Digite seu terceiro boleto: ");
        double boleto3 = sc.nextDouble();
        System.out.print("Digite seu quarto boleto: ");
        double boleto4 = sc.nextDouble();

        //PROCESSAMENTO

        desconto = salario * 0.125;
        vale = salario * 0.06;
        restante = salario - desconto - vale;
        valorfinal = restante - boleto1 - boleto2 - boleto3 - boleto4;

        //SAIDA

        if (valorfinal > 0) {
            System.out.print("O valor restante de seu salário é de: " + valorfinal);
        } else {
            System.out.print("Deu ruim");
        }

        sc.close();
        
    }//
}//
