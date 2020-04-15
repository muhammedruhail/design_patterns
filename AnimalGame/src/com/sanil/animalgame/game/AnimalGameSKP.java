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

/**
 * Animal game abstract class. Only one instance of its children will be available across
 * the entire application since singleton pattern is provided.
 * @author Sanil kumar P
 */
public abstract class AnimalGameSKP {
	
	/**
	 * name of the game
	 */
	protected String nameSKP;
	
	/**
	 * Instance of itself
	 */
	protected static AnimalGameSKP gameInstanceSKP;

	/**
	 * Constructor for class AnimalGameSKP
	 * @param nameSKP
	 */
	public AnimalGameSKP(String nameSKP) {
		super();
		this.nameSKP = nameSKP;
	}

	/**
	 * 
	 */
	public void start() {
		// TODO Auto-generated method stub
		
	}

}
