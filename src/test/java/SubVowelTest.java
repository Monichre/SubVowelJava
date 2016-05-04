import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class SubVowelTest {

  @Test
  public void doesSubVowel_ReturnsSameInputString() {
  SubVowel testInstanceOfSubVowel = new SubVowel();
  String appString = testInstanceOfSubVowel.returnInputString("example");
  String testString = "example";
  assertEquals(true, appString instanceof String);
  assertEquals(true, testString.equals(appString));

  }

  @Test
  public void doesSubVowel_ReturnsSplitWord() {
  SubVowel instanceOfSubVowel = new SubVowel();
  String[] vow = {"a", "b", "c"};
  String[] testArray = instanceOfSubVowel.returnSplitWord("abc");
  assertEquals(vow, testArray);

  }

  @Test
  public void doesSubVowel_ReturnsVowelsSubbed() {
  SubVowel instanceOfSubVowel = new SubVowel();
  String testString = "G--d m-rn-ng l-d--s -nd g-ntl-m-n";
  String testReturn = instanceOfSubVowel.returnVowelSub("Good morning ladies and gentlemen");
  assertEquals(testString, testReturn);

  }

  @Test
  public void does_ReturnFirstWord() {
  SubVowel instanceOfSubVowel = new SubVowel();
  String testFirstWord = "Good  m-rn-ng l-d--s";
  String testReturn = instanceOfSubVowel.returnHint("Good morning ladies");
  assertEquals(testFirstWord, testReturn);

  }
}