package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ControllerReservar;

import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class VentanaRegistrar extends JFrame{
	
	private ControllerReservar controller;
	

	
	private JTextField tfNombre;
	private JTextField tfEmail;
	private JTextField tfEdad;
	private JPasswordField pfPassword;
	private JPasswordField pfRepitePassword;
	public VentanaRegistrar() {
		
		
		
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(47, 27, 81, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(47, 52, 81, 14);
		getContentPane().add(lblEmail);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(188, 24, 96, 20);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(188, 49, 96, 20);
		getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		
		tfEdad = new JTextField();
		tfEdad.setBounds(188, 74, 96, 20);
		getContentPane().add(tfEdad);
		tfEdad.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(47, 77, 81, 14);
		getContentPane().add(lblEdad);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(47, 103, 81, 14);
		getContentPane().add(lblContrasena);
		
		JLabel lblRepiteContrasena = new JLabel("Repite contrase\u00F1a");
		lblRepiteContrasena.setBounds(47, 128, 104, 14);
		getContentPane().add(lblRepiteContrasena);
		
		JComboBox<String> cbAeropuertos = new JComboBox<String>();
		cbAeropuertos.setBounds(188, 151, 96, 22);
		getContentPane().add(cbAeropuertos);
		DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>();
		for (int i = 0; i < controller.arrayAeropuertos.size(); i++) {
			cbModel.addElement(controller.arrayAeropuertos.get(i));
		}
		cbAeropuertos.setModel(cbModel);
		
		JLabel lblAeropuertoPreferido = new JLabel("Aeropuerto Preferido");
		lblAeropuertoPreferido.setBounds(47, 155, 104, 14);
		getContentPane().add(lblAeropuertoPreferido);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(188, 100, 96, 20);
		getContentPane().add(pfPassword);
		String password = new String(pfPassword.getPassword());
		//hola
		
		pfRepitePassword = new JPasswordField();
		pfRepitePassword.setBounds(188, 125, 96, 20);
		getContentPane().add(pfRepitePassword);
		String repitePassword = new String(pfRepitePassword.getPassword());
		

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(195, 215, 89, 23);
		getContentPane().add(btnRegistrar);		
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(controller.comprobarContrasenyas(password, repitePassword )== true) {
					controller.crearUsuario(tfNombre.getText(), tfEmail.getText(), Integer.parseInt(tfEdad.getText()), cbAeropuertos.getSelectedItem().toString(), password);
					tfNombre.setText("");
					tfEmail.setText("");
					tfEdad.setText("");
					pfPassword.setText("");
					pfRepitePassword.setText("");
				}
			}
		});
	}
}
