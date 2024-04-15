public abstract class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int poder;

    public Personagem(String nome, int vida, int energia, int poder) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }
    public void usarHabilidade(){
        System.out.println("Usando habilidade do " + nome);
    }
    public void mostrarCaracteristicas(){
        System.out.println("Nome do personagem: "+nome);
        System.out.println("Vida do personagem: "+vida);
        System.out.println("Energia do personagem: "+energia);
        System.out.println("Poder do personagem: "+poder);
    }
    public String getNome() {
        return nome;
    }
    public void setVida(int vida) {
        this.vida -= vida;
    }
}
