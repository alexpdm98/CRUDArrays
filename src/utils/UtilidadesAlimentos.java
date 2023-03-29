package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import models.Alimento;

/** Clase con funciones que interactuan de con los Arrays en cada una de sus posiciones
 * @author: Alejandro Pineda
 * 
 */

public class UtilidadesAlimentos {
	//--------- Zona de declaración de variables --------
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader (isr);
	
	//--------- Fin de declaración de variables ---------- 
	
	/**--------- Constructor ------------------------------
	 * @param isr 
	 * El parámetro isr define un InputStreamRader, usado para obtener entradas de usuario
	 * 
	 * @param br
	 * El parámetro br define un BufferedReader, usado para formatear las entradas de usuario
	 */
	public UtilidadesAlimentos(InputStreamReader isr, BufferedReader br) {
		super();
		this.isr = isr;
		this.br = br;
	}
	//--------- Fin del constructor ----------------------
	
	/** Función utilizada para añadir datos en la misma posición, en los tres arrays del objeto Alimento.
	 * 
	 * @param alimento 
	 * El parámetro alimento hace referencia del array sobre el que trabaja el programa
	 * 
	 * @param index
	 * El parámetro index define la posición en la que se va a añadir un dato
	 */
	public void addDataToPosition(Alimento alimento, int index) throws NumberFormatException, IOException {
		
		System.out.println("Agregue una entrada a las proteinas de este alimento");
		//Evalúa que el string en esta posición esté vacío o borrado, si no, no se pueden añadir datos
		if(alimento.getProteinas()[index].isBlank()) {
		String datoIntroducido1 = br.readLine();
		//Añade el dato introducido por el usuario
		alimento.getProteinas()[index]=datoIntroducido1;
		}else {//En caso de no estar vacío
			System.out.println("Esta posición ya tiene datos, puede ser modificada o borrada, pero no se puede añadir nada.");
		}
		
		System.out.println("Agregue una entrada a las grasas de este alimento");
		//Evalúa que el string en esta posición esté vacío o borrado, si no, no se pueden añadir datos
		if(alimento.getGrasas()[index].isBlank()) {
		//Añade el dato introducido por el usuario
		String datoIntroducido = br.readLine();
		alimento.getGrasas()[index]=datoIntroducido;
		}else {//En caso de no estar vacío
			System.out.println("Esta posición ya tiene datos, puede ser modificada o borrada, pero no se puede añadir nada.");
		}
		
		System.out.println("Agregue una entrada a los hidratos de este alimento");
		//Evalúa que el string en esta posición esté vacío o borrado, si no, no se pueden añadir datos
		if(alimento.getHidratos()[index].isBlank()) {
		//Añade el dato introducido por el usuario
		String datoIntroducido2 = br.readLine();
		alimento.getHidratos()[index]=datoIntroducido2;
		}else {//En caso de no estar vacío
			System.out.println("Esta posición ya tiene datos, puede ser modificada o borrada, pero no se puede añadir nada.");
		}
	}
	
	/** Función utilizada para modificar datos en la misma posición, en los tres arrays del objeto Alimento.
	 * 
	 * @param alimento 
	 * El parámetro alimento hace referencia del array sobre el que trabaja el programa
	 * 
	 * @param index
	 * El parámetro index define la posición en la que se va a modificar un dato
	 */
	public void modifyDataInPosition(Alimento alimento, int index) throws NumberFormatException, IOException {
		
		//Si no se desea modificar esta parte del array en concreto, se introduce el mismo valor que tiene actualmente.
		System.out.println("¿Desea modificar una entrada de las proteinas de este alimento? Si no es así, introduce el dato introducido anteriormente, que es: (" + alimento.getProteinas()[index]+")");
		String datoIntroducido1 = br.readLine();
		//Evalúa que el string en esta posición ya haya sido añadido o no esté borrado, si no, no se puede modificar
		if("".equals(datoIntroducido1) || alimento.getProteinas()[index].isBlank()) {
			//En caso de estar vacío o borrado
			System.out.println("Este dato no se puede modificar o no necesita ser modificado");
		}else {//Se modifica el dato
		alimento.getProteinas()[index]=datoIntroducido1;
		}
		
		//Si no se desea modificar esta parte del array en concreto, se introduce el mismo valor que tiene actualmente.
		System.out.println("¿Desea modificar una entrada de las grasas de este alimento? Si no es así, introduce el dato introducido anteriormente, que es: (" + alimento.getGrasas()[index]+")");
		String datoIntroducido = br.readLine();
		//Evalúa que el string en esta posición ya haya sido añadido o no esté borrado, si no, no se puede modificar
		if("".equals(datoIntroducido) || alimento.getGrasas()[index].isBlank()) {
			//En caso de estar vacío o borrado
			System.out.println("Este dato no se puede modificar o no necesita ser modificado");
		}else {//Se modifica el dato
		alimento.getGrasas()[index]=datoIntroducido;
		}		
		
		//Si no se desea modificar esta parte del array en concreto, se introduce el mismo valor que tiene actualmente.
		System.out.println("¿Desea modificar una entrada de las hidratos de este alimento? Si no es así, introduce el dato introducido anteriormente, que es: (" + alimento.getHidratos()[index]+")");
		String datoIntroducido2 = br.readLine();
		//Evalúa que el string en esta posición ya haya sido añadido o no esté borrado, si no, no se puede modificar
		if("".equals(datoIntroducido2) || alimento.getHidratos()[index].isBlank()) {
			//En caso de estar vacío o borrado
			System.out.println("Este dato no se puede modificar o no necesita ser modificado");
		}else {//Se modifica el dato
			alimento.getHidratos()[index]=datoIntroducido2;
		}
	}
	
	/** Función utilizada para borrar datos en la misma posición, en los tres arrays del objeto Alimento.
	 * 
	 * @param alimento 
	 * El parámetro alimento hace referencia del array sobre el que trabaja el programa
	 * 
	 * @param index
	 * El parámetro index define la posición en la que se va a borrar un dato
	 */
	public void deleteDataInPosition(Alimento alimento, int index) throws NumberFormatException, IOException {
		
		//Pregunta a usuario si desea borrar ese string del array en concreto
		System.out.println("¿Desea borrar una entrada de las proteinas de este alimento? (Y/N)");
		String datoIntroducido1 = br.readLine();
		//En caso de confirmar y evaluar que no esté vacío o sin añadir nada
		if(("Y".equals(datoIntroducido1)|| "y".equals(datoIntroducido1)) && !alimento.getProteinas()[index].isBlank()) {
			//Sustituye lo que haya en esta posición del array por un espacio en blanco
			alimento.getProteinas()[index]="";
		//En caso de denegar, o que el dato esté en blanco
		}else if("N".equals(datoIntroducido1)|| "n".equals(datoIntroducido1) || alimento.getProteinas()[index].isBlank()){
			System.out.println("No se borrará este dato");
		//En caso de fallo por el usuario
		} else {
			System.out.println("Comando incorrecto");
		}
		
		//Pregunta a usuario si desea borrar ese string del array en concreto
		System.out.println("¿Desea borrar una entrada de las grasas de este alimento? (Y/N)");
		String datoIntroducido = br.readLine();
		//En caso de confirmar y evaluar que no esté vacío o sin añadir nada
		if(("Y".equals(datoIntroducido)|| "y".equals(datoIntroducido)) && !alimento.getGrasas()[index].isBlank()) {
			//Sustituye lo que haya en esta posición del array por un espacio en blanco
			alimento.getGrasas()[index]="";
		//En caso de denegar, o que el dato esté en blanco
		}else if("N".equals(datoIntroducido)|| "n".equals(datoIntroducido) || alimento.getGrasas()[index].isBlank()){
			System.out.println("No se borrará este dato");
		//En caso de fallo por el usuario
		} else {
			System.out.println("Comando incorrecto");
		}
		
		//Pregunta a usuario si desea borrar ese string del array en concreto
		System.out.println("¿Desea borrar una entrada de las hidratos de este alimento? (Y/N)");
		String datoIntroducido2 = br.readLine();
		//En caso de confirmar y evaluar que no esté vacío o sin añadir nada
		if(("Y".equals(datoIntroducido2)|| "y".equals(datoIntroducido2)) && !alimento.getHidratos()[index].isBlank()) {
			//Sustituye lo que haya en esta posición del array por un espacio en blanco
			alimento.getHidratos()[index]="";
		//En caso de denegar, o que el dato esté en blanco
		}else if("N".equals(datoIntroducido2)|| "n".equals(datoIntroducido2) || alimento.getHidratos()[index].isBlank()){
			System.out.println("No se borrará este dato");
		//En caso de fallo por el usuario
		} else {
			System.out.println("Comando incorrecto");
		}
	}
	
	/** Función utilizada para buscar la primera vez que se haya una dato en concreto en todos los arrays, o si no existe en ningún lado
	 * 
	 * @param alimento 
	 * El parámetro alimento hace referencia del array sobre el que trabaja el programa
	 * 
	 */
	public void searchDataInArrays(Alimento alimento) throws IOException {
		String datoIntroducido2;
		//Le pide al usuario el dato a buscar y lo pide mientras se introduzca un string vacío
		do{
			System.out.println("Introduzca el dato que desea buscar");
			datoIntroducido2 = br.readLine();
			} while(datoIntroducido2.isBlank());
		//Se inicializan variables
		int index = 0;
		boolean found = false;
		//Se busca el dato mientras no se encuentre o se alcance el tamaño máximo de los arrays.
		while(!found && index < alimento.getSize()) {
			//Si el dato en esta posición no está vacío y es igual al introducido por el usuario, se muestra por pantalla el array y la posición del mismo
			 if(!alimento.getProteinas()[index].isBlank() && alimento.getProteinas()[index].equals(datoIntroducido2)) {
				System.out.println("El dato buscado se encuentra en el array de proteínas en la posición "+ (index+1));
				//Se ha encontrado el dato
				found = true;
			//Si el dato en esta posición no está vacío y es igual al introducido, se muestra por pantalla el array y la posición	
			}else if(!alimento.getGrasas()[index].isBlank() && alimento.getGrasas()[index].equals(datoIntroducido2)) {
				System.out.println("El dato buscado se encuentra en el array de grasas en la posición "+ (index+1));
				//Se ha encontrado el dato
				found = true;
			//Si el dato en esta posición no está vacío y es igual al introducido, se muestra por pantalla el array y la posición	
			}else if(!alimento.getHidratos()[index].isBlank() && alimento.getHidratos()[index].equals(datoIntroducido2)) {
				System.out.println("El dato buscado se encuentra en el array de hidratos en la posición "+ (index+1));
				//Se ha encontrado el dato
				found = true;
			}
			//Se avanza una posición en todos los arrays
			index ++;
			//Si se ha llegado al final del array, y no se ha encontrado el dato, se muestra por pantalla
			if (index == alimento.getSize()) {
				System.out.println("El dato buscado no se encuentra en ninguno de los arrays.");
			}
		}
	}
}
