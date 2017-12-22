package functionalprogramming.app;

import functionalprogrammng.procesador.Impresor;

public class AppMain {

	public static void main(String[] args) {
		String []strings = {"string 1","string 2","string 3","string 4","string 5"};
		Impresor impresor = new Impresor();
		impresor.procesa(strings);
	}

}
