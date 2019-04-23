import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread{
	
	Almacen scheme;
	
	public Consumidor(Almacen scheme){
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
					this.scheme.consumir();
			  }catch(ArithmeticException e){
					System.out.println("Comsumido: 'DivisionBy0 ");
				}  
       }
	}

	//~ public static void main(String[] args){
		//~ System.out.println(" Soy el consumidor");
	//~ }

}
