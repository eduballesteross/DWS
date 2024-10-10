package servicios;

/*
 * Listado de métodos relacionados con los distintos menus de la aplicación
 * ebp-10/10/24
 */
public interface MenuInterfaz {
	
	/*
	 * Método que muestra el menu principal y recoge la selección.
	 * ebp - 10/10/24
	 */
	public int mostrarMenu();
	
	/*
	 * Método que muestra el menu empleado y recoge su selección
	 * ebp 10/10/24
	 */
	public int mostrarMenuEmpleado();
	
	/*
	 * Método que muestra el menu gerencia y recoge su selección
	 * ebp 10/10/24
	 */
	public int mostrarMenuGerencia();
	
}
