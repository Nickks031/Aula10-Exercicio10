// Nome: Nicolas
// Matrícula: 1222010390

public class App {
    public static void main(String[] args) {
        // Instanciando o Goku
        Personagem heroi = new Personagem();
        heroi.nome = "Goku";
        heroi.classe = "Saiyajin";
        heroi.nivel = 50;
        heroi.pontosDeVidaMaximos = 500;
        heroi.pontosDeVida = 500;
        heroi.ataque = 120;
        heroi.defesa = 80;

        // Instanciando o Vegeta
        Personagem inimigo = new Personagem();
        inimigo.nome = "Vegeta";
        inimigo.classe = "Saiyajin";
        inimigo.nivel = 49;
        inimigo.pontosDeVidaMaximos = 480;
        inimigo.pontosDeVida = 480;
        inimigo.ataque = 125;
        inimigo.defesa = 75;

        System.out.println("--- O Combate dos Saiyajins Começou! ---");
        heroi.exibirStatus();
        inimigo.exibirStatus();

        System.out.println("\n-> Goku usa o Kaio-ken e acerta um combo!");
        heroi.atacar(inimigo); // Goku ataca Vegeta

        System.out.println("-> Vegeta revida com o Galick Gun!");
        inimigo.atacar(heroi); // Vegeta ataca Goku

        System.out.println("\n--- Status no Meio da Luta ---");
        heroi.exibirStatus();
        inimigo.exibirStatus();

        System.out.println("\n-> Goku come uma Semente dos Deuses (Senzu Bean)!");
        heroi.curar(100); // Recupera 100 de vida

        System.out.println("-> Goku supera seus limites!");
        heroi.subirNivel(); // Aumenta o nível e os atributos

        System.out.println("\n--- Status Final ---");
        heroi.exibirStatus();
    }
}