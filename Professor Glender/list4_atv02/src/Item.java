public class Item {
    private Produto produtoC = new Produto();
    private int compraQ;
    private double valorT;

    public Item() {
        produtoC.setNome("");
        produtoC.setCodigo(0);
        produtoC.setPreco(0.0);
        compraQ = 0;
        valorT = compraQ * produtoC.getPreco();
    }

    public Item(Produto produtoC, int compraQ) {
        this.produtoC = produtoC;
        this.compraQ = compraQ;
        this.valorT = compraQ * produtoC.getPreco();
    }

    public Produto getProdutoComprado() {
        return produtoC;
    }
    public void setProdutoComprado(Produto produtoC) {
        this.produtoC = produtoC;
    }

    public int getQntComprada() {
        return compraQ;
    }
    public void setQntComprada(int compraQ) {
        this.compraQ = compraQ;
    }

    public double getValorTotItem() {
        return valorT;
    }
    public void setValorTotItem(double valorT) {
        this.valorT = valorT;
    }
}