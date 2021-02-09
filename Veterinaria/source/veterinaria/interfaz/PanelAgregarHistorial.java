package veterinaria.interfaz;

import java.util.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

import veterinaria.mundo.*;
import veterinaria.mundo.Historial.Operacion;
import veterinaria.mundo.Veterinario.Especialidad;

public class PanelAgregarHistorial extends JPanel implements ActionListener, ItemListener {
	
	private InterfazVeterinaria principal;
	
	private JLabel labTipoOperacion;
	private JLabel labIdAnimal;
	private JLabel labCalendar;
	private JLabel labOperacion;
	private JLabel labTF;
	private JLabel labVeterinario;
	private JLabel labEspecialidad;
	
	private JComboBox<String> cbTipoOperacion;
	private JComboBox<String> cbIdAnimal;
	private JSpinner calendar;
	private JTextField txtOperacion;
	private JComboBox cbVeterinario;
	private JComboBox<String> cbEspecialidad;

	private JCheckBox chbTieneMedicamento;

	private JButton butRegistrar;

	/**
	 * Create the panel.
	 */
	public PanelAgregarHistorial( InterfazVeterinaria interfaz) {
		
		TitledBorder border = BorderFactory.createTitledBorder("Datos del historial");
		border.setTitleColor(Color.LIGHT_GRAY);
		this.setBorder(border);
		
		this.setBounds(100, 100, 450, 300);
		this.setLayout(new GridLayout(8,2));
		
		principal = interfaz;
		
		labTipoOperacion = new JLabel("Tipo Operación: ");
		cbTipoOperacion = new JComboBox<String>();
		for ( Operacion o: Operacion.values())
			cbTipoOperacion.addItem(o.toString());
		cbTipoOperacion.addItemListener(this);

		labIdAnimal = new JLabel("Id Animal: ");
		cbIdAnimal = new JComboBox<String>();
		for ( Animal a : principal.getVeterinaria().getListaAnimales()) {
			cbIdAnimal.addItem(a.getIdAnimal());
		}
		
		cbIdAnimal.setEditable(false);

		labCalendar = new JLabel("Fecha: ");
		calendar = new JSpinner(new SpinnerDateModel());

		labOperacion = new JLabel("Descripción: ");
		txtOperacion = new JTextField();
		txtOperacion.setEditable(true);

		labTF = new JLabel("Tiene medicamento: ");
		chbTieneMedicamento = new JCheckBox();

		labVeterinario = new JLabel("Veterinario: ");
		cbVeterinario = new JComboBox<>();

		labEspecialidad = new JLabel("Especialidad: ");
		cbEspecialidad = new JComboBox<String>();
		for ( Especialidad o: Especialidad.values())
			cbEspecialidad.addItem(o.toString());
		
		butRegistrar = new JButton("Registrar");
		
		add(labTipoOperacion);
		add(cbTipoOperacion);
		add(labIdAnimal);
		add(cbIdAnimal);
		add(labCalendar);
		add(calendar);
		add(labOperacion);
		add(txtOperacion);
		add(labTF);
		add(chbTieneMedicamento);
		add(labVeterinario);
		add(cbVeterinario);
		add(labEspecialidad);
		add(cbEspecialidad);
		add(new JLabel(""));
		add(butRegistrar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
	}
}
