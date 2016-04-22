import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.*;




public class SubVowel {

	public static String ReturnInputString(String word){

	
		return word;


	}
 
	public static String[] ReturnSplitWord(String word){

  		String[] splitInput = word.split("");

		System.out.println(splitInput.toString());
		return splitInput;


  }

  public static String ReturnVowelSub(String word){
  		String [] vowels = {"a", "e", "i", "o", "u"};

  		for (String v : vowels)
  			word = word.replace(v, "-");

		System.out.println(word);
		return word;

  }

  public static String ReturnHint(String word){
  	String [] vowels = {"a", "e", "i", "o", "u"};
  	String[] splitInput = word.split(" ");
  	String firstWord = splitInput[0];
  	ArrayList<String> newWordArray = new ArrayList<String>();
  	String newStr = "";

  	for( String s : splitInput){
  		newWordArray.add(s);
  	}

  	newWordArray.remove(0);

  	for (String s : newWordArray){
    	newStr += (" " + s);
	}

	for (String v : vowels)
  		newStr = newStr.replace(v, "-");


	String hintReturn = firstWord + " " + newStr;



  	System.out.println(hintReturn);
  	return hintReturn;
  }
}
