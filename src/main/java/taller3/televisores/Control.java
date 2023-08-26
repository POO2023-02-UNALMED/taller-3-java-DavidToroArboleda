package taller3.televisores;

public class Control {
	
	private	TV tv;
	
	
	//constructor
	public void Control(TV tv) {
		this.tv = tv;	
		
	}
	
	//enlazar
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}
	
	//setVolumen
	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}
	
	//setCanal
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}	
	
	//VolumenDown
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	//VolumenUp
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	//canalDown
	public void canalDown() {
		this.tv.canalDown();
	}
	
	//canalUp
	public void canalUp() {
		this.tv.canalUp();
	}
	
	//turnOff
	public void turnOff() {
		this.tv.turnOff();
	}
	
	//turnOn
	public void turnOn() {
		this.tv.turnOn();
	}
	
	//setTv
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	//getTv
	public TV getTv() {
		return tv;
	}
	
	
}

	



