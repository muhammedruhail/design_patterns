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

/**
 * Abstract factory class to create animals(characters for the game). The concrete subclasses decide 
 * what object should be created. Implementing abstract factory pattern. Abstract factory internally 
 * implements factory method to create objects.
 * @author Sanil kumar P
 */
public abstract class AnimalCharacterAbstractFactorySKP {

	/**
	 * Abstract factory method to create heroic character
	 * @return Animal
	 */
	public abstract AnimalSKP createHeroCharacter();
	
	/**
	 * Abstract factory method to create friend character
	 * @return Animal
	 */
	public abstract AnimalSKP createFriendCharacter();
	
	
	/**
	 * Abstract factory method to create friend character
	 * @return Animal
	 */
	public abstract AnimalSKP createVillainCharacter();
	
}
