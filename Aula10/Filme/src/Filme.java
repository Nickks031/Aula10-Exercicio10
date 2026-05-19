// Nome: Nicolas
// Matrícula: 1222010390

public class Filme {
    // Atributos
    public String titulo;
    public String diretor;
    public int anoLancamento;
    public int duracao; // em minutos
    public double nota; // de 0 a 10

    // Métodos
    public String duracaoFormatada() {
        int horas = this.duracao / 60;
        int minutos = this.duracao % 60;
        return horas + "h " + minutos + "m";
    }

    public boolean recomendado() {
        return this.nota >= 7.0;
    }

    public void exibirDetalhes() {
        System.out.printf("Título: %s (%d)%n", this.titulo, this.anoLancamento);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Duração: " + this.duracaoFormatada());
        System.out.println("Nota: " + this.nota);
        System.out.println("Recomendado: " + (this.recomendado() ? "SIM" : "NÃO"));
    }
}