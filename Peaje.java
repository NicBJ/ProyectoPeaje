import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Peaje extends Camion {
	private int ValorPeaje; 
	private int Turno;
	
	
	public Peaje(int ejes, int toneladas, String marca, int valorPeaje, int turno) {
		super(ejes, toneladas, marca);
		ValorPeaje = valorPeaje;
		Turno = turno;
	}

	//Constructor Vacio 
	public Peaje() {
		// TODO Auto-generated constructor stub
	}
	
	public int getValorPeaje() {
		return ValorPeaje;
	}
	public void setValorPeaje(int valorPeaje) {
		ValorPeaje = valorPeaje;
	}
	public int getTurno() {
		return Turno;
	}
	public void setTurno(int turno) {
		Turno = turno;
	}
	
	
	//Calculo de Peaje de cada Camion
	public static int CalculoPeaje(int ejes , int toneladas) {
		int PagoTotal = 0;
		
		if(ejes<=2) {
    		PagoTotal=4400+600*toneladas; 
    	}else {
    		if(ejes>2){
    			PagoTotal=7800+600*toneladas;
    		}
    	}
		//Box mensaje
		JOptionPane.showMessageDialog(null,"***PEAJE DE CAMIONES***\n\n   EJES DEL CAMION: "+ejes
	               +"\n   PESO EN TONELADAS: "+toneladas+"\n   PAGO TOTAL: "+PagoTotal); // concatenamos los resultados
		return PagoTotal; 
		
	}
	
public static int toCamionTurno(int opc , ArrayList<Peaje> ListaTodos ) {
do {
	 System.out.println("Bienvenido al programa");
	 System.out.println("1 : Acceder al turno 1: ");
	 System.out.println("2 : Acceder al turno 2: ");
	 System.out.println("3 : Acceder al turno 3: ");
	 System.out.println("4 : Finalizar programa**");
	
	 Scanner teclado = new Scanner(System.in);
	 opc = teclado.nextInt();
	 
	switch (opc) {
	case 1 : 
		int SumaTotal = 0;
		for(int i = 0 ; i < ListaTodos.size() ; i++) {
		if(ListaTodos.get(i).getTurno()==1) {
			System.out.println("Camion del turno 1: "+ListaTodos.get(i).getMarca());
			System.out.println("Valor del peaje : "+ListaTodos.get(i).getValorPeaje());
		
			SumaTotal = ListaTodos.get(i).getValorPeaje()+ SumaTotal;	
			
		}
	}
		int opcion1=0;
		do {
		System.out.println("1 : Ver recaudación Total ");
		System.out.println("2 : Cerrar turno ");
		Scanner teclado1 = new Scanner(System.in);
		opcion1 = teclado1.nextInt();
		if(opcion1 == 1) {
			System.out.println("\n    Recaudacion Turno 2:  "+SumaTotal);
		}else {
			if(opcion1 == 2) {
				System.out.println();
				SumaTotal = 0; 
			}
		}
		
	}while(opcion1 != 2);
		
		
		System.out.println("\n    Recaudacion Turno 1:  "+SumaTotal);
	break;
	case 2: 
		int SumaTotal2 = 0;
		for(int i = 0 ; i < ListaTodos.size() ; i++) {
			
			if(ListaTodos.get(i).getTurno()==2) {
				System.out.println("Camion del turno 2: "+ListaTodos.get(i).getMarca());
				System.out.println("Valor del peaje : "+ListaTodos.get(i).getValorPeaje());
				SumaTotal2 = ListaTodos.get(i).getValorPeaje()+ SumaTotal2;	
				
			}
		}
		
		
		int opcion2=0;
		do {
		System.out.println("1 : Ver recaudación Total ");
		System.out.println("2 : Cerrar turno ");
		Scanner teclado2 = new Scanner(System.in);
		opcion2 = teclado2.nextInt();
		if(opcion2 == 1) {
			System.out.println("\n    Recaudacion Turno 2:  "+SumaTotal2);
		}else {
			if(opcion2 == 2) {
				System.out.println();
				SumaTotal2 = 0; 
			}
		}
		
	}while(opcion2 != 2);
		
		
	break;
	case 3: 
		int SumaTotal3 = 0;
		for(int i = 0 ; i < ListaTodos.size() ; i++) {
			
			if(ListaTodos.get(i).getTurno()==3) {
				System.out.println("Camion del turno 3 : "+ListaTodos.get(i).getMarca());
				System.out.println("Valor del peaje : "+ListaTodos.get(i).getValorPeaje());
				SumaTotal3 = ListaTodos.get(i).getValorPeaje()+ SumaTotal3;	
			}
		}
		
		int opcion=0;
		do {
		System.out.println("1 : Ver recaudación Total ");
		System.out.println("2 : Cerrar turno ");
		Scanner teclado3 = new Scanner(System.in);
		opcion = teclado3.nextInt();
		if(opcion == 1) {
			System.out.println("\n    Recaudacion Turno 3:  "+SumaTotal3);
		}else {
			if(opcion == 2) {
				System.out.println();
				SumaTotal3 = 0; 
			}
		}
		
	}while(opcion != 2);
	

	}

	
     } while(opc != 4);
return 0;
}
	
	
	
	
	//LEER Y LLENADO DE INFORMACION 
	 public static ArrayList<Peaje> CapturaTXT(String direccion) {
		 ArrayList<Peaje> ListaPeaje1 =new ArrayList<Peaje>();
	    	
	    	String bfRead; 
	    	 			
	    	try {
	    		BufferedReader bf = new BufferedReader (new FileReader (direccion));
	    	
	    		String temp = "";
	    		String temp2 = "";
	    		String marca = "";
	    		String ejes = "";
	    		String peso = "";
	    		String turno = "";
	    		int casilla1; 
	    		int casilla2,casilla3,casilla4;
	    		
	    		//parseInt
	    		  int ejeInt, pesoInt,turnoInt;
	    		
	    		while((bfRead = bf.readLine()) !=null  ) { //Hace el ciclo mientras bfRead tiene tokens que leer. 
	    		  temp = temp + bfRead; //Toma el texto del archivo que estamos leyendo para almacenar todo el archivo en temp.
	    		  temp2=bfRead;  
	    		  int i=0;
	    		  
	    		  //MARCA
	    		  casilla1=temp2.indexOf(';');
	    		  marca = temp2.substring(0,casilla1);
	    	
	    		  casilla1=casilla1+1;
	    		  
	    		  //EJE
	    		  casilla2=temp2.indexOf(';',casilla1);
	    		  ejes = temp2.substring(casilla1,casilla2);
	    		  
	      		  casilla2=casilla2+1;
	    		  
	      		  //PESO
	    		  casilla3=temp2.indexOf(';',casilla2);
	    		  peso = temp2.substring(casilla2,casilla3);
	    		
	      		  casilla3=casilla3+1;
	      		  
	      		  //TURNO
	    		  int largo = temp2.length();
	    		  turno = temp2.substring(casilla3,largo);
	    		
	    		  
	    		  //Convertir a Int
	    	      ejeInt = Integer.parseInt(ejes);
	    		  pesoInt = Integer.parseInt(peso);
	    		  turnoInt=Integer.parseInt(turno);
	    		  
	    		  int totalf ; 
	    		  totalf = CalculoPeaje(ejeInt , pesoInt);
	   	  	
	    		  //Añadir el camion a la lista 
	    		  Peaje c1 =new Peaje(ejeInt,pesoInt,marca, totalf ,turnoInt);
	    		 
	    		
	    		  
	    		  //Peaje p1 = new Peaje( totalf, turnoInt);
	    		  
	    		  ListaPeaje1.add(c1);
	    		   
	    		  
	   			  i++;
	 		  
	    		}
	  		
	    	}catch(Exception e)  {
	    		System.out.println("No se encuentra el archivo");
			   
	    	}
		 return ListaPeaje1;		
	    }
		
	
		
	}
