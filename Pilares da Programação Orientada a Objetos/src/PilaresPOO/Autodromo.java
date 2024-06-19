package PilaresPOO;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeta =new Carro();
        jeta.setChassi("123456");
        jeta.ligar();

        Moto z400 = new Moto();
        z400.setChassi("654321");
        z400.ligar();

    }
}
