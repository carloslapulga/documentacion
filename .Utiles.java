package com.carlospuig.practica;

import java.util.Scanner;

public class Utiles {

	/**
	 * This function prints <code>prompt</code> to stdout and receives a number from stdin
	 * It will keep asking until it receives a properly formatted number.
	 * @param prompt Message to output to stdout before reading a number.
	 * @param scanner The {@link java.util.Scanner} to use to read from stdin
	 * @return The number received from stdin
	 */
	public static int askInt(String prompt, Scanner scanner) {
		while (true) {
			try {
				System.out.print(prompt);
				return Integer.valueOf(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Error de formato.");
			}
		}
	}
	
}
