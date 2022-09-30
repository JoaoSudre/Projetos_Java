import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int flag =0;
        int count = 0;
        int maior = 0;
        int menor = 0;
        int idade = 0;
        do {
            System.out.println("Digite o Sexo\n1 - Masculino\n2 - Feminino");
            int sexo = sc.nextInt();

            System.out.println("Digite a cor dos olhos\n1 - Azuis\n2 - Verdes\n3 - castanhos");
            int olhos = sc.nextInt();

            System.out.println("Digite a cor dos cabelos\n1 - Loiros\n2 - Pretos\n3 - castanhos");
            int cabelo = sc.nextInt();

            System.out.println("Digite a idade:");
            idade = sc.nextInt();

            if (flag == 0){
                flag = 1;
                maior = idade;
                menor = idade; 
            }
            else {
                if (idade == -1){
                    break;
                }
                else if (idade > maior){
                    maior = idade;
                } else if (idade < menor){
                    menor = idade;
                }
            }
            if (sexo == 2 && idade >= 18 && idade <= 35 && olhos == 2 && cabelo == 1) {
                count++;
            } 
        } while (idade != -1);

        sc.close();

        System.out.println("A maior idade entre os habitantes é "+maior);
        System.out.println("A menor idade entre os habitantes é "+menor);
        System.out.println("A quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos loiros é "+count);
    }
}
