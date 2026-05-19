// Nome: Nicolas
// Matrícula: 1222010390

public class Jogador {
    // Atributos sugeridos 
    public String nome; 
    public String posicao; 
    public int numeroCamisa; 
    public int gols;

    public void marcarGol() { 
        this.gols++; 
        System.out.printf("GOOOOL! %s balança as redes! Total: %d gols na temporada.%n", this.nome, this.gols);
    }

    public void exibirJogador() { 
        System.out.printf("%s | Camisa %d (%s) | Gols: %d%n", 
            this.nome, this.numeroCamisa, this.posicao, this.gols);
    }
}