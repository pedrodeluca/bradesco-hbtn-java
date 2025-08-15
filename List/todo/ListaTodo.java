import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.stream()
                .filter(t -> t.getIdentificador() == tarefa.getIdentificador())
                .findFirst()
                .ifPresent(t -> {
                    throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
                });

        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
            }
        }
        return false;
    }

    public void desfazerTodas() {
//        for (Tarefa tarefa : tarefas) {
//            tarefa.setEstahFeita(false);
//        }
        tarefas.stream().filter(Tarefa::getEstahFeita)
                .filter(t -> t.getEstahFeita())
                .forEach(t -> {
                    t.setEstahFeita(false);
                });
    }

    public void fazerTodas() {
        tarefas.forEach(t -> {
            t.setEstahFeita(true);
        });
    }

    public void listarTarefas() {
        String status="";
        for (Tarefa tarefa : tarefas) {
            status = tarefa.getEstahFeita() ? "X" : " ";
            System.out.println("[" + status + "]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
        }
    }
}
