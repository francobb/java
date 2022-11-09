package main.java.com.rizzle.leetcode;

public class NumberSolutions {

  public boolean isPalindrome(int num) {
    int copy = num;
    int reverse = 0;

    while(copy > 0){
      int currentDigit = copy % 10;
      copy = (int) Math.floor(copy/10);
      reverse = reverse * 10 + currentDigit;
    }

    return reverse == num;
  }

}
