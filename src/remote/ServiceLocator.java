package remote;

import java.rmi.RemoteException;
import java.util.List;

import bin.IEasyBookingServer;
import data.Reserva;
import data.Usuario;
import data.Vuelo;

public class ServiceLocator implements IServer {
	static String IP = "127.0.0.1";
	static String Puerto = "1099";
	static String ServiceName = "Easybooking";
	
	private IEasyBookingServer server;
	
	public ServiceLocator() {
		try {
			server = (IEasyBookingServer) java.rmi.Naming.lookup(ServiceName);
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
		}
	}

	@Override
	public boolean login(String email, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return server.login(email, password);
	}

	@Override
	public boolean register(String email, String password, String nombre, int edad, String aeropuertoPreferido)
			throws RemoteException {
		
		return false;
	}

	@Override
	public boolean reservarYpagar(int precio, int plazas, String emailPaypal, String contrasenyaPaypal,
			String codigoVuelo, String emailUsuarioReserva) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vuelo> buscarVueloIdaYVuelta(String aeropuertoDestino, String aeropuertoOrigen, String fechaIda,
			String fechaVuelta, int asientos) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vuelo> buscarVueloIda(String aeropuertoDestino, String aeropuertoOrigen, String fechaIda, int asientos)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vuelo> getAllVuelos() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vuelo> buscarVuelosDesdeOrigen(String aeropuertoOrigen, String fecha, int asientos)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> getReservasByUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUserInfo(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vuelo getVueloInfo(String codVuelo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
