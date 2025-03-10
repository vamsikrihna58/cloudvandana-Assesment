
package com.cludvandana;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter inputs for checking the anagram");
		String s = sc.next();
		String s1 = sc.next();
		System.out.println(checking(s, s1));

	}

	public static boolean checking(String s, String s1) {
		char[] charArray = s.toCharArray();
		char[] charArray2 = s1.toCharArray();
		if (s.length() != s1.length())
			return false;

		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		for (int i = 0; i < charArray.length; i++)
			if (charArray[i] != charArray2[i])
				return false;

		return true;

	}

}
