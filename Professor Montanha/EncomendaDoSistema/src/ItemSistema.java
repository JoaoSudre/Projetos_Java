public class ItemSistema {
    public String nome;
    public int complexidadeEntradaSaidaDados;
    public int complexidadeConsultaDados;
    public int complexidadeGravarDados;

    public int CalculaEsforçoEntradaSaidaDados() {
        //1 3(1 = 8, 2 = 12, 3 = 16)
        switch (complexidadeEntradaSaidaDados) {
            case 1:
                return 8;
            case 2:
                return 12;
            case 3:
                return 16;
            default:
                return -1;
        }
    }
    public int CalculaEsforçoConsultaDados() {
        //1 3(1 = 4, 2 = 6, 3 = 8)
        switch (complexidadeConsultaDados) {
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }
    public int CalculaEsforçoGravarDados() {
        //1 3(1 = 16, 2 = 24, 3 = 36)
        switch (complexidadeGravarDados) {
            case 1:
                return 16;
            case 2:
                return 24;
            case 3:
                return 36;
            default:
                return -1;
        }
    }
}
