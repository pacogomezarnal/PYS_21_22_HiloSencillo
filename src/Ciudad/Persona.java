package Ciudad;

public class Persona {
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	public void camina(int km) {
		System.out.println("["+this.nombre+"] Comienza a caminar");
		for(int i=1;i<km;i++) {
			System.out.println("["+this.nombre+"] Km:"+i);
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
