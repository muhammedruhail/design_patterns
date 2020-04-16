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
package com.sanil.animalgame;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sanil.animalgame.command.ConsoleRemote;
import com.sanil.animalgame.command.UnixConsoleCommandSKP;
import com.sanil.animalgame.command.WindowsConsoleCommandSKP;
import com.sanil.animalgame.game.AnimalGameSKP;
import com.sanil.animalgame.game.JungleBookGameSKP;
import com.sanil.animalgame.game.SoothranNSheruGameSKP;
import com.sanil.animalgame.utility.PropertyReaderSKP;
import com.sanil.animalgame.utility.UnixConsoleSKP;
import com.sanil.animalgame.utility.WindowsConsoleSKP;

/**
 * This is a sample animal game project to demonstrate gang of four design
 * patterns. The aim is to factor at least 10 patterns together in this game.
 * The included patterns are singleton, builder, factory method, abstract
 * factory, command, template method(is going on) ..
 * 
 * @author Sanil kumar P
 */
public class TestClientSKP {

	private static Logger logger = Logger.getLogger("Animal Game");

	/**
	 * main method to start program execution
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// reference to store the singleton game object
		AnimalGameSKP game = null;

		// set platform based configuration to implement same operation in different
		// consoles
		new TestClientSKP().setUpPlatformBasedConsoleSKP();

		// setup logging level
		new TestClientSKP().setupLoggingLevelSKP();

		// displaying user to enter the inputs and play the game
		System.out.println("\n\n\n\n\n\n\n\tＷｅｌｃｏｍｅ ｔｏ Ａｎｉｍａｌ ｇａｍｅ" + "\n\t\t\t\tcopyright@2020\n");

		System.out.println("\n\n\t________Ａｖａｉｌａｂｌｅ ｇａｍｅｓ__________\n");

		System.out.println("\n\n\t\t1. Jungle book");
		System.out.println("\n\t\t2. Soothranum Sheruvum\n\n");

		System.out.print("\nSelect your choice : ");
		String option = scanner.next();

		ConsoleRemote remote = ConsoleRemote.getConsoleRemoteInstance();

		// remote.clearScreen();

		logger.fine("remote: " + remote + ", console command: " + remote.getCommand());

		int nextAskingCountSKP = 2;

		// asking user to select his option after a failed attempt
		while (nextAskingCountSKP > 0) {

			if (option.equals("1")) {
				game = JungleBookGameSKP.getGameInstanceSKP();
				nextAskingCountSKP -= nextAskingCountSKP;
				game.start();
			}

			else if (option.equals("2")) {
				game = SoothranNSheruGameSKP.getGameInstanceSKP();
				nextAskingCountSKP -= nextAskingCountSKP;
				game.start();
			}

			else {
				System.out.print("\nInvalid option. Select again : ");
				option = scanner.next();
				nextAskingCountSKP--;
			}

		}

		System.out.println("exiting.. ");
		scanner.close();
		System.exit(0);
	}

	/**
	 * Setup logging level based on the level configured in the property file
	 */
	private void setupLoggingLevelSKP() {
		PropertyReaderSKP reader = new PropertyReaderSKP();
		Level loggingLevelSKP = null;
		String returnedPropertySKP = reader.getPropertyValue("logging.level");
		if (returnedPropertySKP != null) {
			loggingLevelSKP = Level.parse(returnedPropertySKP);
		} else {
			loggingLevelSKP = Level.INFO;
		}

		logger.setLevel(loggingLevelSKP);
		logger.fine(reader.getPropertyValue("logging.level"));
	}

	/**
	 * Implementing command pattern. Setting command in console remote based on the
	 * platform
	 */
	public void setUpPlatformBasedConsoleSKP() {

		String os = System.getProperty("os.name");
		ConsoleRemote remote = ConsoleRemote.getConsoleRemoteInstance();

		if (os.equalsIgnoreCase("Linux")) {
			remote.setCommand(new UnixConsoleCommandSKP(new UnixConsoleSKP()));
			logger.fine(os);
		}

		else if (os.equalsIgnoreCase("Windows")) {
			remote.setCommand(new WindowsConsoleCommandSKP(new WindowsConsoleSKP()));
		}

		else {
			System.out.println("Sorry..your console is currently not supported");
			System.exit(0);
		}

		logger.fine("remote: " + remote + ", console command: " + remote.getCommand());

	}
}
