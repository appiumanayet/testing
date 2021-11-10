package myproject.stepDefs;

import cucumber.api.java.en.Given;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSizeStepDefinitions {	
	
	@Given("^User provides a file with \"([^\"]*)\" word \"([^\"]*)\"$")
	public void user_provides_a_file_with_word(String word, String filePath) throws FileNotFoundException {

	    System.out.println("Longest word found = " + longestWord(filePath));
		System.out.println("Transposed word found = " + transPoseWord(longestWord(filePath)));

	}

	//This function will return the longest word on a given file
	public String longestWord(String filePath) throws FileNotFoundException {
		String longestWord = "";
		String current;
		Scanner scan = new Scanner(new File(filePath));
		while (scan.hasNext()) {
			current = scan.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;
			}
		}

		return longestWord;
	}

	//This function will return the longest word on a given file
	public String transPoseWord(String longestWord) throws FileNotFoundException {
		String nstr="";
		char ch;
		for (int i=0; i<longestWord.length(); i++)
		{
			ch= longestWord.charAt(i); //extracts each character
			nstr= ch+nstr; //adds each character in front of the existing string
		}

		return nstr;
	}
	
}
