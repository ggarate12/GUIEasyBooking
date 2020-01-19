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
	
	public boolean login(String usuario, char[] cs){
		String password = "";
		for(char c : cs ) {
			password += c;
		}
		try {
			return server.login(usuario, password);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public void finish() {
		server = null;
	}



	
}
