import atividades.CarregarVideo;
import atividades.CodificarVideo;
import atividades.EnviarEmail;
import atividades.ModificarStatusVideo;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    public List<String> workflowList = new ArrayList<>();

    public List<String> getWorkflowList() {
        return workflowList;
    }

    public void registrarAtividade(CarregarVideo carregarVideo) {
        this.workflowList.add(carregarVideo.executar());
    }

    public void registrarAtividade(CodificarVideo codificarVideo) {
        this.workflowList.add(codificarVideo.executar());
    }

    public void registrarAtividade(EnviarEmail enviarEmail) {
        this.workflowList.add(enviarEmail.executar());
    }

    public void registrarAtividade(ModificarStatusVideo modificarStatusVideo) {
        this.workflowList.add(modificarStatusVideo.executar());
    }

}
