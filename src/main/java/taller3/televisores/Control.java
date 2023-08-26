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
		tv.setVolumen(volumen);
	}
	
	//setCanal
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}	
	
	//VolumenDown
	public void volumenDown() {
		tv.volumenDown();
	}
	
	//VolumenUp
	public void volumenUp() {
		tv.volumenUp();
	}
	
	//canalDown
	public void canalDown() {
		tv.canalDown();
	}
	
	//canalUp
	public void canalUp() {
		tv.canalUp();
	}
	
	//turnOff
	public void turnOff() {
		tv.turnOff();
	}
	
	//turnOn
	public void turnOn() {
		tv.turnOn();
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

	



