package hu.bme.iit.itlab1;

import java.io.File;

/**
 * Delegátor osztály. Egy java.io.File objektumot tartalmaz (publikus value
 * attribútum), és feladata, hogy a toString() metódus a tartalmazott fájl nevét
 * (előtagok nélkül) adja vissza.
 * 
 * @author mamunga
 */

public class FileWrap {
	public File value;

	public FileWrap(String fileName) {
		value = new File(fileName);
	}

	@Override
	public String toString() {

		return value.getName();

	}

}
