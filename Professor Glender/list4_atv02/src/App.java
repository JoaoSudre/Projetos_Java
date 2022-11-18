import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Fatura fatura = new Fatura();
        Produto produto1 = new Produto("Elden Ring",111,250);
        Produto produto2 = new Produto("Stardew Valley", 222, 25);
        Produto produto3 = new Produto("FIFA 23", 333, 300);

        int flag = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n     MENU:");
            System.out.println("1- Comprar" + "\n2- Ver fatura" + "\n3- Encerrar sistema");

            flag = sc.nextInt();

            if (flag == 1){
                produto1.exibir();
                produto2.exibir();
                produto3.exibir();

                System.out.print("Informe o código do produto: ");
                int codigoProduto = sc.nextInt();
                System.out.print("Informe a quantidade do produto: ");
                int qntProduto = sc.nextInt();

                if (produto1.getCodigo() == codigoProduto) {
                    Item itemComprado = new Item(produto1, qntProduto);
                    fatura.addItemNaLista(itemComprado);
                } else if(produto2.getCodigo() == codigoProduto) {
                    Item itemComprado = new Item(produto2, qntProduto);
                    fatura.addItemNaLista(itemComprado);
                } else if (produto3.getCodigo() == codigoProduto){
                    Item itemComprado = new Item(produto3, qntProduto);
                    fatura.addItemNaLista(itemComprado);
                }

            } else if (flag == 2){
                fatura.exibirFatura();
            }
        } while (flag != 3);

        sc.close();
    }
}