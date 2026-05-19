//Nicolas Ribeiro - 1222010390


public class App {
    public static void main(String[] args) throws Exception {
        
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.ano = 2020;

        meuCarro.acelerar(40);
        meuCarro.acelerar(20);  
        meuCarro.retornaDados();
        
        Carro carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Gol G5";
        carro1.ano = 2013;

        carro1.acelerar(60);
        carro1.frear(30);
        System.out.println(carro1.retornaDados());
    }
}
