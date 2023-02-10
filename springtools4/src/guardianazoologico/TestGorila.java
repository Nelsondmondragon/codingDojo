package guardianazoologico;

public class TestGorila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gorila gorila = new Gorila();
		gorila.lanzarAlgo();
		gorila.lanzarAlgo();
		gorila.lanzarAlgo();
		gorila.mostrarEnergia();

		gorila.comerBananas();
		gorila.comerBananas();
		gorila.mostrarEnergia();

		gorila.trepar();
		gorila.mostrarEnergia();

		Murcielago murci = new Murcielago();

		murci.atacarPueblo();
		murci.atacarPueblo();
		murci.atacarPueblo();

		murci.mostrarEnergia();

		murci.comerHumanos();
		murci.comerHumanos();

		murci.mostrarEnergia();
		murci.volar();
		murci.volar();

		murci.mostrarEnergia();
	}

}
