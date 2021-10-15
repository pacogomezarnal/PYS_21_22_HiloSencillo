package CiudadMultiHilo;

public class PersonaHilo extends Thread{
	private String nombre;
	private int km;
	
	public PersonaHilo(String nombre,int km) {
		this.nombre=nombre;
		this.km=km;
	}
	public void run(){
		System.out.println("["+this.nombre+"] Comienza a caminar");
		for(int i=1;i<this.km;i++) {
			System.out.println("["+this.nombre+"] this.km:"+i);
			//Creamos la pausa para que la persona camine
			try
			{ 
				Thread.sleep(500); //0,5 segundos 
			}catch(InterruptedException e ) { 
				Thread.currentThread().interrupt();
			}
		}
	}

}