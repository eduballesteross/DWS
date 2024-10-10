package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

/*
 * Implementacion de la interfaz Gerencia
 * ebp 10/10/24
 */
public class GerenciaImplementacion implements GerenciaInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void crearCliente(List<ClienteDto> listaCliente) {
		// TODO Auto-generated method stub

		try {

			boolean bucle = false;
			String respuesta;
			
			while (!bucle) {
				
				ClienteDto nuevoCliente = new ClienteDto();

				long id = calcularID(listaCliente);

				System.out.println("Introduzca el nombre del cliente.");
				String nombre = sc.nextLine();

				System.out.println("Introduzca los apellidos del cliente.");
				String apellidos = sc.nextLine();

				nuevoCliente.setId(id);
				nuevoCliente.setApellidosClient(apellidos);
				nuevoCliente.setNombreCliente(nombre);
				listaCliente.add(nuevoCliente);
				
				System.out.println("¿Desea añadir otro cliente?");
				respuesta = sc.next();
				
				if(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("s")) {
					
				}else {
					bucle=true;
				}
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/*
	 * Método que calcula y genera un id automaticamente. ebp-10/10/24
	 */
	private long calcularID(List<ClienteDto> listaCliente) {

		ClienteDto cliente = new ClienteDto();

		long idAux = 1;
		int tamanio = 0;

		if (tamanio == listaCliente.size()) {

			cliente.setId(idAux);

		} else {

			idAux = cliente.getId() + 1;

		}

		return idAux;

	}

}
