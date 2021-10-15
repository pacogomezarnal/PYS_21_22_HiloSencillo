import Ciudad.Persona;
import CiudadMultiHilo.PersonaHilo;

public class Main {

	public static void main(String[] args) {
		//Ejemplo de Hilo sencillo
		System.out.println("----LANZAMOS PROGRAMA----");
		
		//Creamos dos personas de la Ciudad Secuencial
		Persona juan=new Persona("Juan");
		Persona maria=new Persona("Maria");
		//Hacemos que caminen
		juan.camina(5);
		maria.camina(6);
		
		//Creamos dos personas de la Ciudad Paralela
		PersonaHilo lucia=new PersonaHilo("Lucia",5);
		PersonaHilo pedro=new PersonaHilo("Pedro",6);
		//Hacemos que caminen
		lucia.start();
		pedro.start();;

	}

}
