
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Camion {
	private int ejes;
    private int toneladas;
    private String marca; 
   

    public Camion(int ejes, int toneladas, String marca) {
		
		this.ejes = ejes;
		this.toneladas = toneladas;
		this.marca = marca;
		
	}
	public Camion() {
		
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getToneladas() {
		return toneladas;
	}
	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}