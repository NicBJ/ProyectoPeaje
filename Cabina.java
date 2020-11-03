import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Cabina {
	
	public static void main(String arg[]){
	
		
		Peaje peaje1 = new Peaje();
		
		ArrayList<Peaje> ListaTodos =  peaje1.CapturaTXT("C:\\camion1.txt");
		int opc=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL TURNO QUIERE VER?:"));
		peaje1.toCamionTurno(opc, ListaTodos);
		
		
		}

}

	