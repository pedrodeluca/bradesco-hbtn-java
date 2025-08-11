import java.util.Formattable;
import java.util.Formatter;

import static java.lang.String.format;

public class Eletronico {
    String descricao;
    double valor;

    public Eletronico(String descricao, double valor) {
      this.descricao = descricao;
      this.valor = valor;
    }

    @Override
    public String toString() {
        String val = format("%.6f", valor);
        return "[" + descricao + "] R$ " + val;
    }
}
