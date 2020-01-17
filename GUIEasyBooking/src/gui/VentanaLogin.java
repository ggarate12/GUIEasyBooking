package gui;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import controller.Controller;

import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class VentanaLogin extends JFrame{
	private JPasswordField pfPassword;
	private JTextField tfUsuario;
	Controller controller = new Controller();
	VentanaReservar vreservar = new VentanaReservar();
	
	public VentanaLogin() {
		getContentPane().setLayout(null);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(113, 64, 218, 20);
		getContentPane().add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(113, 112, 218, 20);
		getContentPane().add(pfPassword);
		pfPassword.setColumns(10);
		String password = new String(pfPassword.getPassword());
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(59, 64, 44, 20);
		getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(47, 115, 56, 14);
		getContentPane().add(lblContrasea);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(242, 172, 89, 23);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(controller.comprobarUsuario(tfUsuario.getText(), password)== true) {
					vreservar.setVisible(true);
					dispose();
				} else{
					tfUsuario.setText("");
					pfPassword.setText("");
				};
			}
		});
		
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
	}
}
