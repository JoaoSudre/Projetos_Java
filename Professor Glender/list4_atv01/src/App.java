import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa(null, null, 0, 0, 0, 0, null, null);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu Nome:");
        p.setNome(sc.next());

        System.out.println("Digite seu Sobrenome:");
        p.setSobrenome(sc.next());

        System.out.println("Digite sua data de Nascimento" + "\n-Dia:");
        int dia = sc.nextInt();

        System.out.println("-Mês:");
        int mes = sc.nextInt();

        System.out.println("-Ano:");
        int ano = sc.nextInt();

        System.out.println("Digite sua altura:");
        p.setAltura(sc.nextDouble());
        
        System.out.println("Digite seu peso:");
        p.setPeso(sc.nextDouble());

        sc.close();

        Data dtNascimento = new Data(dia,mes,ano);

        p.CalculaIdade(dtNascimento);

        p.CalculaIMC(p.getPeso(), p.getAltura());
        
        p.InformaObesidade(p.getIMC());

        String nomeC = p.getNome() + " " + p.getSobrenome();

        System.out.println("Nome completo: "+ nomeC);
        System.out.println("Nome de referência: "+ p.getSobrenome() + ", " + p.getNome().toUpperCase());
        System.out.println("Idade: "+ p.getIdade());
        System.out.println("Peso: "+ p.getPeso());
        System.out.println("Altura: "+ p.getAltura());
        System.out.println("IMC: "+ p.getIMC());
        System.out.println("Classifição: "+ p.getClassificacao());
    }
}