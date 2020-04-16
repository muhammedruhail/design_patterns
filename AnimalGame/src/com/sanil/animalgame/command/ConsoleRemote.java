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

/**
 * A remote class for operating console level processes. Part of Command Pattern
 *  and Singleton
 * @author Sanil kumar P
 */
public class ConsoleRemote {

	
	/**
	 * Self referencing object for implementing singleton pattern
	 */
	private static ConsoleRemote remote;
	
	/**
	 * Command for this remote class to execute.
	 */
	private CommandSKP command;
	

	/**
	 * Constructor for class ConsoleRemote
	 * @param command
	 */
	private ConsoleRemote() {
		super();
		
	}

	/**
	 * getter for command
	 * @return command
	 */
	public CommandSKP getCommand() {
		return command;
	}

	/**
	 * setter for command
	 * @param command
	 */
	public void setCommand(CommandSKP command) {
		this.command = command;
	}
	
	/**
	 * Method to trigger command execute to clear screen
	 */
	public void clearScreen() {
		command.execute();
	}
	
	/**
	 * Getting the only single object of this class
	 * @return {@link ConsoleRemote}
	 */
	public static ConsoleRemote getConsoleRemoteInstance() {
		
		remote = (remote == null)? new ConsoleRemote(): remote ;
		return remote;
	}
}
