// Nome: Nicolas
// Matrícula: 1222010390

public class Hamburguer {
    public String nome;
    public String descricao;
    public double preco;

    public void exibir() {
        System.out.printf("%s (%s) - R$ %.2f%n", this.nome, this.descricao, this.preco);
    }
}