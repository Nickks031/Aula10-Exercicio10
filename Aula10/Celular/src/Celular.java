// Nome: Nicolas
// Matrícula: 1222010390

public class Celular {
    // Atributos
    public String marca;
    public String modelo;
    public int bateria; // 0 a 100
    public boolean ligado;
    public double armazenamentoUsado;
    public double armazenamentoTotal;

    // Métodos
    public void ligar() {
        if (this.bateria > 0) {
            this.ligado = true;
        } else {
            System.out.println("Não foi possível ligar: Celular sem bateria.");
        }
    }

    public void desligar() {
        this.ligado = false;
    }

    public void carregarBateria(int percentual) {
        this.bateria += percentual;
        if (this.bateria > 100) {
            this.bateria = 100;
        }
    }

    public void usarArmazenamento(double gb) {
        if (this.armazenamentoUsado + gb <= this.armazenamentoTotal) {
            this.armazenamentoUsado += gb;
        } else {
            System.out.println("Erro: Espaço de armazenamento insuficiente.");
        }
    }

    public void exibirStatus() {
        System.out.printf("%s %s %s%n", this.marca, this.modelo, (this.ligado ? "LIGADO" : "DESLIGADO"));
        System.out.println("Bateria: " + this.bateria + "%");
        System.out.printf("Armazenamento: %.1f GB / %.1f GB usados%n", this.armazenamentoUsado, this.armazenamentoTotal);
    }
}