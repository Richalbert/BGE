package com.phdareys.excp.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.phdareys.excp.exception.EmployeeException;
import com.phdareys.excp.exception.ExceptionType;

public class ManageProperties {
	private String propFName;
	private static Properties properties;
	private static boolean propertiesLoaded = false;

	public ManageProperties(String propFName) throws EmployeeException {
		super();
		this.propFName = propFName;
		if (!propertiesLoaded)
			loadProperties(this.propFName);
	}
	
	public static String getPropValue(String key) throws EmployeeException {
		String val = properties.getProperty(key);
		if (val == null)
			throw new EmployeeException(ExceptionType.ERROR, "Can't load property: " + key);			
		return val;
	}
	private static Properties loadProperties(String fName) throws EmployeeException {
		properties = new Properties();
		FileInputStream input=null;
		try {
			input = new FileInputStream(fName);
			try {
				properties.load(input);
				input.close();
			} catch (IOException e) {
				throw new EmployeeException(ExceptionType.FATAL, "Can't load Properties");
			}
		} catch (FileNotFoundException e) {
			throw new EmployeeException(ExceptionType.FATAL, "Can't load Properties");
		}
		return properties;
	}
}
