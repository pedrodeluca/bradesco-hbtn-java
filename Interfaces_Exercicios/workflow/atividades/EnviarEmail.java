package atividades;

public class EnviarEmail implements Atividade {

    @Override
    public String executar() {
        return "enviando email com video";
    }
}
