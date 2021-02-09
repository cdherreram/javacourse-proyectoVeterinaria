package veterinaria.interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelAgregarAnimal extends JPanel implements ActionListener {

	private JLabel labNombreAnimal;
	private JTextField txtNombreAnimal;
	private JLabel labClasificacionAnimal;
	private JTextField txtClasificacionAnimal;
	private JLabel labEdadAnimal;
	private JTextField txtEdadAnimal;
	private JLabel labNombreDuenho;
	private JTextField txtNombreDuenho;
	private JLabel labCedulaDuenho;
	private JTextField txtCedulaDuenho;
	private JLabel labTelefono;
	private JTextField txtTelefono;
	private JLabel labDirección;
	private JTextField txtDireccion;
	private JLabel labVacio;
	private JButton butAgregar;
	
	/**
	 * Create the panel.
	 */
	public PanelAgregarAnimal() {
		TitledBorder border = BorderFactory.createTitledBorder("Datos del animal");
		border.setTitleColor(Color.LIGHT_GRAY);
		this.setBorder(border);
		
		this.setBounds(100, 100, 450, 300);
		this.setLayout(new GridLayout(8,2));
		
		labNombreAnimal = new JLabel("Nombre Animal: ");
		txtNombreAnimal = new JTextField();
		txtNombreAnimal.setEditable(true);
		labClasificacionAnimal = new JLabel("Tipo de animal: ");
		txtClasificacionAnimal = new JTextField();
		labEdadAnimal = new JLabel("Edad: ");
		txtEdadAnimal = new JTextField();
		labNombreDuenho = new JLabel("Nombre del dueño: ");
		txtNombreDuenho = new JTextField();
		labCedulaDuenho = new JLabel("Documento de Identificación No.: ");
		txtCedulaDuenho = new JTextField();
		labTelefono = new JLabel("Teléfono de contacto: ");
		txtTelefono = new JTextField();
		labDirección = new JLabel("Dirección: ");
		txtDireccion = new JTextField();
		labVacio = new JLabel("");
		butAgregar = new JButton("Agregar");
		butAgregar.addActionListener(this);
		
		this.add(labNombreAnimal);
		this.add(txtNombreAnimal);
		this.add(labClasificacionAnimal);
		this.add(txtClasificacionAnimal);
		this.add(labEdadAnimal);
		this.add(txtEdadAnimal);
		this.add(labNombreDuenho);
		this.add(txtNombreDuenho);
		this.add(labCedulaDuenho);
		this.add(txtCedulaDuenho);
		this.add(labTelefono);
		this.add(txtTelefono);
		this.add(labDirección);
		this.add(txtDireccion);
		this.add(labVacio);
		this.add(butAgregar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
