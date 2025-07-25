import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes; //Quantidade de transações afetuadas na conta (saque / deposito)

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        cobrarTarifaPorTransacao();
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        cobrarTarifaPorTransacao();
    }

    public void cobrarTarifaPorTransacao() {
        if (super.getSaldo() >- 0.10)
            super.setSaldo(super.getSaldo() - 0.10);
    }
}
