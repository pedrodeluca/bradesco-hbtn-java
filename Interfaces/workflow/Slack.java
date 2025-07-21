public class Slack extends Mensagem implements CanalNotificacao {

    public Slack() {
        super.setTexto("SLACK");
        super.setTipoMensagem(TipoMensagem.LOG);
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SLACK] {"
                + mensagem.getTipoMensagem() + "} - "
                + mensagem.getArquivo() + " - "
                + mensagem.getFormatoVideo());
    }
}
