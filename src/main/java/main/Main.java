package main;

import pruebaMenu.Menu;

public class Main {

	public static void main(String[] args) {
		System.setProperty("java.util.logging.config.file", "path/to/logging.properties");
		(new Menu()).iniciar();
	}

}
