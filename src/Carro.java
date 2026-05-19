//Nicolas Ribeiro - 1222010390

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    private double velocidadeAtual;

    public Carro() { 
    }

    public void acelerar(double incremento) {
        velocidadeAtual += incremento;
    }

    public void frear(double decremento){
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public String retornaDados(){
        return "Marca: " + marca + "| Modelo: " + modelo + "| Ano: " + ano + "| Velocidade Atual: " + velocidadeAtual;
    }
}
