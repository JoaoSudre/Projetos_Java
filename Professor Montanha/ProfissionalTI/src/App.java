public class App {
    public static void main(String[] args) throws Exception {
        Profissional profissional = new Profissional();
        profissional.Nome = "Joaquim";
        profissional.SalarioMensalDesejado = 3000;

        //Login
        //Dados demográficos (sexo, idade, estado)
        //Formulário (quatro seleções finalistas)
        //Relatório (os mais votados, por faixa etária, sexo e estado)
        //Flutter (Android/Publicado na Loja Google)

        //Login (24 BD, 24 BE, 24 FE) = 96 horas (Médio/Complexo)
        //Dados demográficos (gênero (masculino, feminino, e prefiro não opinar), idade, estado) = 72 horas
        //Formulário (Quatro seleções finalistas) = 72 horas
        //Relatório (os mais votados, por faixa etária, sexo e estado) = 24 horas
        //1 4(1 = 24, 2 = 48, 3 = 72, 4 = 96)

        System.out.println("Nome do profissional: " + profissional.Nome);
        System.out.println("Salario desejado: " + profissional.SalarioMensalDesejado);
        System.out.println("Quantidade de horas no mês: " + profissional.CalculaHorasMensais());
        System.out.println("Valor hora: " + profissional.CalculaValorHora());

        ItemSistema itemLogin = new ItemSistema();
        itemLogin.nome = "Tela de login";
        itemLogin.complexidade = 4;

        double valortotal = profissional.CalculaValorHora() * itemLogin.CalculaEsforçoHoras();

        System.out.println("Item de sistema: " + itemLogin.nome);
        System.out.println("Complexidade do Item de Sistema: " + itemLogin.complexidade);
        System.out.println("Esforço do item de sistema: " + itemLogin.CalculaEsforçoHoras());

        System.out.println("Valor total do sistema: " + valortotal);
    }
}
