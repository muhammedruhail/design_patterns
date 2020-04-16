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

import com.sanil.animalgame.command.ConsoleRemote;
import com.sanil.animalgame.command.UnixConsoleCommandSKP;
import com.sanil.animalgame.command.WindowsConsoleCommandSKP;
import com.sanil.animalgame.game.AnimalGameSKP;
import com.sanil.animalgame.game.JungleBookGameSKP;
import com.sanil.animalgame.game.SoothranNSheruGameSKP;
import com.sanil.animalgame.utility.UnixConsoleSKP;
import com.sanil.animalgame.utility.WindowsConsoleSKP;

/**
 * This is a sample animal game project to demonstrate gang of four design
 * patterns. The aim is to factor at least 10 patterns together in this game.
 * The included patterns are singleton, builder, factory method(is going on) ..
 * 
 * @author Sanil kumar P
 */
public class TestClientSKP {

	/**
	 * main method to start program execution
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// reference to store the singleton game object
		AnimalGameSKP game = null;

		new TestClientSKP().setUpPlatformBasedConsole();
		// displaying user to enter the inputs and play the game
		System.out.println("\n\n\n\n\n\n\n\tＷｅｌｃｏｍｅ ｔｏ Ａｎｉｍａｌ ｇａｍｅ" + "\n\t\t\t\tcopyright@2020\n");

		System.out.println("\n\n\t________Available games__________\n");

		System.out.println("\n\n\t\t1. Jungle book");
		System.out.println("\n\t\t2. Soothranum Sheruvum\n\n");

		System.out.print("\nSelect your choice : ");
		String option = scanner.next();
		
		ConsoleRemote remote = ConsoleRemote.getConsoleRemoteInstance();
	
		remote.clearScreen();
		
		//System.out.println("remote: " + remote + ", console command: " + remote.getCommand());
		
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

	public void setUpPlatformBasedConsole() {

		String os = System.getProperty("os.name");
		ConsoleRemote remote = ConsoleRemote.getConsoleRemoteInstance();

		if (os.equalsIgnoreCase("Linux")) {
			remote.setCommand(new UnixConsoleCommandSKP(new UnixConsoleSKP()));
			System.out.println(os);
		}

		else if (os.equalsIgnoreCase("Windows")) {
			remote.setCommand(new WindowsConsoleCommandSKP(new WindowsConsoleSKP()));
		}

		else {
			System.out.println("Sorry..your console is currently not supported");
			System.exit(0);
		}

		//System.out.println("remote: " + remote + ", console command: " + remote.getCommand());

	}
}
