import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {

    int id;
    int sleepTime;
    Almacen scheme;

    public Consumidor(int id, int sleepTime, Almacen scheme) {
        this.id = id;
        this.sleepTime = sleepTime;
        this.scheme = scheme;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                this.scheme.consumir(this.id);
            } catch (ArithmeticException e) {
                System.out.println("Consumido por  id #" + id + ": " + "'DivisionBy0 ");
            }
        }
    }

}
