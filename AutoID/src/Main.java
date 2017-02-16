import processing.core.PApplet;

public class Main extends PApplet{
	private Logica log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");
	}
	
	public void settings(){
		size(300, 300);
	}
	
	public void setup(){
		log = new Logica(this);
		background(255);
	}
	
	public void draw(){
		log.pintar();
	}
}
