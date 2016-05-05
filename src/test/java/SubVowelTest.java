import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class SubVowelTest {

  @Test
  public void returnInputString_ReturnsSameInput_String() {
    SubVowel testInstanceOfSubVowel = new SubVowel();
    String appString = testInstanceOfSubVowel.returnInputString("example");
    String testString = "example";
    assertEquals(true, appString instanceof String);
    assertEquals(true, testString.equals(appString));
  }
  @Test
  public void returnVowelSub_replaceVowelWithDash_String() {
    SubVowel testInstance = new SubVowel();
    assertEquals("g-", testInstance.returnVowelSub("ga"));
  }
  @Test
  public void returnVowelSub_IsCaseInsensitive_String() {
    SubVowel testInstance = new SubVowel();
    assertEquals("G-", testInstance.returnVowelSub("GA"));
  }
  @Test
  public void returnVowelSub_ReturnsInputVowelsWithDash_String() {
    SubVowel instanceOfSubVowel = new SubVowel();
    String testString = "G--d m-rn-ng l-d--s -nd g-ntl-m-n";
    String testReturn = instanceOfSubVowel.returnVowelSub("Good morning ladies and gentlemen");
    assertEquals(testString, testReturn);
  }
  @Test
  public void returnHint_returnsFirstWordNormally_String() {
    SubVowel instanceOfSubVowel = new SubVowel();
    String test = "Good ";
    assertEquals(test, instanceOfSubVowel.returnHint("Good"));
  }
  @Test
  public void returnHint_decodesFirstWordOnly_String() {
    SubVowel instanceOfSubVowel = new SubVowel();
    String testFirstWord = "Good  m-rn-ng l-d--s";
    String testReturn = instanceOfSubVowel.returnHint("Good morning ladies");
    assertEquals(testFirstWord, testReturn);
  }
}