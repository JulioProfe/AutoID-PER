import java.util.Observable;
import java.util.Observer;

import processing.core.PApplet;

public class Logica implements Observer{

	private PApplet app;
	private Comunicacion com;
	public Logica(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		this.com = new Comunicacion();
		new Thread(com).start();
	}

	public void pintar() {
		app.fill(0);
		app.textSize(60);
		app.text(com.getIdentifier(), app.width/2, app.height/2);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
