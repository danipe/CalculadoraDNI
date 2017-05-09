package Ventana;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Logica.CalcularLetra;


/*
 * By Paco Gomez
 * Esta ventana tendr� dos JTextFields
 * El primero recojer� el DNI
 * El segundo calcular� la letra al apretar el bot�n
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private Component verticalGlue;
	private JButton btnCalcular;
	private CalcularLetra cl = null;



	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Introduce DNI");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(250,20));
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Letra DNI Calculada");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setMaximumSize(new Dimension(250,20));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		verticalGlue = Box.createVerticalGlue();
		contentPane.add(verticalGlue);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cl = new CalcularLetra(textField.getText());
				textField_1.setText(String.valueOf(cl.devolverLetra()));
			}
		});
		btnCalcular.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCalcular.setBackground(Color.DARK_GRAY);
		btnCalcular.setForeground(Color.WHITE);
		contentPane.add(btnCalcular);
	}

}
