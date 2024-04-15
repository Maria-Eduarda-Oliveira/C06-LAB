public class Assassino extends Personagem implements LutarComArmas{
    Arma arma;
    public Assassino(String nome, int vida, int energia, int poder) {
        super(nome,vida,energia,poder);
        Arma arma = new Arma();
        arma.setNome("Arma");
        arma.setDano(10);
    }
    @Override
    public void atacar(Personagem personagem) {
        System.out.println("O assassino esta atacando o "+personagem.getNome());
        personagem.setVida(10);
    }

}
