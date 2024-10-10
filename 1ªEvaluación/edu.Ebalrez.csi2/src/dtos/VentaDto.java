package dtos;

import java.time.LocalDateTime;

/*
 * Entidad Venta
 * ebp 10/10/24
 */
public class VentaDto {

	//Atributos 
	
	long idCompra;
	long idCliente;
	int importeVenta = 99999;
	LocalDateTime fechaVenta = LocalDateTime.now();
	
	//Getters & Setters
	public long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(long idCompra) {
		this.idCompra = idCompra;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public int getImporteVenta() {
		return importeVenta;
	}

	public void setImporteVenta(int importeVenta) {
		this.importeVenta = importeVenta;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	//Constructor
	
	public VentaDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
