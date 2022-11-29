public class App {
    public static void main(String[] args) throws Exception {
        DadosDesenvolvedor dadosDesenvolvedor = new DadosDesenvolvedor();
        System.out.println("Nome do profissional: " + dadosDesenvolvedor.Nome);
        System.out.println("Salario desejado: " + dadosDesenvolvedor.SalarioMensalDesejado);
        System.out.println("Quantidade de horas no dia: " + dadosDesenvolvedor.HorasDia);
        System.out.println("Valor hora: " + dadosDesenvolvedor.Valorhora);

        //1 3(1 = 8, 2 = 12, 3 = 16)
        ItemSistema itemEntradasSaidas = new ItemSistema();
        itemEntradasSaidas.nome = "Telas com entradas e saídas de dados";
        itemEntradasSaidas.complexidadeEntradaSaidaDados = 1;
        
        //1 3(1 = 4, 2 = 6, 3 = 8)
        ItemSistema itemConsultaInfos = new ItemSistema();
        itemConsultaInfos.nome = "Telas de consultas com informação de dados";
        itemConsultaInfos.complexidadeConsultaDados = 3;

        //1 3(1 = 16, 2 = 24, 3 = 36)
        ItemSistema itemGravarDados = new ItemSistema();
        itemGravarDados.nome = "Gravação de dados";
        itemGravarDados.complexidadeGravarDados = 2;

        double valortotal = dadosDesenvolvedor.HorasTrabalhadasMes() * (itemEntradasSaidas.CalculaEsforçoEntradaSaidaDados() + itemConsultaInfos.CalculaEsforçoConsultaDados() + itemGravarDados.CalculaEsforçoGravarDados());

    
    }
}
