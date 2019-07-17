package me.yanhaonan.trie;

/**
 * Desc:
 *
 * ------------------------------------
 *
 * @author yanhaonan@meituan.com
 * @date 2019-07-17 13:27
 */
public class Trie {
  private TrieNode root = new TrieNode('/');

  public void insert(String word) {
    TrieNode p = root;
    for (char c : word.toCharArray()) {
      int index = c - 'a';
      if (p.children[index] == null) {
        p.children[index] = new TrieNode(c);
      }
      p = p.children[index];
    }
    p.setEnding(true);
  }

  public boolean find(String word) {
    TrieNode p = root;
    for (char c : word.toCharArray()) {
      int index = c - 'a';
      if (p.children[index] == null) {
        return false;
      } else {
        p = p.children[index];
      }
    }
    return p.isEnding();
  }


  class TrieNode {
    private char val;
    private TrieNode[] children;
    private boolean ending;

    TrieNode(char val) {
      this.val = val;
    }

    public char getVal() {
      return val;
    }

    public void setVal(char val) {
      this.val = val;
    }

    public TrieNode[] getChildren() {
      return children;
    }

    public void setChildren(TrieNode[] children) {
      this.children = children;
    }

    public boolean isEnding() {
      return ending;
    }

    public void setEnding(boolean ending) {
      this.ending = ending;
    }
  }
}
