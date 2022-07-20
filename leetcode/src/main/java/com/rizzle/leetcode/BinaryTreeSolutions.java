package main.java.com.rizzle.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int i, TreeNode treeNode) {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
//[3,9,20,null,null,15,7]
public class BinaryTreeSolutions {
  public static TreeNode tn = new TreeNode( 3,
      new TreeNode(20, new TreeNode(15), new TreeNode(7)),
      new TreeNode(9));
  public List<List<Integer>> binary_tree_level_order(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) return res;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while( !queue.isEmpty() ) {
      var cnt = queue.size();
      List<Integer> level = new ArrayList<>(cnt);
      while(cnt > 0) {
        var node = queue.poll();
        if (node != null) level.add(node.val);
        assert node != null;
        if (node.left != null) queue.add(node.left);
        if (node.right != null)queue.add(node.right);

        cnt--;
      }
      res.add(level);
    }

    return res;
  }
  static class MaxDepth {
    public Integer max_depth(TreeNode root){
      if (root == null) return 0;
      return traverse(root, 0);
    }
    public Integer traverse(TreeNode node, Integer count) {
      if (node == null) return count;
      return Math.max(
          traverse(node.left, count+1),
          traverse(node.right, count+1)
      );
    }

  }

  public static class RightSideView {

    public List<Integer> binary_tree_right_side_view(TreeNode root) {
      var res = new ArrayList<Integer>();
      depth_first_search(root, 0, res);
      return res;
    }
    public void depth_first_search(TreeNode node, Integer level, List<Integer> res) {
      if (node == null) return;
      if (level >= res.size())res.add(node.val);
      if(node.right != null) depth_first_search(node.right, level +1, res);
      if(node.left != null) depth_first_search(node.left, level +1, res);
    }

  }


}


