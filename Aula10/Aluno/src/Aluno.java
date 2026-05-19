//Nicolas
//1222010390

public class Aluno {
    // Atributos
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    // Métodos
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2.0;
    }

    public boolean aprovado() {
        return this.calcularMedia() >= 6.0;
    }

    public void exibirBoletim() {
        System.out.println("Aluno: " + this.nome + " | Matrícula: " + this.matricula);
        System.out.println("Nota 1: " + this.nota1 + " | Nota 2: " + this.nota2);
        System.out.printf("Média: %.2f%n", this.calcularMedia());
        System.out.println("Situação: " + (this.aprovado() ? "APROVADO" : "REPROVADO"));
    }
}