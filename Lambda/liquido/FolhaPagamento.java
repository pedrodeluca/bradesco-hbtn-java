public class FolhaPagamento {

    public static Double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculador) {
        return calculador.calcular(funcionario.getSalario());
    }
}
