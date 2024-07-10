package teste.springbot.BancoDigital;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        registrarTransacao("Saque", valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        registrarTransacao("Depósito", valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        registrarTransacao("Transferência", valor);
    }

    protected void imprimirExtratoContas() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("Transações: ");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    private void registrarTransacao(String tipo, double valor) {
        Transacao transacao = new Transacao(tipo, valor);
        transacoes.add(transacao);
    }
}

