package filepathExist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DictionaryFilePath {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Apple:  " + doesfileExist("data\\dictionary.properties", "Apple"));
		System.out.println("Table:  " + doesfileExist("data\\dictionary.properties", "Table"));
		System.out.println("Orange:  " + doesfileExist("data\\dictionary.properties", "Orange"));

	}
//************************************
//Method reads the property file Dictionary ----Reads the Key values from the file
//Example: path://	data\\dictionary.properties, Key = Apple
	public static String doesfileExist(String path, String Key) {

		try {
			File f = new File(path);// file
			FileInputStream filestr = new FileInputStream(f);
			Properties propFile = new Properties();// read properties file
			propFile.load(filestr);
			return propFile.getProperty(Key);// return key from properties file

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return "";

		} catch (IOException e) {
			System.out.println("I/O Exeption");
			return "";

		}

	}

}
