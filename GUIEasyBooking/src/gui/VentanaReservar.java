package gui;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import controller.ControllerReservar;
import data.Vuelo;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaReservar extends JFrame{
	
	ControllerReservar controller;
	private JTable table;
	private String fecha;
	public VentanaReservar() {
		getContentPane().setLayout(null);
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setBounds(173, 229, 89, 23);
		getContentPane().add(btnReservar);
		
		JComboBox<String> cbOrigen = new JComboBox<String>();
		cbOrigen.setBounds(75, 11, 89, 23);
		getContentPane().add(cbOrigen);
		DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>();
		for (int i = 0; i < controller.arrayAeropuertos.size(); i++) {
			cbModel.addElement(controller.arrayAeropuertos.get(i));
		}
		cbOrigen.setModel(cbModel);
		
		JComboBox<String> cbDestino = new JComboBox<String>();
		cbDestino.setBounds(266, 11, 89, 23);
		getContentPane().add(cbDestino);
		cbDestino.setModel(cbModel);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(26, 15, 33, 14);
		getContentPane().add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(213, 15, 49, 14);
		getContentPane().add(lblDestino);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(36, 128, 365, 80);
		getContentPane().add(table);
		
		ArrayList<Vuelo> vuelosACargar = new ArrayList<>();
		for (Vuelo vuelo : controller.vuelos) { //Cambiar por metodo getVuelos
			if(cbOrigen.equals(vuelo.getAeropuertoOrigen()) && cbDestino.equals(vuelo.getAeropuertoDestino())) {
				vuelosACargar.add(vuelo);
			}else if(cbOrigen.equals(vuelo.getAeropuertoOrigen()) && fecha.equals(vuelo.getFecha())) { //añadir campo de fecha
				vuelosACargar.add(vuelo);
			}else if(cbOrigen.equals(vuelo.getAeropuertoOrigen()) && cbDestino.equals(vuelo.getAeropuertoDestino()) && fecha.equals(vuelo.getFecha())) {
				vuelosACargar.add(vuelo);
			}
		}
		table.setBounds(36, 128, 365, 80);
		getContentPane().add(table);
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String matriz[][] = new String[vuelosACargar.size()][5];
				for(int i =0; i< vuelosACargar.size(); i++) {
					matriz[i][0] = vuelosACargar.get(i).getFecha();
					matriz[i][1] = vuelosACargar.get(i).getAeropuertoOrigen();
					matriz[i][2] = vuelosACargar.get(i).getAeropuertoDestino();
					matriz[i][3] = Integer.toString(vuelosACargar.get(i).getNumAsientos());
					matriz[i][4] = vuelosACargar.get(i).getAerolinea().toString();
						
						
					table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"fecha", "titulo", "duracion", "artista", "album"
						}
					));
				}
				
			}
		});
		btnBuscar.setBounds(173, 94, 89, 23);
		getContentPane().add(btnBuscar);
		
		JLabel lblDia = new JLabel("D\u00EDa");
		lblDia.setBounds(66, 60, 23, 14);
		getContentPane().add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(173, 60, 23, 14);
		getContentPane().add(lblMes);
		
		JLabel lblAnyo = new JLabel("A\u00F1o");
		lblAnyo.setBounds(263, 60, 49, 14);
		getContentPane().add(lblAnyo);
		
		
		JComboBox<Integer> cbMes = new JComboBox<Integer>();
		cbMes.setBounds(200, 56, 49, 22);
		getContentPane().add(cbMes);
		DefaultComboBoxModel<Integer> cbModel2 = new DefaultComboBoxModel<>();
		for (int i = 0; i < controller.meses.size(); i++) {
			cbModel2.addElement(controller.meses.get(i));
		}
		cbMes.setModel(cbModel2);
		
		JComboBox<Integer> cbDia = new JComboBox<Integer>();
		cbDia.setBounds(87, 56, 49, 22);
		getContentPane().add(cbDia);
		DefaultComboBoxModel<Integer> cbModel1 = new DefaultComboBoxModel<>();
		for (int i = 0; i < controller.dias.size(); i++) {
			cbModel1.addElement(controller.dias.get(i));
		}
		cbDia.setModel(cbModel1);
		
		JComboBox<Integer> cbAnyo = new JComboBox<Integer>();
		cbAnyo.setBounds(306, 56, 49, 22);
		getContentPane().add(cbAnyo);
		DefaultComboBoxModel<Integer> cbModel3 = new DefaultComboBoxModel<>();
		for (int i = 0; i < controller.anyos.size(); i++) {
			cbModel3.addElement(controller.anyos.get(i));
		}
		cbMes.setModel(cbModel3);
		
		fecha = cbDia.getSelectedItem() + "/" + cbMes.getSelectedItem() + "/" + cbAnyo.getSelectedItem();
	}
}
