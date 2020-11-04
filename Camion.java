//Estructura , atributos y metodos que tendrá el Objeto Camión 

public class Camion {
	//Atributos principales 
	private int ejes;
    private int toneladas;
    private String marca; 
   
    //Constructor de Camion , y su constructor vacío 
    public Camion(int ejes, int toneladas, String marca) {
		
		this.ejes = ejes;
		this.toneladas = toneladas;
		this.marca = marca;
		
	}
	public Camion() {
		
	}
	//Metodos utilis como get y set . 
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
