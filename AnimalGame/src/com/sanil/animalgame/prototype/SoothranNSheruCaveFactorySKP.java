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
package com.sanil.animalgame.prototype;

import java.util.HashMap;
import java.util.Map;

import com.sanil.animalgame.composite.CaveSKP;
import com.sanil.animalgame.composite.KadiyanCaveSKP;
import com.sanil.animalgame.composite.SheruCaveSKP;
import com.sanil.animalgame.composite.SoothranCaveSKP;

/**
 * A cave factory Soothran and Sheru game game. Implemented with prototype
 * design pattern.
 * 
 * @author Sanil kumar P
 */
public class SoothranNSheruCaveFactorySKP {

	/**
	 * Static field to store cave prototypes with their name as their key.
	 */
	public static final Map<String, CaveSKP> cavePrototypes = new HashMap<String, CaveSKP>();

	static {

		SoothranCaveSKP soothranCaveSKP = new SoothranCaveSKP("Soothran's cave");
		SheruCaveSKP sheruCaveSKP = new SheruCaveSKP("Sheru's cave");
		KadiyanCaveSKP kadiyanCaveSKP = new KadiyanCaveSKP("Kadiyan's cave");

		cavePrototypes.put(soothranCaveSKP.getNameSKP(), soothranCaveSKP);
		cavePrototypes.put(sheruCaveSKP.getNameSKP(), sheruCaveSKP);
		cavePrototypes.put(kadiyanCaveSKP.getNameSKP(), kadiyanCaveSKP);
	}

	/**
	 * @param key key is the name of the cave to get the cloned cave from the
	 *            prototype registry
	 * @return A cave prototype
	 */
	public static CaveSKP getPrototype(String key) {
		return (cavePrototypes.get(key) != null) ? cavePrototypes.get(key).cloneSKP()
				: cavePrototypes.get("Soothran's cave").cloneSKP();
	}
}
