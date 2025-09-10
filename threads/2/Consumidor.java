public class Consumidor extends Thread {
    private final Fila fila;

    public Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = fila.retirar();
                System.out.println("Consumidor " + this.getId() + " consumiu: " + item);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // Thread interrompida, encerra execucao
        }
    }
}
