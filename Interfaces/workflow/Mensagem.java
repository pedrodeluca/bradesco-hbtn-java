public class Mensagem extends Video {

    private String texto;
    private TipoMensagem tipoMensagem;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public String getTexto() {
        return texto;
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }
}
