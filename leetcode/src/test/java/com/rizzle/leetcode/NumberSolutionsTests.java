package test.java.com.rizzle.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.java.com.rizzle.leetcode.NumberSolutions;
import org.junit.jupiter.api.Test;

public class NumberSolutionsTests {

  NumberSolutions numberSolutions = new NumberSolutions();

  @Test
  void testIsPalindrome() {
    assertFalse(numberSolutions.isPalindrome(12331));
    assertTrue(numberSolutions.isPalindrome(121));
  }

}
