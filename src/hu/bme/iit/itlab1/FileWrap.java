package hu.bme.iit.itlab1;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

/**
 * Delegátor osztály. Egy java.io.File objektumot tartalmaz (publikus value
 * attribútum), és feladata, hogy a toString() metódus a tartalmazott fájl nevét
 * (előtagok nélkül) adja vissza.
 * 
 * @author mamunga, phazek
 */

public class FileWrap {
	public File value;

	public FileWrap(String fileName) {
		value = new File(fileName);
	}

	@Override
	public String toString() {

		String fname = value.getName();
		int pos = fname.lastIndexOf(System.getProperty("file.separator"));
		if (pos > 0) {
			fname = fname.substring(0, pos + 1);
		}
		
		if(fname.length() < 1)
			return "/";
		
		return fname;

	}

}
