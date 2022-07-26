package main.java.com.rizzle.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import main.java.com.rizzle.leetcode.BinaryTreeSolutions.MaxDepth;
import main.java.com.rizzle.leetcode.BinaryTreeSolutions.RightSideView;
import main.java.com.rizzle.leetcode.StringSolutions.FirstPalindrome;
import main.java.com.rizzle.leetcode.StringSolutions.RomanToInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

  private static final Logger logger = LogManager.getLogger(Main.class);

  public static void main(String[] args) {
//    logger.debug(
//        "::::::: trapRain({0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}) ::::::: "
//            + new ArraySolutions().trapRain(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
//
//    logger.debug(
//        "::::::: firstPalindrome(\"notapalindrome\", \"racecar\") ::::::: " +
//            new FirstPalindrome().firstPalindrome(new String[]{"notapalindrome", "racecar"}));
//
    logger.debug(
        "::::::: longestSubstringWithoutRepeatedCharacters(\"abba\") ::::::: "
//            + new StringSolutions().longestSubstringWithoutRepeatedCharacters("abbab"));
            + new StringSolutions().longestSubstringWithoutRepeatedCharacters("abba"));
//
//    logger.debug(
//        "::::::: add binary(\"1010, 1011\") ::::::: " + new StringSolutions()
//            .add_binary("1010", "1011"));
//
//    logger.info(
//        "::::::: BINARY TREE LEVEL ORDER ::::::: "
//            + new BinaryTreeSolutions().binary_tree_level_order(BinaryTreeSolutions.tn));
//
//    logger.info(
//        "::::::: MAX DEPTH ::::::: " + new MaxDepth().max_depth(BinaryTreeSolutions.tn));
//
//    logger.info(
//        "::::::: Right Side View ::::::: " + new RightSideView().binary_tree_right_side_view(
//            BinaryTreeSolutions.tn));
//
//    logger.info(
//        "::::::: Roman To Integer: (\"MCMXCIV \") ::::::: " + new RomanToInteger().romanToInt(
//            "MCMXCIV"));
//
    logger.info(
        "::::::: Longest Common Prefix: (\"dog\",\"racecar\",\"car\")  ::::::: "
//        + StringSolutions.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        + StringSolutions.longestCommonPrefix(new String[]{"flower","flow","flight"}));

    logger.info("::::::: TwoSum: (2, 7, 11, 15) ::::::: "
//        + Arrays.toString(new ArraySolutions().twoSum(new int[]{2, 7, 11, 15}, 9)));
        + Arrays.toString(new ArraySolutions().twoSum(new int[]{3, 2, 4, 15}, 6)));
  }

}