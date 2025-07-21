public class MaquinaWorkflow extends Workflow{

    public void executar(Workflow workflow) {
        for (String s : workflow.getWorkflowList()) {
            System.out.println(s);
        }
    }
}
