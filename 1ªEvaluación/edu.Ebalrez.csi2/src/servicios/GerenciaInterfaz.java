package servicios;

import java.util.List;

import dtos.ClienteDto;

/*
 * Listado de métodos relacionados con la gerencia
 */
public interface GerenciaInterfaz {
	
	/*
	 * Método que crea un nuevo cliente
	 * ebp - 10/10/24
	 */
	
	public void crearCliente(List<ClienteDto>listaCliente);

}
