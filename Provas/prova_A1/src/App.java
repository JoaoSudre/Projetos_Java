import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu peso em Kg: ");
        double peso = sc.nextDouble();

        System.out.println("Digite a quantidade de água ingerida no dia, em litros: ");
        double litrosDia = sc.nextDouble();

        double ideal = (peso * 0.035);

        double ingerir = ideal - litrosDia;

        System.out.println("Nome: " + nome);

        System.out.println("Peso: " + peso + "Kg");

        System.out.println("Quantidade de água ingerida: " + litrosDia + " litros");

        System.out.println("Quantidade ideal de água a ingerir: " + Math.ceil(ideal) + " litros");

        if (ingerir < 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária");
        } else {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + Math.ceil(ingerir) + " litros! Você consegue!");
        }

        sc.close();
    }
}
