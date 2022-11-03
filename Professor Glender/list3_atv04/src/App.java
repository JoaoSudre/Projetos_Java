import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] gabarito = new String[8];
        String[][] respostas = new String[10][8];
        int[] codigo = new int[10];
        int[] notas = new int[10];
        int porcentagem = 0;

        System.out.println("Informe o gabarito da prova: (Respostas de A ate E)");
        for (int i = 0; i < gabarito.length; i++){
            gabarito[i] = sc.next();
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o codigo do aluno: ");
            codigo[i] = sc.nextInt();
            System.out.println("Informe o gabarito do aluno:");
            for (int j = 0; j < 8; j++) {
                respostas[i][j] = sc.next();
                String resp = respostas[i][j];
                String gaba = gabarito[j];

                if (resp.equals("A") && gaba.equals("A")) {
                    notas[i]++;
                } else if (resp.equals("B") && gaba.equals("B")) {
                    notas[i]++;
                } else if (resp.equals("C") && gaba.equals("C")) {
                    notas[i]++;
                } else if (resp.equals("D") && gaba.equals("D")){
                    notas[i]++;
                } else if (resp.equals("E") && gaba.equals("E")){
                    notas[i]++;
                }
            }
            System.out.println(" ");
        }
        sc.close();

        for (int i = 0; i < 10; i++) {
            System.out.print("Aluno "+ codigo[i] +":\t"+ notas[i]);
            if (notas[i] >= 6) {
                porcentagem++;
            }
            System.out.println(" ");
        }
        porcentagem = 10 * porcentagem;
        System.out.println(porcentagem +"% de alunos aprovados");
    }
}