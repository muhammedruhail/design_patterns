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
package com.sanil.animalgame.animals;

import com.sanil.animalgame.strategy.BehaviourStrategySKP;

/**
 * Animal super class. Strategy pattern implemented
 * 
 * @author Sanil kumar P
 */
/**
 * TODO Provide a detailed description here
 * 
 * @author Sanil kumar P
 */
public abstract class AnimalSKP {

	/**
	 * name of animal
	 */
	protected String nameSKP;

	/**
	 * @return name
	 */
	public String getName() {
		return nameSKP;
	}

	/**
	 * setter
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.nameSKP = name;
	}

	/**
	 * Behaviour of animal. Strategy pattern applied
	 */
	protected BehaviourStrategySKP behaviourSKP;

	/**
	 * getter for behaviour
	 * 
	 * @return behaviour
	 */
	public BehaviourStrategySKP getBehaviour() {
		return behaviourSKP;
	}

	public void setBehaviour(BehaviourStrategySKP behaviour) {
		this.behaviourSKP = behaviour;
	}

	/**
	 * Constructor for class AnimalSKP
	 */
	public AnimalSKP() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor for class AnimalSKP
	 * 
	 * @param name
	 */
	public AnimalSKP(String name) {
		super();
		this.nameSKP = name;
	}

	/**
	 * Showing animal behaviour
	 */
	public void showBehaviour() {
		System.out.println("\n\t\t" + nameSKP + ": " + nameSKP + "" + this.behaviourSKP.showBehaviourSKP());
	}

	/**
	 * toString method which returns the name of the animal
	 */
	@Override
	public String toString() {
		return nameSKP;
	}

}
