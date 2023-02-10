package guardianazoologico;

public class Murcielago extends Mamifero {

	public Murcielago() {
		super(300);
	}

	public void volar() {
		System.out.println("Sonido despegando");
		this.setEnergia(-50);
	}

	public void comerHumanos() {
		this.setEnergia(25);
	}

	public void atacarPueblo() {
		System.out.println("Pueblo en llamas");
		this.setEnergia(100);
	}

}
