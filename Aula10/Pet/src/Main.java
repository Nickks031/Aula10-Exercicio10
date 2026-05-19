// Nome: Nicolas
// Matrícula: 1222010390

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.nome = "Rex";
        pet.especie = "cachorro";
        pet.raca = "Labrador";
        pet.idade = 3;
        pet.peso = 28.5;

        pet.apresentar();
        pet.avaliarPeso(30.0);
    }
}