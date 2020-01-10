package Controller;

import Objetos.Usuario;

public class Controller {
	
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

}
