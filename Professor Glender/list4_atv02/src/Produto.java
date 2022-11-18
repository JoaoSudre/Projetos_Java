public class Produto {
    private String nome;
    private int codigo;
    private double preco;

    public Produto() {
        nome = "";
        codigo = 0;
        preco = 0.0;
    }
    public Produto(String nome, int codigo, double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    } 

    public void exibir() {
        System.out.println("\nNome: "+ nome);
        System.out.println("Código: "+ codigo);
        System.out.println("Preço: "+ preco +"\n");
    }
}