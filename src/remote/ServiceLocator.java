package remote;

import java.rmi.RemoteException;
import java.util.List;

import bin.IEasyBookingServer;
import data.Reserva;
import data.Usuario;
import data.Vuelo;

public class ServiceLocator {
	static String IP = "127.0.0.1";
	static String Puerto = "1099";
	static String ServiceName = "EasyBooking";
	
	private IEasyBookingServer server;
	
	public ServiceLocator() {
		try {
			server = (IEasyBookingServer) java.rmi.Naming.lookup(ServiceName);
		} catch (Exception e) {
			System.err.println("- Exception running the server: " + e.getMessage());
		}
	}

	public IEasyBookingServer getServer() {
		return server;
	}

	
	
	
}
