package dtos;
/*
 * Entidad Cliente
 * ebp 10/10/24
 */
public class ClienteDto {

	 // Atributos
	
	long id;
	String nombreCliente = "aaaaaaaa";
	String apellidosClient = "aaaaaaa";
	
	//Constructor
	public ClienteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getters & Setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosClient() {
		return apellidosClient;
	}
	public void setApellidosClient(String apellidosClient) {
		this.apellidosClient = apellidosClient;
	}
	
	
}
