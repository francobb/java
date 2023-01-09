package test.java.com.rizzle.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;
import main.java.com.rizzle.leetcode.ArraySolutions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ArraySolutionsTests {

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
  void testRemoveElement() {
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

  @Test
  void testIntersect(){
    assertArrayEquals( new int[]{2,2},arraySolutions.intersect(new int[]{1,2,2,1}, new int[]{2,2}));
  }

  @ParameterizedTest
  @MethodSource("testContainsDuplicate")
  void testContainsDuplicate(int[] value){
    assertTrue(arraySolutions.containsDuplicate(value));
  }

  public static Stream<Arguments> testContainsDuplicate() {
    return Stream.of(
        Arguments.of(new int[]{1,1,1,3,3,4,3,2,4,2}),
        Arguments.of((Object) new int[]{1,2,3,1}));
  }
}