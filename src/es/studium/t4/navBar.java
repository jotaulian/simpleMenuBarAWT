package es.studium.t4;

import java.awt.*;

public class navBar
{
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
	
	public navBar(){
		ventana.setLayout(new FlowLayout());
		ventana.setMenuBar(menuBar);
		
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
		
		ventana.setSize(300,200);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new navBar();
	}

}
