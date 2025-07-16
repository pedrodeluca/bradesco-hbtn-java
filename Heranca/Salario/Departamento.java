public class Departamento {

    public double valorMeta;
    public double valorAtingidoMeta;

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta() {
        if (this.valorMeta < valorAtingidoMeta)
            return true;

        return false;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public double retornaValorSuperadoDaMeta(){
        if (this.valorAtingidoMeta > this.valorMeta) {
            return this.valorAtingidoMeta - this.valorMeta;
        }
        return 0;
    }
}
