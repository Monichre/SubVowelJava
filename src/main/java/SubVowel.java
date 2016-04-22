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

}
