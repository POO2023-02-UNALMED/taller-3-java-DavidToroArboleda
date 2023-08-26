package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	Control control;
	
	public static int numTV;
	
	//constructor TV
	public TV(Marca marca,boolean estado){
		this.marca = marca;
		this.estado = estado;
		canal = 1;
		volumen = 1;
		precio = 500;	
		numTV++;
	}
	
	//setMarca
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	//getMarca
	public Marca getMarca() {
		return marca;
	}
	
	//setCanal
	public void setCanal(int canal) {
		if(canal <= 120 && estado == true && canal>= 1)
		this.canal = canal;
	}
	
	//getCanal
	public int getCanal() {
		return canal;
	}
	

	//setVolumen
	public void setVolumen(int volumen) {
		if (volumen <= 7 && estado == true && volumen >= 0) {
		this.volumen = volumen;
		}
		else {
			return;
		}
	}
	
	
	//getVolumen
	public int getVolumen() {
		return volumen;
	}
	
	//setPrecio
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//getPrecio
	public int getPrecio() {
		return precio;
	}

	//setNumTV
	public void setNumTV(int numTV) {
		TV.numTV = numTV ;
	}
	
	
	//getNumTV
	public int getNumTV() {
		return numTV;
	}
	
	//setControl
	public void setControl(Control control) {
		this.control = control;
	}
	
	//getControl
	public Control getControl() {
		return control;
	}
	
	//turnOn
	public void turnOn() {
		if (estado == false) {
			estado = true;
		}
		else {
			return;
		}
	}
	
	//turnOff
	public void turnOff() {
		if (estado == true) {
			estado = false;
		}
		else {
			return;
		}
	}
	
	//getEstado
	public boolean getEstado() {
		return estado;
	}
	
	//canalUp
	public void canalUp() {
		if (estado == true && canal < 120) {
			canal++;
		}
		else {
			return;
		}
	}
	
	//canalDown
	public void canalDown() {
		if (estado == true && canal != 1) {
			canal--;
		}
		else {
			return;
		}	
	}
	
	//volumenUp
	public void volumenUp() {
		if (estado == true && volumen < 7) {
			volumen++;
		}
		else {
			return;
		}
	}
	
	//volumenDown
	public void volumenDown() {
		if (estado == true && volumen != 0) {
			canal--;
		}
		else {
			return;
		}
	}
	
	
}
