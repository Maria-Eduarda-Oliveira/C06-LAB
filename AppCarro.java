public class AppCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cor = "azul";
        carro1.marca = "fiat";
        carro1.modelo = "uno";
        carro1.velocidadeMax = 160.0;
        carro1.velocidadeAtual = 60.0;
        carro1.motor.potencia = 20;
        carro1.motor.tipo = "a";

        carro2.cor = "rosa";
        carro2.marca = "BMW";
        carro2.modelo = "X6";
        carro2.velocidadeMax = 200.0;
        carro2.velocidadeAtual = 100.0;
        carro2.motor.potencia = 40;
        carro2.motor.tipo = "b";

        System.out.println("Dados sobre o carro1:");
        carro1.liga();
        carro1.acelerar();
        carro1.mostraInfo();

        System.out.println();
        System.out.println("Dados sobre o carro2:");
        carro2.liga();
        carro2.acelerar();
        carro2.mostraInfo();
    }
}
