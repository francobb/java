package main.java.com.rizzle.leetcode;

import java.util.Arrays;
import main.java.com.rizzle.leetcode.StringSolutions.FirstPalindrome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

  private static final Logger logger = LogManager.getLogger(Main.class);

  public static void main(String[] args) {
    logger.debug(
        "trapRain({0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}) ::::::: " + new ArraySolutions().trapRain(
            new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));

    logger.debug("firstPalindrome(\"notapalindrome\", \"racecar\") ::::::: " + Arrays.toString(
        new String[]{"notapalindrome", "racecar"}));

    logger.debug("longestSubstringWithoutRepeatedCharacters(\"abba\") ::::::: "
//        + StringSolutions.longestSubstringWithoutRepeatedCharacters("pwwkew")
        + new StringSolutions().longestSubstringWithoutRepeatedCharacters("abbab")  );
  }
}