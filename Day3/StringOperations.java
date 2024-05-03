package day3;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		String str = "malayalam";
		String str1 = "care";
		String str2 = "race";
		String str3 = "Hello world";
		System.out.println(isPalindrome(str));
		System.out.println(reverse(str));
		countEachCharacter(str);
		System.out.println(isAnagram(str1, str2));
		System.out.println(isPanagram(str));
		System.out.println(countWords(str3));
		System.out.println(isAllVowelsPresent(str));
		System.out.println(countVowels(str));

	}

	public static boolean isPalindrome(String str) {
		String revString = reverse(str);
		return str.equals(revString);
	}

	public static String reverse(String str) {
		char[] ch = str.toCharArray();
		String str1 = "";
		for (int i = 0; i < ch.length; i++) {
			str1 = ch[i] + str1;
		}
		return str1;
	}

	public static void countEachCharacter(String str) {
		int[] charCount = new int[128];
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			charCount[c]++;
		}

		System.out.println("Count of each character is:");
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) i + " : " + charCount[i]);
			}
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int len1 = ch1.length;
		int len2 = ch2.length;
		if (len1 != len2) {
			return false;
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < len1; i++) {
			if (ch1[i] != ch2[i])
				return false;

		}
		return true;
	}

	public static boolean isPanagram(String str) {
		int[] freq = new int[26];
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 65]++;
		}
		for (int element : freq) {
			if (element == 0) {
				return false;
			}

		}
		return true;
	}

	public static int countWords(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				count++;
		}
		return count;
	}

	public static boolean isAllVowelsPresent(String str) {
		String str1 = str.toLowerCase();
		boolean flag = true;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != 'a' && str1.charAt(i) != 'e' && str1.charAt(i) != 'i' && str1.charAt(i) != 'o'
					&& str1.charAt(i) != 'u')
				flag = false;
		}
		return flag;

	}

	public static int countVowels(String str) {
		String str1 = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				count++;
		}
		return count;
	}
}
