import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {

    int id;
    int sleepTime;
    private volatile boolean running;
    Almacen scheme;

    public Consumidor(int id, int sleepTime, Almacen scheme) {
        this.id = id;
        this.sleepTime = sleepTime;
        this.scheme = scheme;
        this.running = true;
    }
    
    public void end(){
        this.running = false;
        synchronized (System.out) {
            System.out.println("Consumidor #" + this.id + " ha dejado de comprar");
        }
    }

    @Override
    public void run() {
        while (this.running) {
            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.scheme.consumir(this.id);
        }
    }

}
