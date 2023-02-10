package guardianazoologico;

public class Gorila extends Mamifero {

	
	
	
	public Gorila() {
		super();
	}

	public void lanzarAlgo() {
		System.out.println("Gorila lanzo algo y su energia disminuyo en 5");
		this.setEnergia(-5);
	}

	public void comerBananas() {
		System.out.println("Que delicia");
		this.setEnergia(10);
	}

	public void trepar() {
		System.out.println("Trepando arbol y energia disminuida en 10");
		this.setEnergia(-10);
	}

}
