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
package com.sanil.animalgame.game;

import com.sanil.animalgame.animals.AnimalSKP;
import com.sanil.animalgame.factory.AnimalCharacterAbstractFactorySKP;
import com.sanil.animalgame.factory.IOTBasedAnimalSRFactorySKP;
import com.sanil.animalgame.factory.MobileBasedAnimalSRFactorySKP;
import com.sanil.animalgame.factory.WebBasedAnimalSRFactorySKP;
import com.sanil.animalgame.strategy.AngryLionSKP;
import com.sanil.animalgame.strategy.CleverFoxSKP;
import com.sanil.animalgame.strategy.FoolishTigerSKP;
import com.sanil.animalgame.utility.PropertyReaderSKP;

/**
 * It contains factory methods and implemented steps as part of template method
 * design pattern
 * 
 * @author Sanil kumar P
 */
public class SoothranNSheruGameSKP extends AnimalGameSKP {

	private SoothranNSheruGameSKP() {
		super("\n" + "░█▀▀▀█ █▀▀█ █▀▀█ ▀▀█▀▀ █──█ █▀▀█ █▀▀█ █▀▀▄ 　 ░█▄─░█ 　 ░█▀▀▀█ █──█ █▀▀ █▀▀█ █──█ \n"
				+ "─▀▀▀▄▄ █──█ █──█ ──█── █▀▀█ █▄▄▀ █▄▄█ █──█ 　 ░█░█░█ 　 ─▀▀▀▄▄ █▀▀█ █▀▀ █▄▄▀ █──█ \n"
				+ "░█▄▄▄█ ▀▀▀▀ ▀▀▀▀ ──▀── ▀──▀ ▀─▀▀ ▀──▀ ▀──▀ 　 ░█──▀█ 　 ░█▄▄▄█ ▀──▀ ▀▀▀ ▀─▀▀ ─▀▀▀");
		// TODO Auto-generated constructor stub
	}

	/**
	 * Static method to get the object of this singleton class
	 * 
	 * @return An animal game instance
	 */
	public static AnimalGameSKP getGameInstanceSKP() {

		return (gameInstanceSKP != null) ? gameInstanceSKP : (gameInstanceSKP = new SoothranNSheruGameSKP());
	}

	/**
	 * Implementation of factory method to get the friend character
	 */
	@Override
	protected AnimalSKP createFriendCharacter() {

		AnimalSKP animal = getAppropriateFactory().createFriendCharacter();
		animal.setBehaviour(new FoolishTigerSKP());
		return animal;
	}

	/**
	 * Implementation of factory method to get the villain character
	 */
	@Override
	protected AnimalSKP createVillainCharacter() {

		AnimalSKP animal = getAppropriateFactory().createVillainCharacter();

		animal.setBehaviour(new AngryLionSKP());
		return animal;

	}

	/**
	 * Implementation of factory method to get the hero character
	 */
	@Override
	protected AnimalSKP createHeroCharacter() {

		AnimalSKP animal = getAppropriateFactory().createHeroCharacter();

		animal.setBehaviour(new CleverFoxSKP());
		return animal;
	}

	/**
	 * Private method to decide appropriate factory for the
	 * {@link SoothranNSheruGameSKP}
	 * 
	 * @return {@link AnimalCharacterAbstractFactorySKP} for creating appropriate
	 *         characters
	 */
	private AnimalCharacterAbstractFactorySKP getAppropriateFactory() {

		String animalTypeSKP = new PropertyReaderSKP().getPropertyValue("animals.type");
		if (animalTypeSKP.equals("iot")) {
			return new IOTBasedAnimalSRFactorySKP();
		} else if (animalTypeSKP.equals("web")) {
			return new WebBasedAnimalSRFactorySKP();
		} else
			return new MobileBasedAnimalSRFactorySKP();
	}

}
