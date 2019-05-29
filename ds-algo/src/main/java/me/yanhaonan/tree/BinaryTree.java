package me.yanhaonan.tree;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc:
 *
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-05-29 09:58
 */
@Slf4j
public class BinaryTree extends AbstractBinaryTree {
  private int val;
  private BinaryTree left;
  private BinaryTree right;

  public void printPreOrder(BinaryTree tree) {
    if (null == tree) {
      return;
    }
    log.info("{}-", tree.val);
    printPreOrder(tree.left);
    printPreOrder(tree.right);
  }


  public BinaryTree getLeft() {
    return left;
  }

  public void setLeft(BinaryTree left) {
    this.left = left;
  }

  public BinaryTree getRight() {
    return right;
  }

  public void setRight(BinaryTree right) {
    this.right = right;
  }
}
