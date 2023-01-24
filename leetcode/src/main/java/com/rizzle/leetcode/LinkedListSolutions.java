package main.java.com.rizzle.leetcode;

import java.util.Optional;
import java.util.OptionalInt;
import javax.swing.text.html.Option;

public class LinkedListSolutions {

  public class ListNode {
    public int val;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
      this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int val) {
      this(val, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    var start = new ListNode(0);
    var head = start;
    var carryOver = 0;

    while(carryOver > 0 || l1 != null || l2 != null) {
      var sum = carryOver;
      // calc sum
      sum += OptionalInt.of(l1.val).orElse(0) + OptionalInt.of(l2.val).orElse(0);

      // calc carryover
      carryOver = sum > 10 ? 1 : 0;

      // move on
      head.next = new ListNode(sum % 10);

      l1 =
      head = head.next;
    }

    return start.next;
  };

}
