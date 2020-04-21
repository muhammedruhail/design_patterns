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

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import com.sanil.animalgame.composite.ForestComponentSKP;

/**
 * This is the iterator for {@link ForestComponentSKP}. The responsibility of
 * iteration is separated from {@link ForestComponentSKP}. Only a single reason
 * to change a class. We are implementing iterator pattern
 * 
 * @author Sanil kumar P
 */
public class CompositeIteratorSKP implements Iterator<ForestComponentSKP> {

	/**
	 * Stack to keep iterators in their order of visit
	 */
	private Deque<Iterator<ForestComponentSKP>> stack = new ArrayDeque<Iterator<ForestComponentSKP>>();

	/**
	 * Parameterized constructor for class CompositeIteratorSKP
	 */
	public CompositeIteratorSKP(Iterator<ForestComponentSKP> iterator) {
		super();

		stack.push(iterator);
	}

	/**
	 * Implementation of hasNext from {@link Iterator}.
	 * 
	 * @return true if next element is present, false otherwise
	 */
	@Override
	public boolean hasNext() {

		if (!stack.isEmpty()) {
			Iterator<ForestComponentSKP> iterator = stack.peekFirst();

			if (iterator.hasNext()) {
				return iterator.hasNext();
			} else {
				stack.removeFirst();
				return hasNext();
			}
		} else {
			return false;
		}
	}

	/**
	 * Returns next element in the composite
	 * 
	 * @return {@link ForestComponentSKP} in the aggregate
	 */
	@Override
	public ForestComponentSKP next() {

		if (hasNext()) {

			ForestComponentSKP forestComponent = stack.peekFirst().next();

			stack.push(forestComponent.createIteratorSKP());

			return forestComponent;

		} else {
			return null;
		}
	}

}
