// Nome: Nicolas
// Matrícula: 1222010390

public class Personagem {
    // Atributos sugeridos pela lista
    public String nome;
    public String classe; // Ex: Saiyajin [cite: 256]
    public int nivel; 
    public int pontosDeVida; 
    public int pontosDeVidaMaximos; 
    public int ataque; 
    public int defesa; 

    // Métodos solicitados
    public void atacar(Personagem alvo) { 
        int dano = this.ataque - alvo.defesa; 
        if (dano < 1) {
            dano = 1; // Garante dano mínimo de 1 [cite: 265]
        }
        alvo.receberDano(dano);
    }

    public void receberDano(int dano) { 
        this.pontosDeVida -= dano; 
        if (this.pontosDeVida < 0) {
            this.pontosDeVida = 0; // Impede vida negativa [cite: 267]
        }
    }

    public void curar(int valor) { 
        this.pontosDeVida += valor; 
        if (this.pontosDeVida > this.pontosDeVidaMaximos) {
            this.pontosDeVida = this.pontosDeVidaMaximos; // Não ultrapassa o limite máximo [cite: 268]
        }
    }

    public boolean estaVivo() { 
        return this.pontosDeVida > 0; 
    }

    public void subirNivel() { 
        this.nivel++; 
        this.ataque += 15; // Aumento de poder de luta (Zenkai) [cite: 269]
        this.defesa += 8; 
        this.pontosDeVidaMaximos += 30; 
        this.pontosDeVida = this.pontosDeVidaMaximos;
    }

    public void exibirStatus() { 
        System.out.printf("[%s - %s Nv.%d] KI (HP): %d/%d | ATK: %d | DEF: %d%n", 
            this.nome, this.classe, this.nivel, this.pontosDeVida, this.pontosDeVidaMaximos, this.ataque, this.defesa);
    }
}