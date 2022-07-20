package main.java.com.rizzle.leetcode;

import java.util.HashMap;
import java.util.List;
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
}
