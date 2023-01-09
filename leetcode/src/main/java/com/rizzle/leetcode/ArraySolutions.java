package main.java.com.rizzle.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public class ArraySolutions {

  /**
   * @param height is how tall one is
   * @return integer
   * @example [0,1,0,2,1,0,1,3,2,1,2,1]
   */
  public int trapRain(int @NotNull [] height) {
    if (height.length <= 0) {
      return 0;
    }
    // initialize variables
    int p1 = 0;
    int p2 = height.length - 1;
    int mL = 0;
    int mR = 0;
    int totalWater = 0;

    // loop through the array
    while (p1 < p2) {

      if (height[p1] <= height[p2]) { // Pointer 1 is less than Pointer 2
        if (height[p1] >= mL) { // If current is bigger than max
          mL = height[p1]; // update the max
        } else {
          totalWater += mL - height[p1]; // add to total
        }
        p1++; // increment pointer
      }

      else {
        if (height[p2] > mR) {
          mR = height[p2];
        }
        else {
          totalWater+=mR-height[p2];
        }
        p2--;
      }

    }
    return totalWater;
  }
  public int[] twoSum(int[] nums, Integer target){
    var map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      var currentNumber = nums[i];
      var difference = target - currentNumber;
      if (map.containsKey(difference)) {
        return new int[]{ map.get(difference), i };
      }
      map.put(currentNumber, i);
    }

    return new int[]{};
  }

  public ArrayList<List<Integer>> array_chunk(List<Integer> list, int size) {
    var idx = 0;
    var chunked = new ArrayList<List<Integer>>();

    while (idx < list.size()){
      chunked.add(list.subList(idx, idx+size));
      idx+=size;
    }

    return chunked;
  }

  /**
   *
   * @param ary length of array
   * @return integer
   */
  public int removeDuplicates(int[] ary){
    // use two pointers;
    var p1 = 0;
    // loop through ary resetting the value at p1
    // if values don't equal each other
    for (int idx = 0; idx < ary.length; idx++) {
      if (ary[p1] != ary[idx]) {
        ary[++p1] = ary[idx];
      }
    }
    return ++p1;
  }

  public int removeElement(int[] ary, int val) {
    // use two pointer technique
    var idx = 0;
    // loop through and replace slow pointer
    for (int jdx = 0; jdx < ary.length; jdx++) {
      if (ary[jdx] != val){
        ary[idx++] = ary[jdx];
      }

    }

    return idx;






  }

  public int maxArea(int[] ary){

    var p1 = 0;
    var p2 = ary.length-1;

    int maxArea = 0;

    while(p1 < p2) {
      // calc the x and y

      var y = Math.min(ary[p1], ary[p2]);
      var x = p2 - p1;
      maxArea = Math.max(maxArea, x * y);

      if (ary[p1] < ary[p2]) {
        p1++;
      } else {
        p2--;
      }
    }

    return maxArea;
  }

  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<>();

    if(nums1.length < nums2.length){
      int[] temp = nums1;
      nums1 = nums2;
      nums2 = temp;
    }

    for (int cn : nums1) {
      if (Arrays.stream(nums2).anyMatch(n -> n == cn)) {
        list.add(cn);
      }
    }

    return list.stream().mapToInt(x -> x).toArray();

  }

  public Boolean containsDuplicate(int[] ary){
    Set<Integer> nums = new HashSet<>();
    var counter = 0;

    while (counter < ary.length) {
      if (nums.contains(ary[counter])){
        return true;
      }
      nums.add(ary[counter]);
      counter++;
    }

    return false;
  }

}
