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

import java.util.Iterator;
import java.util.Scanner;

import com.sanil.animalgame.animals.AnimalSKP;
import com.sanil.animalgame.command.ConsoleRemoteSKP;
import com.sanil.animalgame.composite.ForestComponentSKP;
import com.sanil.animalgame.composite.ForestSKP;
import com.sanil.animalgame.iterator.CompositeIteratorSKP;

/**
 * Animal game abstract class. Only one instance of its children will be
 * available across the entire application since singleton pattern is provided.
 * The entire game logic is present in this class in different steps. Each sub
 * classes will define the changing steps. Template method design pattern is
 * followed here The class also implements factory methods
 * 
 * @author Sanil kumar P
 */
public abstract class AnimalGameSKP {

	/**
	 * name of the game
	 */
	protected String nameSKP;

	/**
	 * Hero character
	 */
	protected AnimalSKP heroCharacter;

	/**
	 * Villain character
	 */
	protected AnimalSKP villainCharacter;

	/**
	 * Friend character
	 */
	protected AnimalSKP friendCharacter;

	/**
	 * Instance of itself
	 */
	protected static AnimalGameSKP gameInstanceSKP;

	/**
	 * Constructor for class AnimalGameSKP
	 * 
	 * @param nameSKP
	 */
	public AnimalGameSKP(String nameSKP) {
		super();
		this.nameSKP = nameSKP;
	}

	/**
	 * The enitire game logic is controlled by this method
	 */
	public void startSKP() {
		showTheWelcomeScreenSKP();
		showCharacterDescription();
		showGameDetailsSKP();
		placeAnimalsInCavesSKP();
		playGame();
	}

	/**
	 * Here we actually play the game by traveling through the composite and showing
	 * each forest component
	 */
	private void playGame() {

		ForestComponentSKP forest = ForestSKP.getForestInstance();
		Iterator<ForestComponentSKP> forestIterator = forest.createIteratorSKP();
		Iterator<ForestComponentSKP> iterator = new CompositeIteratorSKP(forestIterator);

		while (iterator.hasNext()) {
			iterator.next().showDetailsSKP();
		}

	}

	/**
	 * The method shows how to play the game
	 */
	private void showGameDetailsSKP() {

		System.out.println("\n\n\n\n\t____________How to play________________\n");

		System.out.println(
				"\n\tThe characters in this game will be randomely placed in different caves. The goal is to predict "
						+ "\n\teach animals in each cave in each visit. If you predict the hero character correctly, the score "
						+ "\n\twill be increased to three times of the current score. It will be increasesd 2 times and 1 "
						+ "\n\ttimes for friend and villain characters respectively\n\n\n");

		Scanner scannerSKP = new Scanner(System.in);
		ConsoleRemoteSKP remote = ConsoleRemoteSKP.getConsoleRemoteInstance();

		System.out.println("\tPress any key to start the game: ");
		scannerSKP.next();
		remote.clearScreen();
		scannerSKP.close();
	}

	/**
	 * Place animals randomly in different caves
	 */
	public abstract void placeAnimalsInCavesSKP();

	/**
	 * Shows the welcome screen
	 */
	protected final void showTheWelcomeScreenSKP() {

		ConsoleRemoteSKP remoteSKP = ConsoleRemoteSKP.getConsoleRemoteInstance();
		remoteSKP.clearScreen();

		System.out.print("\n\n\n\n\n\n\n\t" + toString() + "\t\t");
		System.out.println("powered by animal game\n\n\n\t\t\t");
		System.out.print("\t\t\t𝐿𝑜𝑎𝑑𝑖𝑛𝑔 ");

		String loadingSKP = "＃＃";

		for (int i = 0; i < 3; i++) {
			System.out.print((loadingSKP += loadingSKP));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		remoteSKP.clearScreen();
	}

	/**
	 * Shows character names and their nature of behaving
	 */
	protected final void showCharacterDescription() {
		// TODO Auto-generated method stub
		ConsoleRemoteSKP.getConsoleRemoteInstance().clearScreen();
		System.out.println("\n\n\n\n\t____________Characters and story summary_________________\n");
		this.heroCharacter = createHeroCharacter();
		this.villainCharacter = createVillainCharacter();
		this.friendCharacter = createFriendCharacter();
		heroCharacter.showBehaviour();
		friendCharacter.showBehaviour();
		villainCharacter.showBehaviour();

	}

	/**
	 * factory method to create friend character
	 * 
	 * @return Friend character
	 */
	protected abstract AnimalSKP createFriendCharacter();

	/**
	 * Factory method to create villain character
	 * 
	 * @return Villain character
	 */
	protected abstract AnimalSKP createVillainCharacter();

	/**
	 * Factory method to create Hero character
	 * 
	 * @return Hero character
	 */
	protected abstract AnimalSKP createHeroCharacter();

	@Override
	public String toString() {
		return nameSKP;
	}

}
