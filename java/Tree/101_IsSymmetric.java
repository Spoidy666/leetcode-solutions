import java.util.*;
import java.util.Queue;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
       if(root== null){
            return true;
        }
        if(root.left == null && root.right==null){
            return true;
        }
        if(root.left == null || root.right == null){
            return false;
        }
        Queue<TreeNode> leftq = new LinkedList<>();
        Queue<TreeNode> rightq= new LinkedList<>();
        leftq.offer(root.left);
        rightq.offer(root.right);
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        while(!leftq.isEmpty() && !rightq.isEmpty()){
            left = leftq.poll();
            right = rightq.poll();
            if (left == null || right == null || left.val!=right.val){
                return false;
            }
            if(left.left != null || right.right!= null){
                leftq.offer(left.left);
                rightq.offer(right.right);
            }
            if(left.right!= null || right.left!=null){
                leftq.offer(right.left);
                rightq.offer(left.right);
            }
        }
        return leftq.isEmpty() && rightq.isEmpty();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
            1,
            new TreeNode(
                2,
                new TreeNode(3),
                new TreeNode(4)
            ),
            new TreeNode(
                2,
                new TreeNode(4),
                new TreeNode(3)
            )
        );

        SymmetricTree obj = new SymmetricTree();

        if (obj.isSymmetric(root)) {
            System.out.println("Tree is symmetric");
        } else {
            System.out.println("Tree is not symmetric");
        }
    }
}