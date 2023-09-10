package co.edu.unbosque.controller;

import co.edu.unbosque.model.Impares;
import co.edu.unbosque.model.Pares;
import co.edu.unbosque.model.Primos;
import co.edu.unbosque.view.ViewConsole;

public class Controller {

	private ViewConsole console;
	private Pares pares;
	private Impares impares;
	private Primos primos;

	public Controller() {
		console = new ViewConsole();
		pares = new Pares();
		impares = new Impares();
		primos = new Primos();

		funcionar();
	}

	private void funcionar() {
		menu();
	}

	private void menu() {
		optionHandler();
	}

	private void optionHandler() {
		int inputNumber = 0;
		int respuesta = 0;
		int opc = 0;
		boolean run = true;
		do {
			console.readMessage("\nBienvenido\n" + "¿Qué deseas hacer?\n" + "1. Contar pares\n" + "2. Contar impares\n"
					+ "3. Averiguar si es primo\n" + "4. Salir\n");
			opc = console.readNumber();
			switch (opc) {
			case 1:
				console.readMessage("----- Contar Numeros Pares -----\n" + "Ingresar número: ");
				inputNumber = console.readNumber();
				respuesta = contarPares(inputNumber);
				console.readMessage("Hay " + respuesta + " pares en " + inputNumber);
				inputNumber = 0;
				respuesta = 0;

				break;
			case 2:
				console.readMessage("----- Contar Numeros Impares -----\n" + "Ingresar número: ");
				inputNumber = console.readNumber();
				respuesta = contarImpares(inputNumber);
				console.readMessage("Hay " + respuesta + " impares en " + inputNumber);
				contarImpares(respuesta);
				inputNumber = 0;
				respuesta = 0;

				break;
			case 3:
				console.readMessage("----- Numeros primos -----\n" + "Ingresar número: ");
				inputNumber = console.readNumber();

				if (esPrimo(inputNumber)) {
					console.readMessage(inputNumber + " Es primo");
				} else {
					console.readMessage(inputNumber + " No es primo");
				}
				inputNumber = 0;
				break;
			case 4:
				console.readMessage("Adios!");
				run = false;
				break;
			default:
				console.readMessage("Opción incorrecta, intentelo de nuevo");
				opc = 0;
				break;
			}
		} while (run);
	}

	private int contarPares(int inputNumber) {
		return pares.contarPares(inputNumber);
	}

	private int contarImpares(int inputNumber) {
		return impares.contarImpares(inputNumber);
	}

	private boolean esPrimo(int inputNumber) {
		return primos.esPrimo(inputNumber);
	}
}
