public class Operadores2 {
    
    public static void main(String[] args) {
        int numero = 5;
        
        System.out.println(numero);
        //numero passar a ser negativo usando (-)
        System.out.println(- numero);

        numero = - numero;
        System.out.println(numero);
        //deixando novamente o numero positivo
        numero = numero * -1;
        System.out.println(numero);

        //x repeticao

        numero++;
        //e a mesma representacao de numero = numero + 1;
        System.out.println(numero);

        //negando uma variavel booleana

        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);
    }
}
