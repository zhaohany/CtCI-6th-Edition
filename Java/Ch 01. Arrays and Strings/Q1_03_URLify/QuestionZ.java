package Q1_03_URLify;

import CtCILibrary.AssortedMethods;

public class QuestionZ {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {

	}
	

	
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		replaceSpaces(arr, trueLength);	
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}
}
