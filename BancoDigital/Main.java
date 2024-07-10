package teste.springbot.BancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente douglas = new Cliente("Douglas", "12345678900", new Endereco("Rua 1", "Cidade", "Estado", "12345-678"));
        
        Conta cc = new ContaCorrente(douglas);
        Conta poupanca = new ContaPoupanca(douglas);

        cc.depositar(50);
        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
