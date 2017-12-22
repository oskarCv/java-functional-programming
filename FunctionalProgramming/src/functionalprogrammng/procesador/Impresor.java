package functionalprogrammng.procesador;

import functionalprogrammng.interfaces.Procesar;

public class Impresor implements Procesar {
	/**
	 * antes de java 8 el problema que supenian las intefaces es que tantas
	 * diferentes variaciones se quieren hacer de un metodo de una interface se
	 * teninan que definir directamente los metodos en la interface lo cual
	 * supone el problema de que todas las clases que implementan la interface
	 * forsosamente tinene que implementar todos los metodos de ella
	 */
	
	@Override
	public void procesa(String str) {
		System.out.println(str);
	}
/*
	@Override
	public void procesa(String[] str) {
		for (String string : str) {
			procesa(string);
		}

	}
*/
}
