import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {     
        Scanner sc = new Scanner(System.in);           
        double[] valor = new double[10];
        int[] quantidade = new int[10];
        double[] valorT = new double[10];

        double salario = 545.00;
        double taxa = 0.05;
        double vendas = 0;
        double comissao;

        int maisVendido = 0;
        int posicaoV = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o preço do objeto: ");
            valor[i] = sc.nextDouble();
            System.out.print("Digite quantos objetos foram vendidos: ");
            quantidade[i] = sc.nextInt();
            System.out.println(" ");
        }
        
        for (int i = 0; i < 10; i++){
            valorT[i] = valor[i] * quantidade[i];

            if (quantidade[i] > maisVendido) {
                maisVendido = quantidade[i];
                posicaoV = i;
            }
        }
        for (int i = 0; i < 10; i++){
            vendas = vendas + valorT[i];
        }
        
        comissao = (vendas * taxa);
        salario = salario + comissao;

        for (int i = 0; i < 10; i++) {
            System.out.println("Quantidade de vendas: "+ quantidade[i]);
            System.out.println("Valor: "+ valor[i]);
            System.out.println("Valor total: "+ valorT[i] +"\n");            
        }

        System.out.println("Valor geral das vendas: "+ vendas);
        System.out.println("Total da comissão: "+ comissao);
        System.out.println("Total do salário: "+ salario +"\n");

        System.out.println("Valor do objeto mais vendido foi: "+ valor[posicaoV] +" , e sua posição no vetor é: "+ posicaoV);

        sc.close();
    }
}