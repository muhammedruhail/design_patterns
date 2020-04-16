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
package com.sanil.animalgame.command;

import com.sanil.animalgame.utility.WindowsConsoleSKP;

/**
 * Special command to do operation in windows console
 * 
 * @author Sanil kumar P
 */
public class WindowsConsoleCommandSKP implements CommandSKP {

	/**
	 * Target console to execute the command
	 */
	private WindowsConsoleSKP console;

	/**
	 * Constructor for class WindowsConsoleCommandSKP
	 * 
	 * @param windowsConsoleSKP
	 */
	public WindowsConsoleCommandSKP(WindowsConsoleSKP windowsConsoleSKP) {
		// TODO Auto-generated constructor stub
		console = windowsConsoleSKP;
	}

	/**
	 * Implementation of execute method
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		console.clearScreenSKP();
	}

	/**
	 * getter for console
	 * 
	 * @return windows console
	 */
	public WindowsConsoleSKP getConsole() {
		return console;
	}

	/**
	 * setter for console
	 * 
	 * @param console to for the command
	 */
	public void setConsole(WindowsConsoleSKP console) {
		this.console = console;
	}

}
