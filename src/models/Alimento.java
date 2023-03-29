package models;

import java.util.Arrays;
import java.util.Objects;

/**
 * DAO en el que se encapsulan los Arrays solicitados para esta práctica.
 * @author: Alejandro Pineda
 */

public class Alimento {
	//--------- Zona de declaración de variables --------
	int size;
	String proteinas[];
	String grasas[];
	String hidratos[];
	//--------- Fin de declaración de variables ---------- 
	
	/**--------- Constructor ------------------------------
	 * @param size
	 * El parámetro size define el tamaño del Array.
	 * 
	 * @param proteinas
	 *  El parámetro proteinas define una de los Arrays que compone el objeto
	 * 
	 * @param grasas
	 *  El parámetro grasas define una de los Arrays que compone el objeto
	 * 
	 * @param hidratos
	 *  El parámetro hidratos define una de los Arrays que compone el objeto
	 * */
	public Alimento(int size, String[] proteinas, String[] grasas, String[] hidratos) {
		super();
		this.size = size;
		this.proteinas = proteinas;
		this.grasas = grasas;
		this.hidratos = hidratos;
	}
	//--------- Fin del constructor ----------------------
	
	//---------- Getters  ------------
	public int getSize() {
		return size;
	}
	
	public String[] getProteinas() {
		return proteinas;
	}

	public String[] getGrasas() {
		return grasas;
	}

	public String[] getHidratos() {
		return hidratos;
	}

	//------ Hashcode ---------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grasas);
		result = prime * result + Arrays.hashCode(hidratos);
		result = prime * result + Arrays.hashCode(proteinas);
		result = prime * result + Objects.hash(size);
		return result;
	}

	//------ Equals ---------
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alimento other = (Alimento) obj;
		return Arrays.equals(grasas, other.grasas) && Arrays.equals(hidratos, other.hidratos)
				&& Arrays.equals(proteinas, other.proteinas) && size == other.size;
	}

	//------ toString ---------
	@Override
	public String toString() {
		return "Alimento [size=" + size + ", proteinas=" + Arrays.toString(proteinas) + ", grasas="
				+ Arrays.toString(grasas) + ", hidratos=" + Arrays.toString(hidratos) + "]";
	}
	
	
	
}