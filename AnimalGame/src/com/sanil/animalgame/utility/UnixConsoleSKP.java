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
package com.sanil.animalgame.utility;

/**
 * Unix implementation for console to clear screen in unix based systems
 * @author Sanil kumar P
 */
public class UnixConsoleSKP implements TargetConsoleSKP {

	
	/**
	 * A method to clear unix based console
	 */
	@Override
	public void clearScreenSKP() {
		System.out.print("\033[H\033[2J"); System.out.flush();		
	}

}
