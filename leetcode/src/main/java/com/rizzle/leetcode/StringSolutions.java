package main.java.com.rizzle.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StringSolutions {

  static Logger logger = LogManager.getLogger(Object.class);

  public static class FirstPalindrome {

    /**
     *
     * @param words array of words
     * @return the one that is a palindrome
     */
    public String firstPalindrome(String[] words){
      // loop through words;
      return String.valueOf(Arrays.stream(words).filter(this::isPalindrome).findFirst());
    }
    public boolean isPalindrome(String wrd){
      for (int i = 0; i < wrd.length()/2; i++) {
        if (wrd.charAt(i) != wrd.charAt(wrd.length()-i-1)){
          return false;
        }
      }
      return true;
    }

    public String firstPalindrome1(String[] words){
//       implementation 2
      for (String word : words) {
        var wordReverse = new StringBuilder(word).reverse().toString();
        if (word.equals(wordReverse)) {
          logger.info(":::Something Happened:::");
          return word;
        }
      }
      return "";
    }

  }

  /**
   *
   * @param str used to find the longest substring
   * @return longest substring
   */
  public int longestSubstringWithoutRepeatedCharacters(String str) {
    var i= longestSub(str);
    var j= this.lengthOfLongestSubstring(str);

    int maxChars = 0;
    int mover = 0;
    int pointer = 0;
    var map = new HashMap<Character, Integer>();
     while(mover < str.length()) {

       if (map.containsKey(str.charAt(mover)) && pointer <= map.get(str.charAt(mover))) {
         pointer = map.get(str.charAt(mover)) +1;
       }

       map.put(str.charAt(mover), mover);
       maxChars = Math.max(maxChars, mover - pointer +1);
       mover++;
     }

    return maxChars;
  }
  public static int longestSub(String s){
    int[] chars = new int[128];

    int left = 0;
    int right = 0;

    int res = 0;
    while (right < s.length()) {
      char r = s.charAt(right);
      chars[r]++;

      while (chars[r] > 1) {
        char l = s.charAt(left);
        chars[l]--;
        left++;
      }

      res = Math.max(res, right - left + 1);

      right++;
    }
    return res;
  }

  public int lengthOfLongestSubstring(String s) {
    Integer[] chars = new Integer[128];

    int left = 0;
    int right = 0;

    int res = 0;
    while (right < s.length()) {
      char r = s.charAt(right);

      Integer index = chars[r];
      if (index != null && index >= left && index < right) {
        left = index + 1;
      }

      res = Math.max(res, right - left + 1);

      chars[r] = right;
      right++;
    }

    return res;
  }
}
