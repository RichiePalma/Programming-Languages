import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread{
	
	int id;
	Almacen scheme;
	
	public Consumidor(int id, Almacen scheme){
		this.id = id;
		this.scheme = scheme;
	}
	
	@Override
	public void run(){
		while(true){
	        Random r = new Random(System.currentTimeMillis());
	            try {
	                Thread.sleep(100 * r.nextInt(10));
	            } catch (InterruptedException ex) {
	                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
	            }
	            
	           try{
					this.scheme.consumir(this.id);
			  }catch(ArithmeticException e){
					System.out.println("Consumido por  id #" + id + ": " + "'DivisionBy0 ");
				}  
       }
	}

}
