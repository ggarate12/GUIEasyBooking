package data;


import java.util.ArrayList;
import java.util.List;


public class Aerolinea {

	private String codAerolinea;
	private String nombre;

	private List<Vuelo> vuelos = new ArrayList<>();
	
	public Aerolinea() {
	}
	
	public String getCodAerolinea() {
		return this.codAerolinea;
	}
	
	public void setCodAerolinea(String codAerolinea) {
		this.codAerolinea = codAerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	// Obtener numero de reservas
	public int getNumeroVuelos() {
		return vuelos.size();
	}

	// añadir reservas en la lista
	public void addReserva(Vuelo vuelo) {
		vuelos.add(vuelo);
	}

	// eliminar reserva de la lista
	public void removeReserva(Vuelo vuelo) {
		vuelos.remove(vuelo);
	}

}
