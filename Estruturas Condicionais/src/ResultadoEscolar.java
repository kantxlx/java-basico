import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Condicional composta e encadeada
        int nota;

        System.out.println("Digite a nota do aluno:");
        nota = scanner.nextInt();

        if(nota >= 7)
            System.out.println("Aprovado!");
            else if(nota >= 5 && nota < 7)
                System.out.println("O aluno está de recuperação");
        else
            System.out.println("Reprovado!");

        /* Podemos usar tambem condição ternária para a abreviação do codigo, como por exemplo:
         *
         * String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "O Aluno está de recuperação" : "Reprovado";
         * System.out.println(resultado);
         */
    }
}
