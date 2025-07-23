import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0)
            this.saldo += valor;
        else
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor < 0)
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        if (valor > this.saldo)
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");

        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        if (this.saldo * 10 / 100 < 10)
            return this.saldo * 10 / 100;
        else
            return 10;
    }

    public double calcularJurosMensal() {
        if (this.saldo < 0)
            return 0;
        //nao entendi essa regra abaixo
        if (this.saldo * 10 / 100 > 10)
            return this.saldo * 10 / 100;
        else
            return 0;
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = this.saldo - this.calcularTarifaMensal() + this.calcularJurosMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
