package practicetwo.Parameters;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class ParseProperties {
	private Properties proper = new Properties();
	String value = null;

	//Load properties file
	public ParseProperties(String propertiespath) {
		this.loadProperties(propertiespath);
	}

	private void loadProperties(String propertiespath) {
		// TODO Auto-generated method stub
		InputStream in;
		try {
			in = new FileInputStream(propertiespath);
			InputStreamReader inr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(inr);
			proper.load(br);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getValue(String keyname) {
		value = proper.getProperty(keyname).trim();
		try {
			value = new String(value.getBytes("UTF-8"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	/*
	 * ≤‚ ‘∑Ω∑®
	public static void main(String[] args) {
		ParseProperties a = new ParseProperties(
				"G:\\eclipse-Luna\\workspace\\SeleniumPractice\\src\\test\\resources\\Files\\PrarmeterFile.properties");
		System.out.println(a.getValue("Keyword"));
	}
	*/
}