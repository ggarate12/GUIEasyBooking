package controller;

import java.rmi.RemoteException;

import bin.IEasyBookingServer;
import remote.ServiceLocator;

public class LoginController {

	private IEasyBookingServer server;
	
	public LoginController() {
		// TODO Auto-generated constructor stub
		ServiceLocator s = new ServiceLocator();
		server = s.getServer();
	}
	
	public boolean login(String usuario, char[] cs) throws RemoteException {
		String password = "";
		for(char c : cs ) {
			password += c;
		}
		return server.login(usuario, password);
	}
	

	
}
