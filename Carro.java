public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor;

    public Carro() {
        this.motor = new Motor();
    }
    void liga(){
        System.out.println("O carro está sendo ligado...");
    }
    void acelerar(){
        System.out.println("O carro está acelerando...");
    }
    void mostraInfo(){
        System.out.println("A cor do carro é: "+cor);
        System.out.println("A marca do carro é: "+marca);
        System.out.println("O modelo do carro é: "+modelo);
        System.out.println("A velocidade máxima do carro é: "+velocidadeMax);
        System.out.println("A velocidade atual do carro é: "+velocidadeAtual);
        System.out.println("A potência do motor do carro é: "+motor.potencia);
        System.out.println("O tipo do motor do carro é: "+motor.tipo);
    }
}
