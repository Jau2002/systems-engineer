package co.edu.unbosque.model;

public class Pares {

	public Pares() {
	}
	
	public int contarPares(int inputNumber) {
		int digito = 0;
		int pares = 0;

		while (inputNumber > 0) {
			digito = (inputNumber % 10);
			if (digito % 2 == 0) {
				pares++;
			}
			inputNumber = inputNumber / 10;
		}
		return pares;
	}

}
