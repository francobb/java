package test.java.com.rizzle.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import main.java.com.rizzle.leetcode.ArraySolutions;
import org.junit.jupiter.api.Test;

class ArraySolutionsTest {

  ArraySolutions arraySolutions = new ArraySolutions();

  @Test
  void testChunk(){
    var expected = List.of(List.of(1,2), List.of(3,4), List.of(5,6), List.of(7,8), List.of(9,10));
    assertEquals(arraySolutions.array_chunk(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2), expected);
  }

  @Test
  void testRemoveDuplicates() {
    assertEquals(arraySolutions.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}), 5);
    assertEquals(arraySolutions.removeDuplicates(new int[]{1,1,2}), 2);
  }

  @Test
  void testRemoveElement(){
    assertEquals(arraySolutions.removeElement(new int[]{3,2,2,3}, 3), 2);
    assertEquals(arraySolutions.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2), 5);
  }

  @Test
  void testMaxArea(){
    assertEquals(49, arraySolutions.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
  }

  @Test
  void testTwoSum(){
    assertArrayEquals(new int[]{1,2}, new ArraySolutions().twoSum(new int[]{3, 2, 4, 15}, 6));
  }

}