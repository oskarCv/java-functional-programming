package functionalprogrammng.interfaces;

public interface Procesar {
	
	/**
	 * 
	 * @param str
	 * Supongamos que tenemos dos metodos para implementar en la interface, se quiere definir una implementacion por defecto en uno de ellos 
	 * para todas las clases que implementen esta interface 
	 * 
	 * antes de java 8 esto no era posible
	 *  
	 * void procesa(String str);
	 * void procesa(String []str);
	 * 
	 * con la llegada de java 8 podemos indicar una implementacion por defecto y definir su comportamiento
	 * lo que es mas no es requerido que la implementemos directamente en la clase que implementa la interface 
	 */
	
	void procesa(String str);
	
	default void procesa(String []strings){
		for(String str:strings){
			//no hay ninguna limitante encuanto a emplear los metodos que aun no estan implementados desde el methodo default
			procesa(str);
		}
	}
}
