import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.*;


import org.junit.*;
import static org.junit.Assert.*;

public class SubVowelTest {

  @Test
  public void doesSubVowel_ReturnString() {

    SubVowel testInstanceOfSubVowel = new SubVowel();
    String testString = testInstanceOfSubVowel.ReturnInputString("example");

   assertEquals(true, testString instanceof String);

  }

  @Test
  public void doesSubVowel_ReturnsSameInputString() {

    SubVowel testInstanceOfSubVowel = new SubVowel();
    String appString = testInstanceOfSubVowel.ReturnInputString("example");
    String testString = "example";

   assertEquals(true, testString.equals(appString));

  }

  @Test
  public void doesSubVowel_ReturnsSplitWord() {

    SubVowel instanceOfSubVowel = new SubVowel();
    String[] vow = {"a", "b", "c"};
    String[] testArray = instanceOfSubVowel.ReturnSplitWord("abc");
    

   assertEquals(vow, testArray);

  }

  @Test
  public void doesSubVowel_ReturnsVowelsSubbed() {

    SubVowel instanceOfSubVowel = new SubVowel();
    String testString = "G--d m-rn-ng l-d--s -nd g-ntl-m-n";
    String testReturn = instanceOfSubVowel.ReturnVowelSub("Good morning ladies and gentlemen");
    

   assertEquals(testString, testReturn);

  }
}