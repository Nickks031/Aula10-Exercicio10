// Nome: Nicolas
// Matrícula: 1222010390

public class Time {

    public String nome; 
    public String cidade; 
    public int titulos; 
    public Jogador artilheiro; 
    public Jogador goleiro;    

    public void apresentarTime() { 
        System.out.println("Clube: " + this.nome + " | Cidade: " + this.cidade); 
        System.out.println("Títulos conquistados: " + this.titulos); 
    }

    public void exibirDestaques() { 
        if (artilheiro != null) {
            System.out.print("[Destaque Ofensivo] -> ");
            artilheiro.exibirJogador(); 
        }
        if (goleiro != null) {
            System.out.print("[Paredão Azul] -> ");
            goleiro.exibirJogador(); 
        }
    }

    public void ganharTitulo(String nomeTitulo) { 
        this.titulos++; 
        System.out.printf("Festa em BH! O %s é o grande campeão da %s! Galeria atualizada: %d títulos!%n", 
            this.nome, nomeTitulo, this.titulos); 
        }
}
