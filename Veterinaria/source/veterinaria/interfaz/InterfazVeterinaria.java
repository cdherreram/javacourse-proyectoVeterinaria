package veterinaria.interfaz;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import veterinaria.mundo.*;

public class InterfazVeterinaria extends JFrame {

	private ClinicaVeterinaria veterinaria;
	private PanelImagen panelImagen;
	private PanelMascotas panelMascotas;
	private PanelMedicos panelMedicos;
	private PanelInformacion panelInformacion;
	
	/**
	 * Crear la interfaz con JFrame.
	 */
	public InterfazVeterinaria() {
		setTitle("Veterinaria");
		setSize(500, 600); //setBounds(100, 100, 450, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout( new GridLayout(4,1));
		
		panelImagen = new PanelImagen();
		add( panelImagen);
		
		panelMascotas = new PanelMascotas(this);
		add(panelMascotas);
		
		panelInformacion = new PanelInformacion();
		add(panelInformacion);
		
		panelMedicos = new PanelMedicos();
		add(panelMedicos);
		
		veterinaria = new ClinicaVeterinaria();
		cargarAnimales();
		actualizarLista();
		//cargarEmpleados();
	}
	
	
	private void cargarAnimales() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data/animales.csv"));
			String line = br.readLine();
			while ( (line = br.readLine()) != null) {
				String[] datos = line.split(";");
				int numIdDuenho = Integer.parseInt(datos[1]);
				String numAnimal = datos[0];
				String id = numIdDuenho + "-" + numAnimal;
				String nombreDuenho = datos[2].toLowerCase();
				String tipoAnimal = datos[3].toLowerCase();
				String nombreAnimal = datos[4].toLowerCase();
				String[] fechaNac = datos[5].split("[-' ]+");
				int mesNac = Integer.parseInt(fechaNac[0]) > 1 ? Integer.parseInt(fechaNac[0]) - 1 : 12;
				int anhoNac = Integer.parseInt(fechaNac[1]);
				String direccion = datos[6];
				String telefono = datos[7];
				
				Duenho duenho = new Duenho(nombreDuenho, numIdDuenho, telefono, direccion);
				Calendar fecha = new GregorianCalendar(anhoNac, mesNac, 1);
				Animal an = null;
				if ( tipoAnimal.equals("mamifero") ) {
					 an = new Mamifero(id, nombreAnimal, fecha, duenho);
				} else if ( tipoAnimal.equals("ave")) {
					 an = new Ave(id, nombreAnimal, fecha, duenho, "");
				} else if ( tipoAnimal.equals("pez") ) {
					 an = new Pez(id, nombreAnimal, fecha, duenho, 1);
				}
				veterinaria.agregarAnimal(an);
			}
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Hubo un problema al cargar el archivo de animales.");
			System.out.println(e);
		}
	}
	
	private void cargarEmpleados ( ) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data/animales.csv"));
			String line = br.readLine();
			while ( (line = br.readLine()) != null) {
				
				
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Hubo un problema al cargar el archivo de empleados.");
		}
	}
	
	public void verDatos(Animal animal) {
		
	}
	
	public ClinicaVeterinaria getVeterinaria() {
		return veterinaria;
	}
	
	private void actualizarLista ( ) {
		panelMascotas.refrescarLista( (ArrayList) veterinaria.getListaAnimales());
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazVeterinaria frame = new InterfazVeterinaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
