package es.studium.t4;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class navBar extends Frame implements WindowListener, ActionListener
{

	private static final long serialVersionUID = 1L;
	Frame ventana = new Frame("Menú");
	MenuBar menuBar = new MenuBar();
	
	Menu articulos = new Menu("Artículos");
	Menu clientes = new Menu("Clientes");
	Menu facturas = new Menu("Facturas");
	
	MenuItem articulosNuevo = new MenuItem("Nuevo Artículo"); 
	MenuItem articulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem articulosConsultar = new MenuItem("Consultar Artículo");
	
	MenuItem clientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem clientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem clientesConsultar = new MenuItem("Consultar Cliente");
	
	MenuItem facturasNueva = new MenuItem("Nueva Factura");
	MenuItem facturasConsultar = new MenuItem("Consultar Factura");
	//Creamos un array con todos los MenuItem
	MenuItem[] menuI = {articulosNuevo, articulosEliminar, articulosConsultar, clientesNuevo, 
			clientesEliminar, clientesConsultar, facturasNueva, facturasConsultar};
	
	Dialog Uno = new Dialog(this, "Opción elegida", true);
	Label unoL = new Label("");
	
	public navBar(){
		setLayout(new FlowLayout());
		setMenuBar(menuBar);
		
		for (MenuItem menuItem : menuI) {
			menuItem.addActionListener(this);
		}
		articulos.add(articulosNuevo);
		articulos.add(articulosEliminar);
		articulos.add(articulosConsultar);
		
		clientes.add(clientesNuevo);
		clientes.add(clientesEliminar);
		clientes.add(clientesConsultar);
		
		facturas.add(facturasNueva);
		facturas.add(facturasConsultar);
		
		menuBar.add(articulos);
		menuBar.add(clientes);
		menuBar.add(facturas);
		addWindowListener(this);
		setSize(300,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Agregamos el Dialogo al constructor
		Uno.setLayout(new FlowLayout());
		Uno.add(unoL);
		Uno.setSize(200,100);
		Uno.setLocationRelativeTo(null);
		Uno.addWindowListener(this);
		
	}
	
	public static void main(String[] args)
	{
		new navBar();
	}

	//Action Lister
	public void actionPerformed(ActionEvent ae)
	{
		String fuente = ae.getActionCommand();
		unoL.setText(fuente);
		Uno.setVisible(true);		
	}
	
    //	Window Listener
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent we)
		{
			if(Uno.isActive()) 
			{
				Uno.setVisible(false);
			}else{
				System.exit(0);			
				 }
		}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}

}
