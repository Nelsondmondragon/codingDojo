package com.condingdojo.automovilconductor;

public class AutomovilConductor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conductor nelson = new Conductor();

		nelson.conducir();
		nelson.conducir();
		nelson.conducir();
		nelson.conducir();

		nelson.propulsores();
		nelson.propulsores();

		nelson.llenarGasolina();
		nelson.llenarGasolina();
		nelson.llenarGasolina();
		
		System.out.println(nelson.getGasolina());
		
	}

}
