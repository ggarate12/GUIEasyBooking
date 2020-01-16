package Controller;

import java.util.ArrayList;

import Objetos.Usuario;
import Objetos.Vuelo;
import Objetos.Aerolinea;

public class Controller {
	
	public ArrayList<Usuario> usuarios = new ArrayList<>();
	public ArrayList<Vuelo> vuelos = new ArrayList<>();
	
	public ArrayList<String> arrayAeropuertos = new ArrayList<>();
	String bcn = "BCN";
	String bio = "BIO";
	String mad = "MAD";
	String svq = "SVQ";
	
	public ArrayList<Integer> dias = new ArrayList<>();
	public ArrayList<Integer> meses = new ArrayList<>();
	public ArrayList<Integer> anyos = new ArrayList<>();
		
	public Usuario crearUsuario(String nombre, String email, int edad,
			String aeropuertoPreferido, String password) {
		Usuario u = new Usuario(nombre, email, edad, "Google", aeropuertoPreferido, password);
		return u;
	}
	
	public boolean comprobarContrasenyas(String password, String passwordRepetido) {
		if(password.equals(passwordRepetido)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean comprobarUsuario(String usuario, String password) {
		for(int i = 0; i < usuarios.size(); i++) {
			if(usuario.equals(usuarios.get(i)) || password.equals(usuarios.get(i).getPassword())){
				return true;
			}
		}
		return false;
	}
	
	public Controller() {
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
