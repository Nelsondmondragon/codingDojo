package guardianazoologico;

public class Mamifero {

	private int nivelEnergia;

	public Mamifero() {
		this.nivelEnergia = 100;
	}

	public Mamifero(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}
	public int mostrarEnergia() {
		System.out.println(this.nivelEnergia);
		return this.nivelEnergia;
	}

	public void setEnergia(int energia) {
		this.nivelEnergia += energia;
	}
	

}
