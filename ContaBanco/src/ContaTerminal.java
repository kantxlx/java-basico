import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int Numero;
        String NomeCliente;
        String Sobrenome;
        String Agencia;
        Double Saldo;
        
        //exbir mensagens para os usuarios
        System.out.println("Por favor, digite seu nome!");
        //obter Pelo scanner os valores digitados no terminal
        NomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome agora!");
        Sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        Agencia = scanner.next();

        System.out.println("Por favor, digite o numero da conta!");
        Numero = scanner.nextInt();

        System.out.println("Por favor, digite o valor que deseja colocar na conta!");
        Saldo = scanner.nextDouble();

        //exibir a mensagem conta criada
        System.out.println("Olá " + NomeCliente + " "+ Sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de " + Saldo + " reais já está disponível para saque");

    }
}
