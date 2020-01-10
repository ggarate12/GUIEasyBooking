package Ventanas;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VentanaLogin extends JFrame{
	private JTextField tfContrasenya;
	private JTextField tfUsuario;
	//Controller controller = new Controller();
	public VentanaLogin() {
		getContentPane().setLayout(null);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(113, 172, 89, 23);
		getContentPane().add(btnRegistrarse);
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaRegistrar vr = new VentanaRegistrar();
				vr.setVisible(true);
				dispose();
			}
		});
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(242, 172, 89, 23);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//controller.Login();
			}
		});
		
		tfContrasenya = new JTextField();
		tfContrasenya.setBounds(113, 112, 218, 20);
		getContentPane().add(tfContrasenya);
		tfContrasenya.setColumns(10);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(113, 64, 218, 20);
		getContentPane().add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(59, 64, 44, 20);
		getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(47, 115, 56, 14);
		getContentPane().add(lblContrasea);
	}
}
