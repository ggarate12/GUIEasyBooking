package controller;

import bin.IEasyBookingServer;
import remote.ServiceLocator;

public class RegisterController {

private IEasyBookingServer server;
	
	public RegisterController() {
		ServiceLocator s = new ServiceLocator();
		server = s.getServer();
	}



}
