import java.util.ArrayList;

public class Pedido {

    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int quantidadeCaixas = 0;

        for (PedidoCookie pedidoCookie : cookies) {
            quantidadeCaixas += pedidoCookie.getQuantidadeCaixas();
        }

        return quantidadeCaixas;
    }

    public int removerSabor(String sabor) {
        int quantidadeRemovida=0;

        for (int i=0 ; i<cookies.size() ; i++) {
            if (cookies.get(i).getSabor().equals(sabor)) {
                quantidadeRemovida += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
                i--;
            }
        }
        return quantidadeRemovida;
    }
}
