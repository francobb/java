package main.java.com.rizzle.leetcode;

import main.java.com.rizzle.leetcode.BinaryTreeSolutions.MaxDepth;
import main.java.com.rizzle.leetcode.BinaryTreeSolutions.RightSideView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

  private static final Logger logger = LogManager.getLogger(Main.class);

  public static void main(String[] args) {

    {
          logger.info(
              "::::::: BINARY TREE LEVEL ORDER ::::::: "
                  + new BinaryTreeSolutions().binary_tree_level_order(BinaryTreeSolutions.tn));

          logger.info(
              "::::::: MAX DEPTH ::::::: " + new MaxDepth().max_depth(BinaryTreeSolutions.tn));

          logger.info(
              "::::::: Right Side View ::::::: " + new RightSideView().binary_tree_right_side_view(
                  BinaryTreeSolutions.tn));

    }
  }

}