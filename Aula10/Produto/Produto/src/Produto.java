// Nome: Nicolas
// Matrícula: 1222010390

public class Produto {
    // Atributos
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    // Métodos
    public void vender(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Erro: Estoque insuficiente para realizar a venda de " + quantidade + " unidades.");
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        }
    }

    public double calcularValorTotal() {
        return this.preco * this.quantidadeEstoque;
    }

    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d unidades%n", 
            this.nome, this.preco, this.quantidadeEstoque);
        System.out.printf("Valor total em estoque: R$ %.2f%n", this.calcularValorTotal());
    }
}