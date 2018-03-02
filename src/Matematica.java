import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Matematica {
	
	
	
	/**
	 * @author yaiza
	 */
	
	/**
	 * 
	 * @
	 * @return a+b
	 * 
	 * devuleve la suma de a y b e inserta el resultado en el array
	 * 
	 * se crea variable resultado vacia para despues rellenar con
	 * el resultado de la operacion
	 * 
	 * una vez con hecho esto añadimos el resultado
	 * al array
	 * 
	 * y despues devolvemos en el mismo metodo la suma 
	 */
	public int suma(int a, int b){
		int resultado = a + b; 
		
		int[] sumas = new int [2];  
		int guardar = 0; 
		for( int i = 0; i < sumas.length; i++){
			 guardar = resultado + sumas[i]; 
			
		}
		
		return resultado;
		
	}
	
	/**
	 * 
	 * 
	 * @return si a es mayor que b verdadero y si b es mayor que a falso
	 * 
	 * hecho con un if else y que devuelva true o false
	 */
	public boolean mayor(int a, int b){
		if(a > b){
			return true; 
		}else{
			return false; 
		}
	}
	
	/**
	 * 
	 *
	 *
	 * devuleve el array de sumas
	 * 
	 * lo que hace el metodo sumas() es recorrer el arraylist
	 * y devolverlo con sus resultados
	 */
	
	public int[] sumas(){
	
		int[] sumas = new int[2];  
		
		for(int i = 0; i < sumas.length; i++){
			System.out.println(sumas);
		}
		
		return sumas;
	}
}
