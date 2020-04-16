/*
* Copyright 2002-2016 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.sanil.animalgame.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Reads property from property files
 * 
 * @author Sanil kumar P
 */
public class PropertyReaderSKP {

	/**
	 * static final field to point to the property file
	 */
	public static final String PROPERY_FILE_SKP = "src/resources/config.properties";

	/**
	 * properties object, which helps getting property
	 */
	private Properties propertiesSKP;

	/**
	 * Constructor for class PropertyReaderSKP
	 */
	public PropertyReaderSKP() {

		super();
		// System.out.println(System.getProperty("user.dir"));

		propertiesSKP = new Properties();

		try {

			if (new File(PROPERY_FILE_SKP).exists()) {
				propertiesSKP.load(new FileInputStream(PROPERY_FILE_SKP));
			} else {
				propertiesSKP.load(new FileInputStream("../" + PROPERY_FILE_SKP));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param keySKP property key
	 * @return property
	 */
	public String getPropertyValue(String keySKP) {

		return propertiesSKP.getProperty(keySKP);
	}

}
