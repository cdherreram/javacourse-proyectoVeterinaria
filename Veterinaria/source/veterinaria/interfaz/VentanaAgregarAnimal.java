package veterinaria.interfaz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaAgregarAnimal extends JFrame{
	
	private PanelAgregarAnimal panel;
	
	/**
	 * Create the application.
	 */
	public VentanaAgregarAnimal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setTitle("Agregar animal");
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		panel = new PanelAgregarAnimal();
		this.add(panel);
	}

}
