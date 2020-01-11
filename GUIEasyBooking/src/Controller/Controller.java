package Controller;

import java.util.ArrayList;

import Objetos.Usuario;

public class Controller {
	
	ArrayList<Usuario> usuarios = new ArrayList<>();
		
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

}
