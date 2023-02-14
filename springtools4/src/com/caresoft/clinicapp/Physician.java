package com.caresoft.clinicapp;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA {

	private ArrayList<String> patientNotes;

	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length() != 4) {
			return false;
		}
		this.pin = pin;
		return true;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return this.getId() == confirmedAuthID;
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Fecha y hora de envío: %s \n", date);
		report += String.format("Reportado por ID: %s\n", this.id);
		report += String.format("Nombre del paciente: %s\n", patientName);
		report += String.format("Notas: %s \n", notes);
		this.patientNotes.add(report);
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	
	// PARA HACER: Setters y Getters

}
