package servicios;

import java.util.List;

import dtos.VentaDto;

/*
 * Listado de métodos relacionados con la funcion del empleado
 * ebp 10/10/24
 */
public interface EmpleadoInterfaz {
	
	public void aniadirCompraCliente(List<VentaDto>listaVenta);

}
