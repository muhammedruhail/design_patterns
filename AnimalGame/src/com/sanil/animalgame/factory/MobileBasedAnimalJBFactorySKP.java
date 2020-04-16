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
import com.sanil.animalgame.animals.MobileBasedBlackPantherSKP;
import com.sanil.animalgame.animals.MobileBasedHumanSKP;
import com.sanil.animalgame.animals.MobileBasedSlothBearSKP;
import com.sanil.animalgame.animals.MobileBasedTigerSKP;

/**
 * Concrete factory for mobile based platform to create animals for Jungle book game
 * 
 * @author Sanil kumar P
 */
public class MobileBasedAnimalJBFactorySKP extends AnimalCharacterAbstractFactorySKP {

	/**
	 * Concrete factory method to create hero character
	 * 
	 * @return Animal
	 */
	@Override
	public AnimalSKP createHeroCharacter() {
		return new MobileBasedHumanSKP("Mowgli");
	}

	/**
	 * Concrete factory method to create friend character
	 * 
	 * @return Animal
	 */
	@Override
	public AnimalSKP createFriendCharacter() {
		// TODO Auto-generated method stub
		return ((int) (Math.random() * 2) == 1) ? new MobileBasedBlackPantherSKP("Bagheera")
				: new MobileBasedSlothBearSKP("Baloo");
	}

	/**
	 * Concrete factory method to create villain character
	 * 
	 * @return Animal
	 */
	@Override
	public AnimalSKP createVillainCharacter() {
		// TODO Auto-generated method stub
		return new MobileBasedTigerSKP("Shere Khan");
	}

}
