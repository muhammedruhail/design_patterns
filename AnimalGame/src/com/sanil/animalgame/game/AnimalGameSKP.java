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

	protected AnimalSKP heroCharacter;

	protected AnimalSKP villainCharacter;

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
	public void start() {
		showTheWelcomeScreen();
		showCharacterDescription();
		showGameDetails();
		placeAnimalsInCaves();
	}

	/**
	 * The method shows how to play the game
	 */
	private void showGameDetails() {
		// TODO Auto-generated method stub

	}

	/**
	 * Place animals randomly in different caves
	 */
	private void placeAnimalsInCaves() {
		// TODO Auto-generated method stub

	}

	/**
	 * Shows the welcome screen
	 */
	protected void showTheWelcomeScreen() {

	}

	/**
	 * Shows character names and their nature of behaving
	 */
	private void showCharacterDescription() {
		// TODO Auto-generated method stub
		this.heroCharacter = createHeroCharacter();
		this.villainCharacter = createVillainCharacter();
		this.friendCharacter = createFriendCharacter();

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

}
