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

import com.sanil.animalgame.composite.BagheeraCaveSKP;
import com.sanil.animalgame.composite.BaluCaveSKP;
import com.sanil.animalgame.composite.CaveSKP;
import com.sanil.animalgame.composite.MowgliCaveSKP;
import com.sanil.animalgame.composite.SherekhanCaveSKP;

/**
 * A cave factory jungle book game. Implemented with prototype design pattern.
 * 
 * @author Sanil kumar P
 */
public class JungleBookCaveFactorySKP {

	/**
	 * Static field to store cave prototypes with their name as their key.
	 */
	public static final Map<String, CaveSKP> cavePrototypes = new HashMap<String, CaveSKP>();

	static {

		MowgliCaveSKP mowgliCaveSKP = new MowgliCaveSKP();
		BaluCaveSKP baluCaveSKP = new BaluCaveSKP();
		BagheeraCaveSKP bagheeraCaveSKP = new BagheeraCaveSKP();
		SherekhanCaveSKP sherekhanCaveSKP = new SherekhanCaveSKP();

		cavePrototypes.put(mowgliCaveSKP.getName(), mowgliCaveSKP);
		cavePrototypes.put(baluCaveSKP.getName(), baluCaveSKP);
		cavePrototypes.put(bagheeraCaveSKP.getName(), bagheeraCaveSKP);
		cavePrototypes.put(sherekhanCaveSKP.getName(), sherekhanCaveSKP);
	}

	/**
	 * @param key key is the name of the cave to get the cloned cave from the
	 *            prototype registry
	 * @return A cave prototype
	 */
	public static CaveSKP getPrototype(String key) {
		return (cavePrototypes.get(key) != null) ? cavePrototypes.get(key).cloneSKP()
				: cavePrototypes.get("Mowgli's cave").cloneSKP();
	}
}
