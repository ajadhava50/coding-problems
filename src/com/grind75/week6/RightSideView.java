package com.grind75.week6;
import java.util.ArrayList;
import java.util.List;
public class RightSideView {
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return result;
        rightView(root, 0);
        return result;
    }

    public void rightView(TreeNode root, int level) {
        if (root == null) return;
        if (result.size() == level) {
            result.add(root.val);
        }
        rightView(root.right, level + 1);
        rightView(root.left, level + 1);
    }
}
