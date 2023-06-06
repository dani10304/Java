package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaExcepciones {

	private JFrame frame;
	private JTextField txtnumero1;
	private JTextField txtnumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaExcepciones window = new VentanaExcepciones();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaExcepciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dime el numero 1");
		lblNewLabel.setBounds(45, 34, 119, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dime el numero 2");
		lblNewLabel_1.setBounds(45, 73, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtnumero1 = new JTextField();
		txtnumero1.setBounds(161, 31, 140, 20);
		frame.getContentPane().add(txtnumero1);
		txtnumero1.setColumns(10);
		
		txtnumero2 = new JTextField();
		txtnumero2.setBounds(161, 70, 140, 20);
		frame.getContentPane().add(txtnumero2);
		txtnumero2.setColumns(10);
		
		JLabel lbmensaje = new JLabel("..........................................");
		lbmensaje.setBounds(45, 153, 324, 14);
		frame.getContentPane().add(lbmensaje);
		
		JButton btnNewButton = new JButton("Dividir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int numero1=Integer.parseInt(txtnumero1.getText());
				int numero2=Integer.parseInt(txtnumero2.getText());
				int solucion=numero1/numero2;
				lbmensaje.setText("el resultado es: "+solucion);
			} catch(ArithmeticException ex) {
				lbmensaje.setText("no se puede dividir por cero");
			} catch(Exception ex) {
				lbmensaje.setText("error general");
			}
				
			}
			
		});
		btnNewButton.setBounds(189, 106, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

