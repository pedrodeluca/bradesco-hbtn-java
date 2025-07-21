public class Sms extends Mensagem implements CanalNotificacao {

    public Sms() {
        super.setTexto("SMS");
        super.setTipoMensagem(TipoMensagem.LOG);
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SMS] {"
                + mensagem.getTipoMensagem() + "} - "
                + mensagem.getArquivo() + " - "
                + mensagem.getFormatoVideo());
    }
}
