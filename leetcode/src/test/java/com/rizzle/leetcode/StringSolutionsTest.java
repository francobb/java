package test.java.com.rizzle.leetcode;

import static org.junit.jupiter.api.Assertions.*;
import main.java.com.rizzle.leetcode.StringSolutions;
import main.java.com.rizzle.leetcode.StringSolutions.FirstPalindrome;
import main.java.com.rizzle.leetcode.StringSolutions.LongestSubstringWithoutRepetition;
import main.java.com.rizzle.leetcode.StringSolutions.RomanToInteger;
import org.junit.jupiter.api.Test;

class StringSolutionsTest {

  @Test
  void testLongestLengthOfSubstring(){
    var expected = 3;
    assertEquals(expected, StringSolutions.LongestSubstringWithoutRepetition.longestSub("abcabcbb"));
    assertEquals(expected, StringSolutions.LongestSubstringWithoutRepetition.longestSubstringWithoutRepeatedCharacters("abcabcbb"));
    assertEquals(expected, StringSolutions.LongestSubstringWithoutRepetition.lengthOfLongestSubstring("abcabcbb"));
  }

  @Test
  void testLongestCommonPrefix(){
    var expect = "fl";
    assertEquals(expect, StringSolutions.longestCommonPrefix(new String[]{"flower","flow","flight"}));
  }

  @Test
  void testFirstPalindrome() {
    var expected = "racecar";
    assertEquals(expected, new FirstPalindrome().firstPalindrome(new String[]{"notapalindrome", "racecar"}));
  }

  @Test
  void testAddBinary() {
    assertEquals("10101" ,new StringSolutions().add_binary("1010", "1011"));
  }

  @Test
  void romanToInteger() {
    assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
  }

}
