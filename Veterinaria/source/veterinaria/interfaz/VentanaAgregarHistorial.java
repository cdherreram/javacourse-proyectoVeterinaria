package veterinaria.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaAgregarHistorial extends JFrame {

	private PanelAgregarHistorial panelHistorial;
	private InterfazVeterinaria principal;
	
	/**
	 * Create the frame.
	 */
	public VentanaAgregarHistorial(InterfazVeterinaria veterinaria) {
		principal = veterinaria;
		initialize(principal);
	}
	
	public void initialize( InterfazVeterinaria interfaz ) {
		setTitle("Agregar historial");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(new BorderLayout());
		setVisible(true);
		panelHistorial = new PanelAgregarHistorial(interfaz);
		add(panelHistorial);
	}
}
