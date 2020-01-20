package gui;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.ControllerPagar;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaPagar extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	private ControllerPagar controller;
	public VentanaPagar() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(147, 64, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 119, 96, 20);
		getContentPane().add(passwordField);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(67, 67, 49, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(67, 122, 61, 14);
		getContentPane().add(lblContrasea);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBounds(154, 195, 89, 23);
		getContentPane().add(btnPagar);
	}
}
