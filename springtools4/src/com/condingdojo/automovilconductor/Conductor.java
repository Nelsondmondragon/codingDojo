package com.condingdojo.automovilconductor;

public class Conductor extends Automovil {

	public void conducir() {
		if (this.getGasolina() > 0) {
			System.out.println("Conduces el automóvil.");
			this.setGasolina(-1);
			System.out.println("Gasolina restante:" + this.getGasolina() + "/10");

		}else {
			System.out.println("juego terminado");
		}
	}

	public void propulsores() {
		if (this.getGasolina() > 3) {

			System.out.println("Propulsores");
			this.setGasolina(-3);
			System.out.println("Gasolina restante:" + this.getGasolina() + "/10");
		}else {
			System.out.println("juego terminado");
		}
	}

	public void llenarGasolina() {
		if (this.getGasolina() < 10) {

			System.out.println("llenando gasolina");
			this.setGasolina(2);
		}
	}
}
