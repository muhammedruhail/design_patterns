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
package com.sanil.animalgame.composite;

/**
 * One implementation of cave. object will be created using a prototype patterns
 * as this objects are treated as expensive objects(assumption)
 * 
 * @author Sanil kumar P
 */
public class SoothranCaveSKP extends CaveSKP {

	/**
	 * Constructor for class SoothranCaveSKP
	 * 
	 * @param string
	 */
	public SoothranCaveSKP(String nameSKP) {

		super(nameSKP);
	}

	/**
	 * Clone {@link SoothranCaveSKP}
	 */
	@Override
	public CaveSKP cloneSKP() {

		return new SoothranCaveSKP(nameSKP);
	}

}
