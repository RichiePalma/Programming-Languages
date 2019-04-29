import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {

    int id;
    int sleepTime;
    private volatile boolean running;
    
    Almacen scheme;

    public Productor(int id, int sleepTime, Almacen scheme) {
        this.id = id;
        this.sleepTime = sleepTime;
        this.scheme = scheme;
        this.running = true;
    }
    
    public void end(){
        this.running = false;
         synchronized (System.out) {
        System.out.println("Productor #" + this.id + " ha dejado de trabajar");
         }
    }
    
    @Override
    public void run() {
        while (this.running) {
            try {
                Thread.sleep(this.sleepTime);
                this.scheme.producir(this.id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.print("Producido: ");
        }
    }
    //~ public String producir(){
    //~ String[] symbols = {"+", "-", "/" , "*"};
    //~ Random rand = new Random(); //This random will take care of generating random Scheme operations
    //~ return ("(" + symbols[rand.nextInt(symbols.length)] + " " + rand.nextInt(10) + " " + rand.nextInt(10) + ")");
    //~ }

    //~ public static void main(String[] args){
    //~ Productor employee = new Productor();
    //~ for(int i = 0; i < 100 ; i++){
    //~ System.out.println(employee.producir());
    //~ }
    //~ int resultado = Integer.parseInt("2") + Integer.parseInt("3");
    //~ System.out.println(resultado);
    //~ }
}
