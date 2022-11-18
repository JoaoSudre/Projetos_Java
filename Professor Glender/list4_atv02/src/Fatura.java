import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> lista = new ArrayList<Item>();
    private Item compra = new Item();
    private Double valorF;

    public Fatura() {
        valorF = compra.getValorTotItem();
    }

    public Fatura(Item compra) {
        this.lista.add(compra);
        this.valorF = valorF + compra.getValorTotItem();
    }

    public ArrayList<Item> getListaDeItems() {
        return lista;
    }

    public void setListaDeItems(ArrayList<Item> lista) {
        this.lista = lista;
    }
    public Double getValorFatura() {
        return valorF;
    }

    public void setValorFatura(Double valorF) {
        this.valorF = valorF;
    }
    public void addItemNaLista(Item compra){
        lista.add(compra);
        valorF = valorF + compra.getValorTotItem();
    }

    public void exibirFatura() {
        for (Item i : lista){
            System.out.println("\nNome: " + i.getProdutoComprado().getNome());
            System.out.println("Código: " + i.getProdutoComprado().getCodigo());
            System.out.println("Preço: " + i.getProdutoComprado().getPreco());
            System.out.println("Quantidade do item: " + i.getQntComprada());
            System.out.println("Valor total: " + i.getValorTotItem() + "\n");
        }   
        System.out.println("Valor total no carrinho : "+ valorF +" Reais");
    }
}