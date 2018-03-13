package kh.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc.oracle.thin:@localhost:1521:xe");
		prop.setProperty("user", "gildong");
		prop.setProperty("password", "jigigi");
		
//		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("oracleDriver.dat"), "jdbc.oracle");
			prop.store(new FileWriter("oracleDriver.txt"), "writer를 이용");
			prop.storeToXML(new FileOutputStream("oracleXml.xml"), "xml파일로");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Properties readProp = new Properties();
		
		try {
//			readProp.load(new FileInputStream("oracleDriver.dat"));
//			readProp.load(new FileReader("oracleDriver.txt"));
			readProp.loadFromXML(new FileInputStream("oracleXml.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(readProp);
		
		System.out.println(prop.getProperty("url"));
		
		prop.remove("url");
		System.out.println(prop);
		
	}

}
