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
package com.sanil.animalgame.factory;

import com.sanil.animalgame.animals.AnimalSKP;
import com.sanil.animalgame.animals.MobileBasedFoxSKP;
import com.sanil.animalgame.animals.MobileBasedLionSKP;
import com.sanil.animalgame.animals.MobileBasedTigerSKP;

/**
 * Concrete factory for IOT based platform to create animals for Soothran and Sheru
 * 
 * @author Sanil kumar P
 */
public class MobileBasedAnimalSRFactorySKP extends AnimalCharacterFactorySKP {

	/**
	 * Concrete factory method to create hero character
	 * 
	 * @return Animal
	 */
	@Override
	public AnimalSKP createHeroCharacter() {
		return new MobileBasedFoxSKP("Soothran");
	}

	/**
	 * Concrete factory method to create friend character
	 * 
	 * @return Animal
	 */
	@Override
	public AnimalSKP createFriendCharacter() {
		// TODO Auto-generated method stub
		return new MobileBasedTigerSKP("Sheru");
	}

	/**
	 * Concrete factory method to create villain character
	 * 
	 * @return Animal
	 */
	@Override
	public AnimalSKP createVillainCharacter() {
		// TODO Auto-generated method stub
		return new MobileBasedLionSKP("Kadiyan");
	}

}
