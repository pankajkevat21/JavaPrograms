import java.util.*;
class BinaryTreeYT{
    static class Node{
        int data;

        Node left;
        Node right;
        Node(int data){

            this.data = data;
            this.left =null;
            this.right =null;
        }
    }
     static class Binary{
        static int count = 0;
        static int idx =-1;
       public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return  null;
            }
            count++;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return  newNode;
        }
     }
    public  static  void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public  static  void inorder(Node root)
    {
        if(root==null)
    {
        return;
    }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public  static  void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static int totalNodes(Node root)
    {
        if(root==null)
        {
            return  0;
        }
        int leftNodes = totalNodes(root.left);
        int rightNodes = totalNodes(root.right);
        return  leftNodes + rightNodes +1;

    }
    public  static  void levelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            if(root==null)
            {
                return;
            }
            Node currNode = q.remove();
            if(currNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }else{
                    q.add(null);
                }
            }else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int sumOfNodes(Node root)
    {
        if (root == null) {
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
       return leftsum+ rightsum + root.data;

    }
    public  static int height(Node root)
    {
        if(root==null)
        {
            return  0;
        }
        int lefthight = height(root.left);
        int righthight = height(root.right);
        if(lefthight<=righthight)
        {
            return  righthight+1;
        }else {
            return lefthight+1;
        }

    }
    public static int diameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+ height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    public static void main(String[] args) {
        int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary bn = new Binary();
        Node root  = bn.buildTree(nodes);
        System.out.println("sum of all nodes:"+sumOfNodes(root));
        System.out.println("Height of the tree:"+height(root));
        System.out.println("Diameter of the tree:"+diameter(root));

/*
        System.out.println("total nodes:"+totalNodes(root));
        levelOrder(root);
      System.out.println(root.data);
        System.out.print("Inorder   Traversal:");
        inorder(root);
        System.out.println();
        System.out.print("Preorder  Traversal:");
        preOrder(root);
        System.out.println();
        System.out.print("PostOrder Traversal:");
        postOrder(root);
*/



    }


}