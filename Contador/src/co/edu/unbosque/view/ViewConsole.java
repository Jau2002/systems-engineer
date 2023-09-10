package co.edu.unbosque.view;

import java.util.Scanner;

public class ViewConsole {
	private Scanner scanner;

	public ViewConsole() {
		scanner = new Scanner(System.in);
	}

	public void readMessage(String message) {
		System.out.println(message);
	}

	public int readNumber() {
		int aux = scanner.nextInt();
		return aux;
	}
}
