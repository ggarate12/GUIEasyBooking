package remote;

import java.rmi.RemoteException;
import java.util.List;

import data.Reserva;
import data.Usuario;
import data.Vuelo;

public interface IServer {
	public boolean login(String email, String password) throws RemoteException;
	public boolean register(String email, String password, String nombre, int edad, String aeropuertoPreferido) throws RemoteException;
	
	public boolean reservarYpagar(int precio, int plazas, String emailPaypal,String contrasenyaPaypal, String codigoVuelo, String emailUsuarioReserva);
	
	public List<Vuelo> buscarVueloIdaYVuelta(String aeropuertoDestino, String aeropuertoOrigen, String fechaIda, String fechaVuelta, int asientos) throws RemoteException;
	public List<Vuelo> buscarVueloIda(String aeropuertoDestino, String aeropuertoOrigen, String fechaIda, int asientos) throws RemoteException;
	public List<Vuelo> getAllVuelos() throws RemoteException;
	public List<Vuelo> buscarVuelosDesdeOrigen(String aeropuertoOrigen, String fecha, int asientos) throws RemoteException;
	
	/** Con un email te devuelve la lista de Reservas de ese usuario
	 * @param email
	 * @return
	 */
	public List<Reserva> getReservasByUser(String email);
	public Usuario getUserInfo(String email);
	public Vuelo getVueloInfo(String codVuelo) throws RemoteException;
}
