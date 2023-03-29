package service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import models.Alimento;
import utils.UtilidadesAlimentos;
import utils.UtilidadesGUI;

/**
 *	Clase con la lógica de negocio esperada de la aplicación.
 * @author: Alejandro Pineda
 */

public class ServicioAlimentos {
	//--------- Zona de declaración de variables --------
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader (isr);
	
	UtilidadesAlimentos utilidadesAlimentos = new UtilidadesAlimentos(isr, br);
	UtilidadesGUI utilidadesGUI;
	//--------- Fin de declaración de variables ---------- 
	
	/**--------- Constructor ------------------------------
	 * @param utilidadesAlimentos
	 * El parámetro utilidadesAlimentos se utiliza para instanciar el servicio de utilidades con la logica de servicio
	 * 
	 * @param utilidadesGUI
	 *  El parámetro utilidadesAlimentos se utiliza para instanciar el servicio de utilidades con interfaz grafica
	 * 
	 * @param isr 
	 * El parámetro isr define un InputStreamRader, usado para obtener entradas de usuario
	 * 
	 * @param br
	 * El parámetro br define un BufferedReader, usado para formatear las entradas de usuario
	 */
	public ServicioAlimentos(UtilidadesAlimentos utilidadesAlimentos, UtilidadesGUI utilidadesGUI,
			InputStreamReader isr, BufferedReader br) {
		super();
		this.utilidadesAlimentos = utilidadesAlimentos;
		this.utilidadesGUI = utilidadesGUI;
		this.isr = isr;
		this.br = br;
	}
	//--------- Fin del constructor ----------------------
	
	/** Función utilizada para recorrer el array hasta el final.
	 * 
	 * @param alimento 
	 * El parámetro alimento hace referencia del array sobre el que trabaja el programa
	 * 
	 * @return el resultado del fin de ciclo.
	 * El parámetro index define la posición en la que se va a añadir un dato
	 */
	public Integer cyclicMenu(Alimento alimento) throws IOException {
		//Se inicializan las variables necesarias en la función y se muestra el menú de inicio
		int index=0;
		this.utilidadesGUI.startMenu();
		Integer resultado = null;
		boolean salida = false;
		do {
			//Se muestra el menú con las opciones a realizar en esta posición en concreto de los arrays
			this.utilidadesGUI.lifecycleMenu();
			//Se lee la respuesta de usuario
			Integer datoIntroducido = null;
			try {
				datoIntroducido = Integer.valueOf(br.readLine());
			}catch (NumberFormatException e) {
				datoIntroducido=6;
			}
			//Se evalúa la respuesta del usuario
			switch (datoIntroducido) {
				case 1:{
					//Se añade un dato a la posición
					this.utilidadesAlimentos.addDataToPosition(alimento, index);
					//Se avanza una posición
					index++;
					break;
						}
				case 2: {
					//Se añade un dato a la posición
					this.utilidadesAlimentos.modifyDataInPosition(alimento, index);
					//Se avanza una posición
					index++;
					break;
						}
				case 3:{
					//Se borra un dato de la posición
					this.utilidadesAlimentos.deleteDataInPosition(alimento, index);
					//Se avanza una posición
					index++;
					break;
						}
				case 4:{
					//Se busca un dato y se muestra por pantalla dónde está o si no está en los arrays
					this.utilidadesAlimentos.searchDataInArrays(alimento);
					break;
						}
				case 5:{
					//Se sale del menú
					salida = true;
					break;
						}
				default:{
					//En caso de introducir un valor no esperado
					System.out.println("ERROR: DATO NO VALIDO.");
						}
			}
		}while(!salida && index < alimento.getSize());
		//Se evalua el motivo por el que acaba el bucle, y se debvuelve un resultado acorde
		//Se sale del menú el usuario
		if (salida) {
			resultado = 0;
		} //Se ha llegadon al final del array
		else if (index == alimento.getSize()) {
			resultado = 1;
		}
		return resultado;
	}
	
	/** Función que encapsula al menú cíclico y que gestiona los resultados de la misma.
	 * 
	 * @param alimento 
	 * El parámetro alimento hace referencia del array sobre el que trabaja el programa
	 * 
	 */
	public void carapaceMenu(Alimento alimento) throws IOException {
		//Inicializan variables
		boolean exit = false;
		do {
			//Se ejecuta el array hasta el final o hasta que el usuario quiera salir
			int result = this.cyclicMenu(alimento);
			//Se evalúa el resultado de la función
			switch (result) {
				case 0:{//Se pregunta si el usuario verdaderamente quiere salir del menú y terminar el programa
						this.utilidadesGUI.exitMenu();
						String respuesta1 = br.readLine();
						//Se procesa la respuesta del usuario
						if("Y".equals(respuesta1)|| "y".equals(respuesta1))
						{
							exit = true;
						}
						break;
						}
				case 1:{//Se avisa al que se ha alcanzado el tamaño máximo del array, y pregunta si desea volver a recorrer el array o terminar el programa
					this.utilidadesGUI.maximumSizeMenu();
					String respuesta2 = br.readLine();
					//Se procesa la respuesta del usuario
					if("N".equals(respuesta2)|| "n".equals(respuesta2))
					{
						exit = true;
					}
					break;
					}
				default:{
					//En caso de introducir un valor no esperado
					System.out.println("ERROR: DATO NO VALIDO.");
					}
			}
		}while(!exit);
		//Bye Bye Usuario :'(
		this.utilidadesGUI.byeByeMenu();
	}

}
