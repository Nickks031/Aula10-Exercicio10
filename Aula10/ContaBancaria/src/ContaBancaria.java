// Nome: Nicolas
// Matrícula: 1222010390

public class ContaBancaria {
    // Atributos
    public String titular;
    public String numeroConta;
    public double saldo;

    // Métodos
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro: Apenas valores positivos podem ser depositados.");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar o saque de R$ " + valor);
        }
    }

    public void exibirExtrato() {
        System.out.println("====== Extrato ======");
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
        System.out.println("=====================");
    }
}