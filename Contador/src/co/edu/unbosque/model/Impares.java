package co.edu.unbosque.model;

public class Impares {

	public Impares() {
		
	}
	public int contarImpares(int inputNumber) {
		int digito = 0;
		int impares = 0;

		while (inputNumber > 0) {
			digito = (inputNumber % 10);
			if (digito % 2 != 0) {
				impares++;
			}
			inputNumber = inputNumber / 10;
		}
		return impares;
	}

}
