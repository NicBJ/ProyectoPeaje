import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;




public class Cabina {
	
	public static void main(String arg[]){
	
		
		Peaje peaje1 = new Peaje();
		
		ArrayList<Peaje> ListaTodos =  peaje1.CapturaTXT("C:\\camion1.txt");
		int opc = 0; 
		peaje1.toCamionTurno(opc, ListaTodos);
		
		
		}

}

	
