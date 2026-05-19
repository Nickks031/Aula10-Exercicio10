// Nome: Nicolas
// Matrícula: [Sua Matrícula Aqui]

public class Pedido {
    public int numeroPedido;
    public String nomeCliente;
    public Hamburguer item1; // Composição de objetos [cite: 345]
    public Hamburguer item2; // Pode ser null [cite: 315]
    public boolean pago;

    public double calcularTotal() {
        double total = 0;
        if (item1 != null) {
            total += item1.preco;
        }
        if (item2 != null) {
            total += item2.preco;
        }
        return total;
    }

    public void pagar() {
        this.pago = true;
    }

    public void exibirPedido() {
        System.out.println("===== PEDIDO #" + this.numeroPedido + " =====");
        System.out.println("Cliente: " + this.nomeCliente);
        if (item1 != null) {
            System.out.println("Item 1: " + item1.nome);
        }
        if (item2 != null) {
            System.out.println("Item 2: " + item2.nome);
        }
        System.out.printf("Total: R$ %.2f%n", this.calcularTotal());
        System.out.println("Status: " + (this.pago ? "PAGO" : "PENDENTE"));
    }
}