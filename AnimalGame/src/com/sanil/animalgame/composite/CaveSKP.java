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
package com.sanil.animalgame.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class is a participant both in prototype and composite
 * 
 * @author Sanil kumar P
 */
public abstract class CaveSKP extends ForestComponentSKP {

	/**
	 * Name of the cave
	 */
	protected final String nameSKP;

	public String getNameSKP() {
		return nameSKP;
	}

	/**
	 * List to store caves and other animals
	 */
	List<ForestComponentSKP> innerForestComponentsSKP = new ArrayList<ForestComponentSKP>();

	public CaveSKP(String name) {
		super();
		this.nameSKP = name;
	}

	/**
	 * @return A cloned cave. A method used to clone objects in Prototype
	 *         pattern(assuming the creation of caves is expensive)
	 */
	public abstract CaveSKP cloneSKP();

	/**
	 * Returning iterator to iterate over the innerForestComponentsSKP list.
	 */
	@Override
	public Iterator<ForestComponentSKP> createIteratorSKP() {

		return innerForestComponentsSKP.iterator();
	}

	/**
	 * Overriding component method. Part of composite pattern
	 */
	@Override
	public void showDetailsSKP() {
		System.out.println("n\t________Now in " + nameSKP + "_________");
	}

}
