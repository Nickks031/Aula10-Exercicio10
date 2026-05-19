// Nome: Nicolas
// Matrícula: 1222010390

public class App {
    public static void main(String[] args) {
        Celular cel = new Celular();
        cel.marca = "Apple";
        cel.modelo = "Iphone 13 Pro";
        cel.bateria = 15;
        cel.ligado = false;
        cel.armazenamentoUsado = 50.0;
        cel.armazenamentoTotal = 256.0;

        cel.ligar();
        cel.carregarBateria(85);
        cel.usarArmazenamento(20.0);
        
        cel.exibirStatus();
    }
}