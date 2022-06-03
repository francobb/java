package main.java.com.rizzle.leetcode;

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
      if (height[p1] <= height[p2]) {
        // if current is bigger than max
        if (height[p1] >= mL) {
          mL = height[p1];
        } else {
          // add to total
          totalWater += mL - height[p1];
        }
        p1++;
      } else {
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
}
