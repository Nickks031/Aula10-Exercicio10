// Nome: Nicolas
// Matrícula: 1222010390

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Motorista Fantasma: Espírito de Vingança";
        filme.diretor = "Nicolas Cage";
        filme.anoLancamento = 2011;
        filme.duracao = 95;
        filme.nota = 9.9;

        filme.exibirDetalhes();
    }
}