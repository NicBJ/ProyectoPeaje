import java.util.ArrayList;

//MAIN DEL PROYECTO

public class Cabina {
	public static void main(String arg[]){
	
		//Creamos un objeto peaje para enviar los parámetros iniciales 
		Peaje peaje1 = new Peaje();
									//enviamos como parámetro la dirrecion del archivo requerido 
		ArrayList<Peaje> ListaTodos =  peaje1.CapturaTXT("C:\\camion1.txt");
		
		int opc=0; 
		//Enviamos la lista tipo Peaje para ser usada y llenada 
		peaje1.toCamionTurno(opc, ListaTodos);
		
		
		}

}

	
