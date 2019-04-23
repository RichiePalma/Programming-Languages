import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen{
	
	public String[] buffer; // Will store the Scheme operations
	public int cantidad; // Will keep track of how many operations are left in buffer.
	
	public Almacen(){
		this.buffer = new String[100];
		this.cantidad = 0;
	}
	
	public synchronized void producir(){
		if(this.cantidad < this.buffer.length){
			String[] symbols = {"+", "-", "/" , "*"};
			Random rand = new Random();
			for(int i = 0; i < this.buffer.length; i++){
				if(this.buffer[i] == null){
					this.cantidad += 1;
					String  operacion = ("(" + symbols[rand.nextInt(symbols.length)] + " " + rand.nextInt(10) + " " + rand.nextInt(10) + ")");
					this.buffer[i] = operacion;
					System.out.println("Producido: "+ operacion);
				}
			}
		}
		//~ if(this.cantidad == 0){
			//~ String[] symbols = {"+", "-", "/" , "*"};
			//~ Random rand = new Random(); //This random will take care of generating random Scheme operations
			//~ this.cantidad += 1;
			//~ return ("(" + symbols[rand.nextInt(symbols.length)] + " " + rand.nextInt(10) + " " + rand.nextInt(10) + ")");
		//~ }else{
            //~ try{
                //~ wait();
            //~ }catch (InterruptedException ex) {
                //~ Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            //~ }

            
        //~ }
        //~ return null;
	}
	
	public  synchronized int consumir() {
		if(this.cantidad != 0){
			String producto = null;
			for(int i = 0; i < this.buffer.length; i++){
				if(this.buffer[i] != null){
					producto = this.buffer[i];
					this.buffer[i] = null;
					this.cantidad -= 1;
					break;
				}
			}
			
			String[] operacion = producto.split(" "); // Rearrange (+ a b) ---> a + b
			operacion[2] = operacion[2].replace(")","");
			int resultado = 0;
			
			switch (operacion[0]){
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
			System.out.println("Consumido: " + resultado);
			return resultado;
		}else{
            try{
                wait();
            }catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }

            
        }
        return 0;
	}
	
	public static void main(String[] args){
		Almacen scheme = new Almacen();
        new Productor(scheme).start();
        new Consumidor(scheme).start();
	}
	
	
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
