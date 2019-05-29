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

  public static void printPreOrder(BinaryTree tree) {
    if (null == tree) {
      return;
    }
    log.info("{}-", tree.val);
    printPreOrder(tree.left);
    printPreOrder(tree.right);
  }

  public static void printInOrder(BinaryTree tree) {
    if (null == tree) {
      return;
    }
    printInOrder(tree.left);
    log.info("{}-", tree.val);
    printInOrder(tree.right);
  }

  public static void printPostOrder(BinaryTree tree) {
    if (null == tree) {
      return;
    }
    printPostOrder(tree.left);
    printPostOrder(tree.right);
    log.info("{}-", tree.val);
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
