package data;


import java.util.ArrayList;
import java.util.List;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Usuario {
	
	private String nombre;	
	private String email;
	private int edad;
	private String tipoLogin;
	private String aeropuertoPreferido;
	private String password;
	
	@Persistent(mappedBy = "usuario")
	private List<Reserva> reservas = new ArrayList<>();
	
	public Usuario(String nombre, String email, int edad, String tipoLogin, String aeropuertoPreferido, String password) {
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.tipoLogin = tipoLogin;
		this.aeropuertoPreferido = aeropuertoPreferido;
		this.password = password;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoLogin() {
		return tipoLogin;
	}

	public void setTipoLogin(String tipoLogin) {
		this.tipoLogin = tipoLogin;
	}

	public String getAeropuertoPreferido() {
		return aeropuertoPreferido;
	}

	public void setAeropuerto_preferido(String aeropuertoPreferido) {
		this.aeropuertoPreferido = aeropuertoPreferido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	//Obtener numero de reservas
	public int getNumeroReservas() {
		return reservas.size();
	}
	
	//añadir reservas en la lista
	public void addReserva(Reserva reserva) {
		reservas.add(reserva);
	}

	//eliminar reserva de la lista
	public void removeReserva(Reserva reserva) {
		reservas.remove(reserva);
	}
	
}
 