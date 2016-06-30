package util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import util.LowLevelLogs;

public class ReadProperties {

	/**
	 * This function will return the value for the provided property key
	 * 
	 * @param propertyKey
	 *            the key value from Testing.properties file
	 * @return String containing the path mentioned in testing.properties for
	 *         specific property key
	 */
	public static String readProperty(String propertyKey) {

		Properties prop = new Properties();
		File dir1 = new File(".");
		String strBasePath = null;
		String val = null;
		try {
			// read the data from the properties file
			strBasePath = dir1.getCanonicalPath();
			prop.load(new FileInputStream(strBasePath + File.separator + "src"
					+ File.separator + "Testing.properties"));
			val = prop.getProperty(propertyKey);
		} catch (FileNotFoundException e) {
			LowLevelLogs.getLogger().error(
					"FileNotFoundException in readProperty: " + e.getMessage(),
					e);
		} catch (IOException e) {
			LowLevelLogs.getLogger().error(
					"IOException in readProperty: " + e.getMessage(), e);
		}
		return val;
	}
}