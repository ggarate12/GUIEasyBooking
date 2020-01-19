package controller;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bin.IEasyBookingServer;
import data.Aerolinea;
import data.Vuelo;
import data.dto.VueloDTO;
import remote.ServiceLocator;

public class BuscarController {

	private IEasyBookingServer server;
	private ArrayList<String> arrayAeropuertos = new ArrayList<>();
	private ArrayList<Vuelo> vuelos = new ArrayList<>();
	private ArrayList<Integer> dias = new ArrayList<>();
	private ArrayList<Integer> meses = new ArrayList<>();
	private ArrayList<Integer> anyos = new ArrayList<>();
	

	public BuscarController() {
			ServiceLocator s = new ServiceLocator();
			server = s.getServer();
		}
	//ibai.guillen@opendeusto.es
	public void loadAeropuertos() throws RemoteException {
		for(VueloDTO v : server.getAllVuelos()) {
			if(!arrayAeropuertos.contains(v.getAeropuertoDestino())) arrayAeropuertos.add(v.getAeropuertoDestino());
			if(!arrayAeropuertos.contains(v.getAeropuertoOrigen())) arrayAeropuertos.add(v.getAeropuertoOrigen());
		}
	}

	public void loadVuelos() throws RemoteException {
		for(VueloDTO v : server.getAllVuelos()) {
			Vuelo vue = new Vuelo();
			vue.setNomAerolinea(v.getNomAerolinea());
			vue.setAeropuertoDestino(v.getAeropuertoDestino());
			vue.setAeropuertoOrigen(v.getAeropuertoOrigen());
			vue.setFecha(v.getFecha());
			vue.setNumAsientos(v.getNumAsientos());
			vue.setPrecio(v.getPrecioporPlaza());
			vuelos.add(vue);
		}
	}
	//ibai.guillen@opendeusto.es
	
	public void loadDias() {
		for(int m = 1; m<13; m++) {
			if(m == 2) {
				for(int d = 1; d <31; d++) {
					dias.add(d);
				}
			}else if(m == 11 || m == 9 || m == 6 || m == 4){
				for(int d = 1; d <31; d++) {
					dias.add(d);
				}		
			}else {
				for(int d = 1; d < 32; d++) {
					dias.add(d);
				}
			}
		meses.add(m);
		}
		anyos.add(2020);
		anyos.add(2021);
	}
	
	public ArrayList<String> getArrayAeropuertos() {
		return arrayAeropuertos;
	}

	public ArrayList<Vuelo> getVuelos() {
		return vuelos;
	}

	public ArrayList<Integer> getDias() {
		return dias;
	}

	public ArrayList<Integer> getMeses() {
		return meses;
	}

	public ArrayList<Integer> getAnyos() {
		return anyos;
	}
	
}
