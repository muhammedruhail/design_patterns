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
 * TODO Provide a detailed description here
 * 
 * @author Sanil kumar P
 */
public class SoothranNSheruGameSKP extends AnimalGameSKP {

	private SoothranNSheruGameSKP() {
		super("Soothran N Sheru");
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

	@Override
	protected AnimalSKP createFriendCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AnimalSKP createVillainCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AnimalSKP createHeroCharacter() {
		// TODO Auto-generated method stub
		return null;
	}

}
