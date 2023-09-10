package co.edu.unbosque.model;

public class Primos {

	private boolean esPrimo = true;

	public Primos() {

	}

	public boolean esPrimo(int inputNumber) {

		if (inputNumber <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
			if (inputNumber % i == 0) {
				esPrimo = false;
				break;
			} else {
				esPrimo = true;
			}
		}
		return esPrimo;
	}

}
