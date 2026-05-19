// Nome: Nicolas
// Matrícula: 1222010390

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;

        meuCarro.acelerar( 40.0);
        meuCarro.frear( 10.0);
        meuCarro.retornaDados();

        Carro carro1 = new Carro();
        carro1.marca = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2019;
        carro1.acelerar(50.0);
        carro1.frear(20.0);
        carro1.retornaDados();

        System.out.println(carro1.retornaDados());
    }
}
