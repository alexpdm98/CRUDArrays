package utils;

/**
 * Clase con funciones de Interfaz Gráfica de Usuario
 * @author: Alejandro Pineda
 */ 

public class UtilidadesGUI {

	public UtilidadesGUI() {
		super();
	}
	
	/**
	 * Función que muestra al usuario las utilidades del programa
	 */
	public void startMenu() {
		System.out.println(
				"-----------------------------------------------------\r\n"
				+ "          ____                                     \r\n"
				+ "        ,'  , `.                                   \r\n"
				+ "     ,-+-,.' _ |                                   \r\n"
				+ "  ,-+-. ;   , ||              ,---,          ,--,  \r\n"
				+ " ,--.'|'   |  ;|          ,-+-. /  |       ,'_ /|  \r\n"
				+ "|   |  ,', |  ':  ,---.  ,--.'|'   |  .--. |  | :  \r\n"
				+ "|   | /  | |  || /     \\|   |  ,\"' |,'_ /| :  |  \r\n"
				+ "'   | :  | :  |,/    /  |   | /  | ||  ' | |  . .  \r\n"
				+ ";   . |  ; |--'.    ' / |   | |  | ||  | ' |  | |  \r\n"
				+ "|   : |  | ,   '   ;   /|   | |  |/ :  | : ;  ; |  \r\n"
				+ "|   : '  |/    '   |  / |   | |--'  '  :  `--'   \\ \r\n"
				+ ";   | |`-'     |   :    |   |/      :  ,      .-./ \r\n"
				+ "|   ;/          \\   \\  /'---'        `--`----'     \r\n"
				+ "'---'            `----'                            \r\n"
				+"                                                    \r\n"
				+"--------------------------------------------------------\r\n"
				+"                                                      \r\n"
				+"Este es el menú de inicio, en el que se explica \r\n"
				+"brevemente la funcionalidad del programa. \r\n"
				+"                                           \r\n"
				+"Este programa está pensado para almacenar \r\n"
				+"la información nutricional de diferentes alimentos.\r\n"
				+"                                                    \r\n"
				+"Se pueden realizar distintas operaciones en cada una\r\n"
				+"de las posiciones del array: \r\n"
				+"---------------------------------------------------------\r\n"
				+"1) Añadir información nutricional.\r\n"
				+"2) Modificar información nutricional. \r\n"
				+"3) Borrar información nutricional. \r\n"
				+"4) Buscar algún dato en el array.  \r\n "
				+"5) Parar el ciclo del menu y salir.  \r\n "
				+"----------------------------------------------------------\r\n"
				+"Hay que tener en cuenta, que las posiciones vacías\r\n"
				+"no se pueden modificar o eliminar, solo se puede añadir \r\n"
				+"información.                                            \r\n"
				+ "----------------------------------------------------------\r\n");
		}
	
	/**
	 * Función que muestra en cada una de las iteraciones las opciones al usuario
	 */
	public void lifecycleMenu() {
		System.out.println(
				"----------------------------------------------------------\r\n"
				+"Seleccione una de las cinco opciones (1,2,3,4,5) \r\n"
				+"---------------------------------------------------------\r\n"
				+"1) Añadir información nutricional.\r\n"
				+"2) Modificar información nutricional. \r\n"
				+"3) Borrar información nutricional. \r\n"
				+"4) Buscar algún dato en el array.  \r\n "
				+"5) Parar el ciclo del menu y salir.  \r\n "
				+"----------------------------------------------------------\r\n"
				+"                                                     		\r\n"
				+"-----------------------------------------------------------\r\n"
				);
	}
	
	/**
	 * Función que muestra por pantalla al usuario que ha alcanzado el final del array
	 */
	public void maximumSizeMenu() {
		System.out.println(
				"----------------------------------------------------------\r\n"
				+"Ha alcanzado el final del array.\r\n"
				+"¿Desea volver a recorrer el array? (Y/N)\r\n"
				+"---------------------------------------------------------\r\n"
				+"1) Sí. (Y)\r\n"
				+"2) No. (N)\r\n"
				+"----------------------------------------------------------\r\n"
				);
	}
	
	/**
	 * Función que se imprime por pantalla al intentar finalizar el programa
	 */
	public void exitMenu() {
		System.out.println(
				"----------------------------------------------------------\r\n"
				+"Ha escogido salir.\r\n"
				+"¿Desea realmente salir? (Y/N)\r\n"
				+"---------------------------------------------------------\r\n"
				+"1) Sí. (Y)\r\n"
				+"2) No. (N)\r\n"
				+"----------------------------------------------------------\r\n"
				);
	}
	
	/**
	 * Función que muestra que se ha finalizado el programa
	 */
	public void byeByeMenu() {
		System.out.println("                                                                     \r\n"
				+ "                                                                     \r\n"
				+ "    ,---,.                                                           \r\n"
				+ "  ,'  .'  \\                             ,---,                        \r\n"
				+ ",---.' .' |                           ,---.'|                        \r\n"
				+ "|   |  |: |                           |   | :                        \r\n"
				+ ":   :  :  /     .--,   ,---.          :   : :         .--,   ,---.   \r\n"
				+ ":   |    ;    /_ ./|  /     \\         :     |,-.    /_ ./|  /     \\  \r\n"
				+ "|   :     \\, ' , ' : /    /  |        |   : '  | , ' , ' : /    /  | \r\n"
				+ "|   |   . /___/ \\: |.    ' / |        |   |  / :/___/ \\: |.    ' / | \r\n"
				+ "'   :  '; |.  \\  ' |'   ;   /|        '   : |: | .  \\  ' |'   ;   /| \r\n"
				+ "|   |  | ;  \\  ;   :'   |  / |        |   | '/ :  \\  ;   :'   |  / | \r\n"
				+ "|   :   /    \\  \\  ;|   :    |        |   :    |   \\  \\  ;|   :    | \r\n"
				+ "|   | ,'      :  \\  \\\\   \\  /         /    \\  /     :  \\  \\\\   \\  /  \r\n"
				+ "`----'         \\  ' ; `----'          `-'----'       \\  ' ; `----'   \r\n"
				+ "                `--`                                  `--`           ");
	}
}
