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

import java.util.Random;
import java.util.logging.Logger;

import com.sanil.animalgame.animals.AnimalSKP;
import com.sanil.animalgame.composite.BagheeraCaveSKP;
import com.sanil.animalgame.composite.BaluCaveSKP;
import com.sanil.animalgame.composite.ForestComponentSKP;
import com.sanil.animalgame.composite.ForestSKP;
import com.sanil.animalgame.composite.MowgliCaveSKP;
import com.sanil.animalgame.composite.SherekhanCaveSKP;
import com.sanil.animalgame.decorator.HeroAnimalDecoratorSKP;
import com.sanil.animalgame.factory.AnimalCharacterAbstractFactorySKP;
import com.sanil.animalgame.factory.IOTBasedAnimalJBFactorySKP;
import com.sanil.animalgame.factory.MobileBasedAnimalJBFactorySKP;
import com.sanil.animalgame.factory.WebBasedAnimalJBFactorySKP;
import com.sanil.animalgame.strategy.BehaviourStrategySKP;
import com.sanil.animalgame.strategy.FeralHumanChildSKP;
import com.sanil.animalgame.strategy.GoodBlackPantherSKP;
import com.sanil.animalgame.strategy.GreedySlothBearSKP;
import com.sanil.animalgame.strategy.WickedTigerSKP;
import com.sanil.animalgame.utility.PropertyReaderSKP;

/**
 * One of the implementation of {@code AnimalGame}. It contains factory methods
 * and implemented steps as part of template method design pattern. createHero
 * method uses decorator pattern
 * 
 * @author Sanil kumar P
 */
public class JungleBookGameSKP extends AnimalGameSKP {

	/**
	 * Logger instance to log details
	 */
	private static Logger logger = Logger.getLogger("Animal Game");

	/**
	 * Private constructor for class JungleBookGameSKP to prevent creation of more
	 * than one instance.
	 */
	private JungleBookGameSKP() {
		super("\n" + "──╔╗────────╔╗────╔══╗──────╔╗──╔═══╗\n" + "──║║────────║║────║╔╗║──────║║──║╔═╗║\n"
				+ "──║╠╗╔╦═╗╔══╣║╔══╗║╚╝╚╦══╦══╣║╔╗║║─╚╬══╦╗╔╦══╗\n"
				+ "╔╗║║║║║╔╗╣╔╗║║║║═╣║╔═╗║╔╗║╔╗║╚╝╝║║╔═╣╔╗║╚╝║║═╣\n"
				+ "║╚╝║╚╝║║║║╚╝║╚╣║═╣║╚═╝║╚╝║╚╝║╔╗╗║╚╩═║╔╗║║║║║═╣\n"
				+ "╚══╩══╩╝╚╩═╗╠═╩══╝╚═══╩══╩══╩╝╚╝╚═══╩╝╚╩╩╩╩══╝\n" + "─────────╔═╝║\n" + "─────────╚══╝");

	}

	/**
	 * Static method to get the object of this singleton class
	 * 
	 * @return An animal game instance
	 */
	public static AnimalGameSKP getGameInstanceSKP() {

		return (gameInstanceSKP != null) ? gameInstanceSKP : (gameInstanceSKP = new JungleBookGameSKP());
	}

	/**
	 * Implementation of factory method to get the friend character
	 */
	@Override
	protected AnimalSKP createFriendCharacter() {

		AnimalSKP animal = getAppropriateFactory().createFriendCharacter();

		BehaviourStrategySKP behaviour = (animal.getName().equals("bagheera")) ? new GoodBlackPantherSKP()
				: new GreedySlothBearSKP();
		animal.setBehaviour(behaviour);
		return animal;
	}

	/**
	 * Implementation of factory method to get the villain character
	 */
	@Override
	protected AnimalSKP createVillainCharacter() {

		AnimalSKP animal = getAppropriateFactory().createVillainCharacter();
		animal.setBehaviour(new WickedTigerSKP());
		return animal;
	}

	/**
	 * Implementation of factory method to get the hero character
	 */
	@Override
	protected AnimalSKP createHeroCharacter() {

		AnimalSKP animal = getAppropriateFactory().createHeroCharacter();

		// decorator pattern applied
		animal.setBehaviour(new HeroAnimalDecoratorSKP(new FeralHumanChildSKP()));

		return animal;
	}

	/**
	 * Private method to decide appropriate factory for the
	 * {@link JungleBookGameSKP}
	 * 
	 * @return {@link AnimalCharacterAbstractFactorySKP} for creating appropriate
	 *         characters
	 */
	private AnimalCharacterAbstractFactorySKP getAppropriateFactory() {

		String animalTypeSKP = new PropertyReaderSKP().getPropertyValue("animals.type");
		if (animalTypeSKP.equals("iot")) {
			return new IOTBasedAnimalJBFactorySKP();
		} else if (animalTypeSKP.equals("web")) {
			return new WebBasedAnimalJBFactorySKP();
		} else
			return new MobileBasedAnimalJBFactorySKP();
	}

	/**
	 * LLogic for Placing animals randomly in the caves.
	 */
	@Override
	public void placeAnimalsInCavesSKP() {

		// singleton instance of forest
		ForestSKP forestSKP = ForestSKP.getForestInstance();

		// collection of caves
		ForestComponentSKP[] cavesSKP = new ForestComponentSKP[] { new MowgliCaveSKP("Mowgli's cave"),
				new BaluCaveSKP("Balu's cave"), new BagheeraCaveSKP("Bagheera's cave"),
				new SherekhanCaveSKP("Shere khan's cave") };

		// array of characters
		ForestComponentSKP[] forestCharactersSKP = new ForestComponentSKP[] { heroCharacter, friendCharacter,
				villainCharacter };

		// loop for randomly placing animals in the caves
		for (ForestComponentSKP characterSKP : forestCharactersSKP) {

			int randomValueSKP = new Random().nextInt(cavesSKP.length);
			logger.fine("random number: :" + randomValueSKP);
			cavesSKP[randomValueSKP].addChildSKP(characterSKP);

		}

		forestSKP.setCavesSKP(cavesSKP);

	}

}
