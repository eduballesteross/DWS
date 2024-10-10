package servicios;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import dtos.VentaDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void aniadirCompraCliente(List<VentaDto> listaVenta) {
		// TODO Auto-generated method stub
		
	try {
		
	VentaDto nuevaVenta = new VentaDto();
		
		LocalDateTime fechaVenta = LocalDateTime.now();
		
		long idCompra=calcularID(listaVenta);
		
		System.out.println("Introduzca el id del cliente");
		long idCliente = sc.nextLong();

		System.out.println("Introduzca el importe de la venta");
		int importeVenta = sc.nextInt();
		
		nuevaVenta.setFechaVenta(fechaVenta);
		nuevaVenta.setIdCliente(idCliente);
		nuevaVenta.setIdCompra(idCompra);
		nuevaVenta.setImporteVenta(importeVenta);
		
		listaVenta.add(nuevaVenta);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}
	
	private long calcularID(List<VentaDto>listaVenta) {
		
		VentaDto venta = new VentaDto();

		
		long idAux = 1;
		int tamanio = 0;
		
		if(tamanio==listaVenta.size()) {
			
			venta.setIdCompra(idAux);
			
		}else{
			
			idAux= venta.getIdCliente()+1;
			
		}
		
		return idAux;
		
	}

}
