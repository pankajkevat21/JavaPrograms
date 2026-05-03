import java.util.*;

public class BinarySearchTree {

    static class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int data) {
            this.data = data;
        }
    }
public  static void preorder(Tree root)
{
    if(root== null)
    {
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);

}
    public  static void inorder(Tree root)
    {
        if(root== null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public  static void postorder(Tree root)
    {
        if(root== null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree root = null;

        while (true) {
            System.out.print("Enter no (0->break): ");
            int data = sc.nextInt();

            if (data == 0) {
                break;
            }

            Tree node = new Tree(data);

            if (root == null) {
                root = node;   // ✔ correct
                continue;
            }

            Tree curr = root;

            while (true) {
                if (data < curr.data) {
                    if (curr.left != null) {
                        curr = curr.left;
                    } else {
                        curr.left = node;
                        break;
                    }
                } else {
                    if (curr.right != null) {
                        curr = curr.right;
                    } else {
                        curr.right = node;
                        break;
                    }
                }
            }
        }
        System.out.print("Preorder:");
        preorder(root);
        System.out.print("\ninorder:");

        inorder(root);
        System.out.print("\npostorder:");
        postorder(root);
    }
}