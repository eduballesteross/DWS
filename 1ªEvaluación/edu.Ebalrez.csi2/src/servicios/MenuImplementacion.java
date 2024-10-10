package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public int mostrarMenu() {
		// TODO Auto-generated method stub

		int numero;

		System.out.println("###############################");
		System.out.println(" 0 - Cerrar la aplicación");
		System.out.println(" 1 - Menu Empleado");
		System.out.println(" 2 - Menu Gerencia");
		System.out.println("###############################");

		numero = sc.nextInt();
		return numero;
	}

	@Override
	public int mostrarMenuEmpleado() {
		// TODO Auto-generated method stub
		int numero;

		System.out.println("###############################");
		System.out.println(" 0 - Cerrar la aplicación");
		System.out.println(" 1 - Calculo total de ventas mensual");
		System.out.println(" 2 - Añadir compra a un cliente.");
		System.out.println("###############################");

		numero = sc.nextInt();
		return numero;
	}

	@Override
	public int mostrarMenuGerencia() {
		// TODO Auto-generated method stub

		int numero;

		System.out.println("###############################");
		System.out.println(" 0 - Cerrar la aplicación");
		System.out.println(" 1 - Crear nuevo cliente"); 
		System.out.println("###############################");

		numero = sc.nextInt();
		return numero;
	
		
	}

}
