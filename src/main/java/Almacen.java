
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen {

    public String[] buffer; // Will store the Scheme operations
    public int cantidad; // Will keep track of how many operations are left in buffer.
    private long tareasRealizadas;// Will keep track of how many operations have been done.
    private String[] symbols;  //Symbols to create from
    private int lowerBound, upperBound;
    MainGUI GUIRefence;

    public Almacen(int size, MainGUI GUIReference, String symbols, int lowerBound, int upperBound) {
        this.buffer = new String[size];
        this.GUIRefence = GUIReference;
        this.symbols = new String[symbols.length()];
        for (int i = 0; i < this.symbols.length; i++) {
            this.symbols[i] = String.valueOf(symbols.charAt(i));
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound + 1;
        this.cantidad = 0;
    }

    public synchronized void producir(int id) {
        if (this.cantidad < this.buffer.length) {
            Random rand = new Random();
            for (int i = 0; i < this.buffer.length; i++) {
                if (this.buffer[i] == null) {
                    String operacion = ("(" + symbols[rand.nextInt(symbols.length)] + " " +  ThreadLocalRandom.current().nextInt(lowerBound, upperBound) + " " + ThreadLocalRandom.current().nextInt(lowerBound, upperBound) + ")");
                    this.buffer[i] = operacion;
                    this.cantidad += 1;
                    GUIRefence.setPercentage((this.cantidad * 100) / this.buffer.length);
                    GUIRefence.addRowProductorTable(id, operacion);
//                    synchronized (System.out) {
//                        System.out.println("Producido por  id #" + id + ": " + operacion);
//                    }
                    break;
                }
            }
        }
        //~ else{
        //~ try{
        //~ wait();
        //~ }catch (InterruptedException ex) {
        //~ Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        //~ }

        //~ }
    }

    public synchronized int consumir(int id) {
        if (this.cantidad != 0) {
            String producto = null;
            for (int i = 0; i < this.buffer.length; i++) {
                if (this.buffer[i] != null) {
                    producto = this.buffer[i];
                    this.buffer[i] = null;
                    this.cantidad -= 1;
                    break;
                }
            }

            String[] operacion = producto.split(" "); // Rearrange (+ a b) ---> a + b
            operacion[2] = operacion[2].replace(")", "");
            int resultado = 0;

            switch (operacion[0]) {
                case "(+":
                    resultado = Integer.parseInt(operacion[1]) + Integer.parseInt(operacion[2]);
                    break;
                case "(-":
                    resultado = Integer.parseInt(operacion[1]) - Integer.parseInt(operacion[2]);
                    break;
                case "(*":
                    resultado = Integer.parseInt(operacion[1]) * Integer.parseInt(operacion[2]);
                    break;
                case "(/":
                    resultado = Integer.parseInt(operacion[1]) / Integer.parseInt(operacion[2]);
                    break;
            }
            GUIRefence.setTareasRealizadasValue(++this.tareasRealizadas);
            GUIRefence.removeRowProductTable();
            GUIRefence.addRowConsumidorTable(id, producto, resultado + "");
//            synchronized (System.out) {
//                System.out.println("Consumido por  id #" + id + ": " + producto + " = " + resultado);
//            };
            return resultado;
        }
        return 0;
    }

//	public static void main(String[] args){
//		Almacen scheme = new Almacen();
//		
//		int noProd = 3;
//		int noCons = 5;
//		//~ for(int i = 1; i < Math.max(noProd,noCons) +1 ;i++){
//	        //~ new Productor(i,scheme).start();
//	        //~ new Consumidor(i,scheme).start();
//		//~ }
//		
//		for(int i = 1; i < noProd + 1 ; i++){
//			new Productor(i,scheme).start();
//		}
//		for(int i = 1; i < noCons + 1 ; i++){
//			new Consumidor(i,scheme).start();
//		}
//        
//        /*
//        Almacen scheme = new Almacen();
//        new Productor(1,scheme).start();
//        new Consumidor(2,scheme).start();
//         */
//	}
    //~ public static void main(String[] args){
    //~ System.out.println("Soy el Almacen");
    //~ //Productor empleado = new Productor();
    //~ Almacen SchemeINC = new Almacen();
    //~ for(int i = 0; i < SchemeINC.buffer.length; i++){
    //~ SchemeINC.buffer[i] = SchemeINC.producir();
    //~ try{
    //~ System.out.println(" Producto " + i + ": " + SchemeINC.buffer[i] + " = " + SchemeINC.consumir(SchemeINC.buffer[i] ));
    //~ }
    //~ catch(ArithmeticException e){
    //~ System.out.println(" Producto " + i + ": " + SchemeINC.buffer[i] + " = " + " 'DivisionEntre0 ");
    //~ }
    //~ }
    //~ System.out.println("Storage: " + SchemeINC.cantidad);
    //~ }
}
