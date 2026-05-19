// Nome: Nicolas
// Matrícula: 1222010390

public class App {
    public static void main(String[] args) {
        // Novo Hambúrguer 1
        Hamburguer monsterBacon = new Hamburguer();
        monsterBacon.nome = "Monster Bacon";
        monsterBacon.descricao = "Pão australiano, blend 180g, muito bacon e cheddar maçaricado";
        monsterBacon.preco = 42.00;

        // Novo Hambúrguer 2
        Hamburguer duploCheese = new Hamburguer();
        duploCheese.nome = "Duplo Cheese Smash";
        duploCheese.descricao = "Pão brioche, dois smash burgers e o dobro de queijo prato";
        duploCheese.preco = 34.90;

        // Novo Pedido (#105) para Lucas Silva
        Pedido novoPedido = new Pedido();
        novoPedido.numeroPedido = 105;
        novoPedido.nomeCliente = "Lucas Silva";
        novoPedido.item1 = monsterBacon;
        novoPedido.item2 = duploCheese;

        // Fluxo de teste
        novoPedido.exibirPedido();
        System.out.println("\nProcessando pagamento...");
        novoPedido.pagar();
        novoPedido.exibirPedido();
    }
}