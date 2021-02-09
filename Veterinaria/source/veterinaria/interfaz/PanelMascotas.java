package veterinaria.interfaz;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import veterinaria.mundo.*;

public class PanelMascotas extends JPanel implements ListSelectionListener, ActionListener {

	/*
	 * Constantes
	 */
	public final static String ALIMENTAR = "Botón 1";
	public final static String REGISTRAROPERACION = "Botón 2";
	public final static String AGREGAR = "Botón 3";
	public final static String BUSCAR = "Botón 4";
	
	/*
	 * Atributos
	 */	
	private JButton butAlimentar;
	private JButton butRegistrarOperacion;
	private JButton butAgregar;
	private JButton butBuscar;
		
	private JScrollPane scrMascotas;
	private JList listaMascotas;
	
	private InterfazVeterinaria principal;
	
	/*
	 * Constructor
	 */
	
	/**
	 * Construye el panel donde se manejan las principales características de las mascotas
	 */
	public PanelMascotas( InterfazVeterinaria interfaz ) {
		
		setLayout(new GridLayout(1,2));
		setPreferredSize( new Dimension(0,130));
		
		TitledBorder border = BorderFactory.createTitledBorder( "Mascotas");
		border.setTitleColor(Color.LIGHT_GRAY);
		setBorder(border);
		
		this.principal = interfaz;
		
		JPanel panelScrMascotas = new JPanel();
		GridLayout gl_panelScrMascotas = new GridLayout(1,1);
		gl_panelScrMascotas.setVgap(30);
		panelScrMascotas.setLayout(gl_panelScrMascotas);
		panelScrMascotas.setSize(new Dimension(this.getWidth()/2, HEIGHT));
		
		listaMascotas = new JList();
		listaMascotas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaMascotas.addListSelectionListener(this);
		
		scrMascotas = new JScrollPane(listaMascotas);
		scrMascotas.setBorder(new CompoundBorder( new EmptyBorder( 3, 3, 3, 3 ), new LineBorder( Color.BLACK, 1 ) ));
		scrMascotas.setVisible(true);
		
		panelScrMascotas.add(scrMascotas);
		
		JPanel panelBotones = new JPanel();
		GridLayout gl_panelBotones = new GridLayout(4,1);
		gl_panelBotones.setVgap(8);
		panelBotones.setLayout(gl_panelBotones);
		panelBotones.setSize(new Dimension(this.getWidth()/2, HEIGHT));
		
		butAlimentar = new JButton("Alimentar");
		butAlimentar.setActionCommand(ALIMENTAR);
		butAlimentar.addActionListener(this);
		
		butRegistrarOperacion = new JButton("Registrar Operación");
		butRegistrarOperacion.setActionCommand(REGISTRAROPERACION);
		butRegistrarOperacion.addActionListener(this);
		
		butAgregar = new JButton("Agregar");
		butAgregar.setActionCommand(AGREGAR);
		butAgregar.addActionListener(this);
		
		butBuscar = new JButton("Buscar");
		butBuscar.setActionCommand(BUSCAR);
		butBuscar.addActionListener(this);
		
		panelBotones.add(butAlimentar);
		panelBotones.add(butAgregar);
		panelBotones.add(butRegistrarOperacion);
		panelBotones.add(butBuscar);
		
		add(panelScrMascotas);
		add(panelBotones);		
	}
	
	public void refrescarLista( ArrayList<Animal> nuevaLista) {
		listaMascotas.setListData( nuevaLista.toArray( ) );
		listaMascotas.setSelectedIndex(-1);
	}
	
	public void seleccionar( int seleccionado ) {
        listaMascotas.setSelectedIndex( seleccionado );
        listaMascotas.ensureIndexIsVisible( seleccionado );
    }
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();
		
		if (comando.equals(ALIMENTAR) ) {
			JOptionPane.showMessageDialog(this, "Pronto se implementará este botón");
		} else if ( comando.equals(AGREGAR)) {
			VentanaAgregarAnimal ventana = new VentanaAgregarAnimal();
		} else if ( comando.equals(REGISTRAROPERACION)) {
			VentanaAgregarHistorial ventana = new VentanaAgregarHistorial(principal);
		} else if ( comando.equals(BUSCAR)) {
			JOptionPane.showMessageDialog(this, "Pronto se implementará este botón");
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if( listaMascotas.getSelectedValue( ) != null )
        {
            Animal p = ( Animal )listaMascotas.getSelectedValue( );
            principal.verDatos( p );
        }
		
	}
}
