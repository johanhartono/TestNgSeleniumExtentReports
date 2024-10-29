package config;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
public class PropertiesFile {
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}

	public static void readPropertiesFile() {
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("D:\\QA software Tester\\eclipse\\WorkBench\\TestNgSeleniumExtentReports\\src\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile() {
		Properties prop = new Properties();
		try {
			OutputStream output = new FileOutputStream("D:\\QA software Tester\\eclipse\\WorkBench\\TestNgSeleniumExtentReports\\src\\config\\config.properties");
			prop.setProperty("browser", "edge");
			prop.setProperty("result", "pass");
			prop.store(output, null);
			//System.out.println(prop.getProperty("browser"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
