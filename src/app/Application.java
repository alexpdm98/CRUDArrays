package app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import models.Alimento;
import service.ServicioAlimentos;
import utils.UtilidadesAlimentos;
import utils.UtilidadesGUI;

/**
 * Clase main en la que se ejecuta el servicio.
 * @author: Alejandro Pineda
 */

public class Application {
/**
 * Se lanza el main de la aplicación
 */
	public static void main(String[] args) {
		//--------- Zona de declaración de variables --------
		int size = 20;
		String [] proteinas = new String[size];
		Arrays.fill(proteinas, "");
		String [] grasas = new String[size];
		Arrays.fill(grasas, "");
		String [] hidratos = new String[size];
		Arrays.fill(hidratos, "");
		Alimento alimento = new Alimento(size, proteinas, grasas, hidratos);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		UtilidadesAlimentos utilidadesAlimentos = new UtilidadesAlimentos(isr, br) ;
		UtilidadesGUI utilidadesGUI = new UtilidadesGUI();
		
		ServicioAlimentos servicioAlimentos = new ServicioAlimentos(utilidadesAlimentos, utilidadesGUI, isr, br);
		//--------- Fin de declaración de variables ---------- 
		
		//Se llama a la función que encapsula la lógica de negocio
		try {
			servicioAlimentos.carapaceMenu(alimento);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

