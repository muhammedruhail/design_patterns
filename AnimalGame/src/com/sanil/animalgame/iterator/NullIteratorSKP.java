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
package com.sanil.animalgame.iterator;

import java.util.Iterator;

import com.sanil.animalgame.composite.ForestComponentSKP;

/**
 * This iterator is for leaf {@link ForestComponentSKP} elements having no sub
 * components.
 * 
 * @author Sanil kumar P
 */
public class NullIteratorSKP implements Iterator<ForestComponentSKP> {

	/**
	 * Constructor for class CompositeIteratorSKP
	 */
	public NullIteratorSKP() {
		super();

	}

	/**
	 * Implementation of hasNext from {@link Iterator}.
	 * 
	 * @return false in all conditions
	 */
	@Override
	public boolean hasNext() {
		return false;
	}

	/**
	 * Returns next element in the composite
	 * 
	 * @return {@link ForestComponentSKP} in the aggregate. This method returns
	 *         <code>null</code>
	 * 
	 */
	@Override
	public ForestComponentSKP next() {
		return null;
	}

}
