public class OperadoresRelacionais {
    
    public static void main(String[] args) {
        int numero1 = 4;
        int numero2 = 5;

        boolean simNao = numero1 == numero2;

        if(numero1< numero2){
            System.out.println("A nossa condição e verdadeira");
        }

        System.out.println("Numero um e igual a numero dois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero um e diferente de numero dois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero um e maior que numero dois? " + simNao);

        //comparacao textos
        String nomeUm = "Cauã";
        String nomeDois = new String("Cauã");

        System.out.println(nomeUm.equals(nomeDois));

    }
}
