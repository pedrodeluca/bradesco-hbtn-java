import provedores.Frete;

public class Pedido {
    public int codigo;
    public double peso;
    public double total;
    public Frete frete;

    public Pedido(int codigo, double peso, double total) {
        Frete frete = new Frete();
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
        this.frete = frete;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
