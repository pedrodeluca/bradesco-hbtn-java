import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> {
    List<Midia> lista = new ArrayList<>();

    public void adicionarMidia(Midia dados) {
        this.lista.add(dados);
    }

    public List obterListaMidias() {
        return lista;
    }
}
