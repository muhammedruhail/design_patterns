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

import java.util.Iterator;

/**
 * Forest component is the type used to treat forest, caves and animals in
 * similar manner(Composite pattern).
 * 
 * @author Sanil kumar P
 */
public abstract class ForestComponentSKP {

	/**
	 * Showing description of a component. To be implemented by the sub classes
	 * according to their needs
	 */
	public void showDetailsSKP() {

		throw new UnsupportedOperationException("The operation is not applicable for this component");
	}

	/**
	 * Add new sub component to the collection
	 */
	public void addChildSKP(ForestComponentSKP forestComponent) {

		throw new UnsupportedOperationException("The operation is not applicable for this component");
	}

	/**
	 * Remove a sub component from the collection
	 */
	public void removeChildSKP() {

		throw new UnsupportedOperationException("The operation is not applicable for this component");
	}

	/**
	 * A method to create the iterator for the iteration on the aggregate.
	 * 
	 * @return iterator for the iteration
	 */
	public abstract Iterator<ForestComponentSKP> createIteratorSKP();
}
