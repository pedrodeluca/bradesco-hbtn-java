import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        symbols.setDecimalSeparator(',');

        DecimalFormat formatador = new DecimalFormat("#0.000000", symbols);

        return "[" + this.codigo + "] " + this.nome + " " + this.cargo + " " + this.idade + " R$ " + formatador.format(this.salario);
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }

    public String getCargo() {
        return this.cargo;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getSalario() {
        return this.salario;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
