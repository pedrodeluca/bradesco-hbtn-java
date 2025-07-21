public class Teams extends Mensagem implements CanalNotificacao {

    public Teams() {
        super.setTexto("TEAMS");
        super.setTipoMensagem(TipoMensagem.LOG);
    }


    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[TEAMS] {"
                + mensagem.getTipoMensagem() + "} - "
                + mensagem.getArquivo() + " - "
                + mensagem.getFormatoVideo());
    }
}
