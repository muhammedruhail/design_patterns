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
package com.sanil.animalgame.decorator;

import com.sanil.animalgame.strategy.BehaviourStrategySKP;

/**
 * Decorator to apply on animals
 * 
 * @author Sanil kumar P
 */
public class CunningAnimalDecoratorSKP extends AnimalDecoratorSKP {

	/**
	 * Field to wrap other behaviours to implement decorator pattern
	 */
	protected BehaviourStrategySKP behaviour;

	/**
	 * Constructor for class CunningAnimalDecoratorSKP
	 * 
	 * @param behaviour
	 */
	public CunningAnimalDecoratorSKP(BehaviourStrategySKP behaviour) {
		super();
		this.behaviour = behaviour;
	}

	/**
	 * Decorator to decorate an animal's cunning nature
	 */
	@Override
	public String showBehaviourSKP() {

		return behaviour.showBehaviourSKP() + " and he was always cunning in applying tricks to get his things done";
	}

}
