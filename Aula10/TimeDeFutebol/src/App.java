// Nome: Nicolas
// Matrícula: 1222010390

public class App {
    public static void main(String[] args) {
        // Instanciando o articulador do time (Matheus Pereira)
        Jogador atacante = new Jogador();
        atacante.nome = "Matheus Pereira";
        atacante.posicao = "Meia-Atacante";
        atacante.numeroCamisa = 10;
        atacante.gols = 9;

        // Instanciando o goleiro (Cássio)
        Jogador goleiro = new Jogador();
        goleiro.nome = "Cássio Ramos";
        goleiro.posicao = "Goleiro";
        goleiro.numeroCamisa = 1;
        goleiro.gols = 0;

        // Instanciando e configurando o Time (Cruzeiro)
        Time cabuloso = new Time();
        cabuloso.nome = "Cruzeiro Esporte Clube";
        cabuloso.cidade = "Belo Horizonte - MG";
        cabuloso.titulos = 40; 
        cabuloso.artilheiro = atacante; 
        cabuloso.goleiro = goleiro;       

        // Executando os testes de comportamento
        cabuloso.apresentarTime();
        System.out.println("\n--- Pilares do Elenco ---");
        cabuloso.exibirDestaques();

        System.out.println("\n--- Momento do Jogo ---");
        atacante.marcarGol(); // Matheus Pereira marca e vai para 10 gols

        System.out.println("\n--- Apito Final! ---");
        cabuloso.ganharTitulo("Copa Libertadores 2026"); // Cruzeiro conquista a Libertadores
    }
}