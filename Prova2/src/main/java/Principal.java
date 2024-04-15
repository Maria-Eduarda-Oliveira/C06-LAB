public class Principal {
    public static void main(String[] args) {

        Personagem mago = new Mago("Mago", 100, 60, 80);
        Personagem assassino = new Assassino("Assassino", 100, 70, 60);
        Personagem guerreiro = new Guerreiro("Guerreiro", 100, 80, 70);

        mago.usarHabilidade();
        assassino.usarHabilidade();
        guerreiro.usarHabilidade();
        mago.mostrarCaracteristicas();
        assassino.mostrarCaracteristicas();
        guerreiro.mostrarCaracteristicas();

    }
}
