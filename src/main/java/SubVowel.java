import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.*;




public class SubVowel {

	public static String returnInputString(String word){
		return word;
	}

  public static String returnVowelSub(String word){
    String [] vowels = {"a", "e", "i", "o", "u","A", "E", "I", "O", "U"};
    for (String v : vowels){
      word = word.replace(v, "-");
    }
    return word;
    }
 
  public static String returnHint(String word){
  	String[] vowels = {"a", "e", "i", "o", "u"};
  	String[] splitInput = word.split(" ");
  	String firstWord = splitInput[0];
  	ArrayList<String> newWordArray = new ArrayList<String>();
  	String newStr = "";

  	for (String s : splitInput){
  		newWordArray.add(s);
  	}
    newWordArray.remove(0);
  	for (String s : newWordArray){
    	newStr += (" " + s);
    }
  	for (String v : vowels){
    	newStr = newStr.replace(v, "-");
      }

    String hintReturn = firstWord + " " + newStr;
  	return hintReturn;
  }
}
