public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo; //Valor minimo para conta não ser taxada
    private double valorPenalidade; //Valor da penalidade a aprivar a conta em que o saldo esteja abaixo do minimo

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();

        if (super.getSaldo() < this.saldoMinimo) {
            super.setSaldo(super.getSaldo() - this.valorPenalidade);
        }
    }
}
