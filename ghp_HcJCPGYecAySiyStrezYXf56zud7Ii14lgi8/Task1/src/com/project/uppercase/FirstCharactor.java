package com.project.uppercase;

public class FirstCharactor {
	
	public static void main(String[] args) {
		
		
			String input = "welcome to pune"; // giving input
			String converted = Letter(input);
			System.out.println("Converted string: " + converted);
		}

		public static String Letter(String str) {
			if (str.isEmpty()) {
				return str; // Return empty string
			}

			char firstChar = str.charAt(0);
			char cChar;

			// case of the first character
			if (Character.isLowerCase(firstChar)) {
				cChar = Character.toUpperCase(firstChar);
			} else {
				cChar = Character.toLowerCase(firstChar);
			}

			// Return the modified string
			return cChar + str.substring(1);
		}
	}