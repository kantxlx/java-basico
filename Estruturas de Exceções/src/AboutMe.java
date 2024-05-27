import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Dighite seu nome: ");
        String nome = scanner.next();

        System.out.println("Dighite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Dighite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Dighite sua altura: ");
        float altura = scanner.nextFloat();

        //imprimindo dados obtidos pelo usuario
        System.out.println("Olá me chamo " + nome.toUpperCase() + " " + sobrenome + ", tenho " + idade + " anos e minha altura e de " + altura);
        scanner.close();
        }

        //deixando o campo  de erro de uma forma mais amigavel para o usuario
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisa ser numericos e assim a altura e para ser ultilizado '.' para os centimetros");
        }
    }
}
