public class OperadorTernario {
    
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        
        System.out.println(resultado);

        //forma abreviada

        //String resultado = a==b ?"Verdadeiro" : "Falso";
    }
}
