package prework;

import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String string1 = "";
		String string2 = "";
		int sum1 = 0;
		int sum2 = 0;

		System.out.println("Please enter the first string.");
		string1 = scnr.nextLine();
		System.out.println("Please enter the second string.");
		string2 = scnr.nextLine();

		for (int i = 0; i < string1.length(); i++) {
			char fcharacter = string1.charAt(i);
			int fnumcode = (int) fcharacter;
			System.out.println(fcharacter + ":" + fnumcode);
			sum1 = sum1 + fnumcode;
		}

		for (int i = 0; i < string2.length(); i++) {
			char scharacter = string2.charAt(i);
			int snumcode = (int) scharacter;
			System.out.println(scharacter + ":" + snumcode);
			sum2 = sum2 + snumcode;
		}

		System.out.println("Difference (as absolute value): " + Math.abs(sum1 - sum2));
	}
}