package pruebaMenu;

import java.util.List;
import java.util.Scanner;

import Objects.Products;
import Objects.Users;
import gestorPrueba.GestorUsuarios;


public class Menu {
	public Menu() {
		teclado = new Scanner(System.in);
	}

	private Scanner teclado = null;

	public void iniciar() {
		int opcion = 0;
		do {
			opcion = opcionMenuInicial();
			if (opcion != 0) {
				ejecutarOpcionMenuInicial(opcion);
			}
		} while (opcion != 0);
	}

	private int opcionMenuInicial() {
		int ret = 0;
		do {
			try {
				escribirMenuInicial();
				System.out.print("Elija una opcion: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) || (ret > 9));
		return ret;
	}

	private void escribirMenuInicial() {
		System.out.println(" ");
		System.out.println("---- MENU ----");
		System.out.println("---- 0 - SALIR ");
		System.out.println("---- 1 - Mostrar los siguientes campos de los empleados del departamento 10");
		System.out.println("--------------");
	}

	private void ejecutarOpcionMenuInicial(int opcion) {
		System.out.println(" ");
		switch (opcion) {
		case 0:
			System.out.print("Adios!!!");
			break;
		case 1:
			mostrarTodosLosEmpleadosConElDeptno10();
			break;
		}

	}

	public static void verTodosLosDepartamentos(List<Products> list) {
		try {
			if (list != null) {
				for (Products empleados : list) {
					System.out.println("-------------------------------------");
					System.out.println("Apellido - " + empleados.getName());
					System.out.println("-------------------------------------");
				}
			} else {
				System.out.println("No hay ningun empleados en BBDD.");
			}
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());

		}

	}

	private void mostrarTodosLosEmpleadosConElDeptno10() {
		verTodosLosDepartamentos(devolverTodosLosDepartamentos());
	}

	private List<Products> devolverTodosLosDepartamentos() {
		GestorUsuarios gestorEmpleado = new GestorUsuarios();
		return gestorEmpleado.getAll();
	}

}