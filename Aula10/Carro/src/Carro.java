// Nome: Nicolas
// Matrícula: 1222010390

public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual = 0;

    public void acelerar(double incremento) {
        velocidadeAtual += incremento;
        System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear(double decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public String retornaDados() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Velocidade Atual: " + velocidadeAtual + " km/h";
    }
}
