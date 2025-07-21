import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo extends Mensagem{

    private List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        canais.add(canalNotificacao);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            Mensagem msg = new Mensagem();
            if (canal instanceof Sms) {
                msg.setTexto(((Sms) canal).getTexto());
                msg.setTipoMensagem(((Sms) canal).getTipoMensagem());
            } else if (canal instanceof Slack) {
                msg.setTexto(((Slack) canal).getTexto());
                msg.setTipoMensagem(((Slack) canal).getTipoMensagem());
            } else if (canal instanceof Teams) {
                msg.setTexto(((Teams) canal).getTexto());
                msg.setTipoMensagem(((Teams) canal).getTipoMensagem());
            } else if (canal instanceof Email) {
                msg.setTexto(((Email) canal).getTexto());
                msg.setTipoMensagem(((Email) canal).getTipoMensagem());
            }
            msg.setArquivo(video.getArquivo());
            msg.setFormatoVideo(video.getFormatoVideo());

            canal.notificar(msg);
        }
    }
}
