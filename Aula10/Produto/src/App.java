// Nome: Nicolas
// Matrícula: 1222010390

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caneta Azul";
        produto.preco = 2.50;
        produto.quantidadeEstoque = 100;

        produto.vender(30);
        produto.exibirInformacoes();
    }
}