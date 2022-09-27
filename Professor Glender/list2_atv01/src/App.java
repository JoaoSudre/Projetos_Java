import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // ENTRADA

        double frequenciad = 0.00d;

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();

        System.out.print("Digite sua frequência: ");
        double frequencia = sc.nextDouble();

        // PROCESSAMENTO

        frequenciad = frequencia * 0.01;

        // SAÍDA

      if (frequenciad >= 0.75 && nota >= 7.0) {
        System.out.print("Aprovado");
      } else if (frequenciad >= 0.75 && nota >= 4.0) {
        System.out.print("Em recuperação");
      } else {
        System.out.print("Reprovado"); 
      }

      sc.close();
    } //
} //
