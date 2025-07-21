public class Email extends Mensagem implements CanalNotificacao {

    public Email() {
        super.setTexto("EMAIL");
        super.setTipoMensagem(TipoMensagem.LOG);
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[EMAIL] {"
                + mensagem.getTipoMensagem() + "} - "
                + mensagem.getArquivo() + " - "
                + mensagem.getFormatoVideo());
    }
}
