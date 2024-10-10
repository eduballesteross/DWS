package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import dtos.VentaDto;
import servicios.EmpleadoImplementacion;
import servicios.EmpleadoInterfaz;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.GerenciaInterfaz;
import servicios.GerenciaImplementacion;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method

		List<VentaDto> listaVenta = new ArrayList<VentaDto>();
		List<ClienteDto>listaCliente = new ArrayList<ClienteDto>();

		MenuInterfaz menuI = new MenuImplementacion();
		FicheroInterfaz ficheroI = new FicheroImplementacion();
		EmpleadoInterfaz empleadoI = new EmpleadoImplementacion();
		GerenciaInterfaz gerenciaI = new GerenciaImplementacion();

		int numero;
		boolean cerrarMenu = false;

		try {

			while (!cerrarMenu) {

				numero = menuI.mostrarMenu();

				switch (numero) {

				case 0:
					System.out.println("Has seleccionado la opcion de cerrar menu.");
					cerrarMenu = true;
					break;

				case 1:
					System.out.println("Has seleccionado la opcion de menu empleado.");
					ficheroI.ficheroLog("Has seleccionado la opcion de menu empleado.");

					int numeroEmpleado;
					boolean cerrarMenuEmpleado = false;

					while (!cerrarMenuEmpleado) {

						numeroEmpleado = menuI.mostrarMenuEmpleado();

						switch (numeroEmpleado) {
						case 0:
							System.out.println("Has seleccionado la opcion de cerrar menu empleado.");
							ficheroI.ficheroLog("Has seleccionado la opcion de cerrar menu empleado.");
							cerrarMenuEmpleado = true;
							break;

						case 1:
							System.out.println("Has seleccionado la opcion de calculo total ventas mensual.");
							ficheroI.ficheroLog("Has seleccionado la opcion de calculo total ventas mensual.");
							break;

						case 2:
							System.out.println("Has seleccionado la opcion de añadir compras a un cliente.");
							ficheroI.ficheroLog("Has seleccionado la opcion de añadir compras a un cliente.");

							empleadoI.aniadirCompraCliente(listaVenta);

							break;

						default:
							System.out.println("Has seleccionado una opcion incorrecta, intentelo de nuevo.");
							ficheroI.ficheroLog("Has seleccionado una opcion incorrecta.");
							break;
						}

					}

					break;

				case 2:
					System.out.println("Has seleccionado la opcion de menu gerencia.");
					ficheroI.ficheroLog("Has seleccionado la opcion de menu gerencia.");

					int numeroGerencia;
					boolean cerrarMenuGerencia = false;

					while (!cerrarMenuGerencia) {

						numeroGerencia = menuI.mostrarMenuGerencia();

						switch (numeroGerencia) {
						case 0:
							System.out.println("Has seleccionado la opcion de cerrar menu gerencia.");
							ficheroI.ficheroLog("Has seleccionado la opcion de cerrar menu gerencia.");
							cerrarMenuGerencia = true;
							break;

						case 1:
							System.out.println("Has seleccionado la opcion de crear nuevo cliente.");
							ficheroI.ficheroLog("Has seleccionado la opcion de crear nuevo cliente.");
							
							gerenciaI.crearCliente(listaCliente);
							
							break;


						default:
							System.out.println("Has seleccionado una opcion incorrecta, intentelo de nuevo.");
							ficheroI.ficheroLog("Has seleccionado una opcion incorrecta.");
							break;
						}

					}

					break;

				default:
					System.out.println("Has seleccionado una opcion incorrecta, intentelo de nuevo.");
					ficheroI.ficheroLog("Has seleccionado una opcion incorrecta.");
					break;

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
