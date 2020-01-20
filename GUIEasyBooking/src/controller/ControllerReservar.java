package controller;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import data.Usuario;
import data.Vuelo;


public class ControllerReservar {
	public ArrayList<String> arrayAeropuertos = new ArrayList<>();
	String bcn = "BCN";
	String bio = "BIO";
	String mad = "MAD";
	String svq = "SVQ";
	public ArrayList<Integer> dias = new ArrayList<>();
	public ArrayList<Integer> meses = new ArrayList<>();
	public ArrayList<Integer> anyos = new ArrayList<>();
	
//	public crearMatriz() {
//		String matriz[][];
//		for(int i =0; i< //añadir metodo getVuelos; i++) {
//			matriz[i][0] = vuelosACargar.get(i).getFecha();
//			matriz[i][1] = vuelosACargar.get(i).getAeropuertoOrigen();
//			matriz[i][2] = vuelosACargar.get(i).getAeropuertoDestino();
//			matriz[i][3] = Integer.toString(vuelosACargar.get(i).getNumAsientos());
//			matriz[i][4] = vuelosACargar.get(i).getAerolinea().toString();
//				
//				
//			table.setModel(new DefaultTableModel(
//			matriz,
//			new String[] {
//					"fecha", "titulo", "duracion", "artista", "album"
//				}
//			));
//		}
//		return matriz;
//	}

//	public cargarVuelo() {
//		for (Vuelo vuelo : controller.vuelos) { //Cambiar por metodo getVuelos
//			if(cbOrigen.equals(vuelo.getAeropuertoOrigen()) && cbDestino.equals(vuelo.getAeropuertoDestino())) {
//				vuelosACargar.add(vuelo);
//			}else if(cbOrigen.equals(vuelo.getAeropuertoOrigen()) && fecha.equals(vuelo.getFecha())) { //añadir campo de fecha
//				vuelosACargar.add(vuelo);
//			}else if(cbOrigen.equals(vuelo.getAeropuertoOrigen()) && cbDestino.equals(vuelo.getAeropuertoDestino()) && fecha.equals(vuelo.getFecha())) {
//				vuelosACargar.add(vuelo);
//		}
//	}	
	
	public ControllerReservar() {
		arrayAeropuertos.add(bcn);
		arrayAeropuertos.add(bio);
		arrayAeropuertos.add(mad);
		arrayAeropuertos.add(svq);
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
}
