package controller;

import java.util.ArrayList;

import gui.VentanaRegistrar;

public class ControllerRegistrar {


	public addAeropuerto() {
		for (int i = 0; i < arrayAeropuertos.size(); i++) {
			cbModel.addElement(arrayAeropuertos.get(i));
		}
		cbAeropuertos.setModel(cbModel);
	}

}
