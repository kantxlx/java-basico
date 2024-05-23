import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int numero;
        String nomeCliente;
        String sobrenome;
        String agencia;
        Double saldo;
        
        //exbir mensagens para os usuarios
        System.out.println("Por favor, digite seu nome!");
        //obter Pelo scanner os valores digitados no terminal
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome agora!");
        sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o numero da conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o valor que deseja colocar na conta!");
        saldo = scanner.nextDouble();

        //exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + " "+ sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " reais já está disponível para saque");

    }
}
