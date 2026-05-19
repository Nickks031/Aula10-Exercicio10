// Nome: Nicolas
// Matrícula: 1222010390

public class Pet {
    // Atributos
    public String nome;
    public String especie;
    public String raca;
    public int idade;
    public double peso;

    // Métodos
    public void apresentar() {
        System.out.printf("Olá! Meu nome é %s, sou um %s da raça %s. Tenho %d anos e peso %.1f kg.%n", 
            this.nome, this.especie, this.raca, this.idade, this.peso);
    }

    public void aniversario() {
        this.idade++;
        System.out.println("Parabéns, " + this.nome + "! Agora você tem " + this.idade + " anos!");
    }

    public void avaliarPeso(double pesoIdeal) {
        if (this.peso < pesoIdeal) {
            System.out.printf("%s está abaixo do peso ideal (%.1f kg).%n", this.nome, pesoIdeal);
        } else if (this.peso > pesoIdeal) {
            System.out.printf("%s está acima do peso ideal (%.1f kg).%n", this.nome, pesoIdeal);
        } else {
            System.out.printf("%s está no peso ideal (%.1f kg).%n", this.nome, pesoIdeal);
        }
    }
}