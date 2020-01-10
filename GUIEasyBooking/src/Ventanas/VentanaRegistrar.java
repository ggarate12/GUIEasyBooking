package Ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Objetos.Usuario;

import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VentanaRegistrar extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public VentanaRegistrar() {
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(47, 27, 81, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(47, 52, 81, 14);
		getContentPane().add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(188, 24, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 49, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(188, 74, 96, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(188, 100, 96, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(188, 125, 96, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(47, 77, 81, 14);
		getContentPane().add(lblEdad);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(47, 103, 81, 14);
		getContentPane().add(lblContrasea);
		
		JLabel lblRepiteContrasea = new JLabel("Repite contrase\u00F1a");
		lblRepiteContrasea.setBounds(47, 128, 104, 14);
		getContentPane().add(lblRepiteContrasea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(188, 151, 96, 22);
		getContentPane().add(comboBox);
		
		JLabel lblAeropuertoPreferido = new JLabel("Aeropuerto Preferido");
		lblAeropuertoPreferido.setBounds(47, 155, 104, 14);
		getContentPane().add(lblAeropuertoPreferido);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(195, 215, 89, 23);
		getContentPane().add(btnRegistrar);
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario()
			}
		});
	}
}
