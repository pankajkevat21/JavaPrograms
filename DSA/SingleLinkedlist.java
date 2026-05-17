import java.util.Scanner;
class linked{
    int data;
    linked next;
    linked(int data){
        this.data = data;
        this.next = null;
    }
}
class SingleLinkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linked start = null, node= null, p=null;
        while(true)
        {
            System.out.println("Enter value:");
            node = new linked(sc.nextInt());
            if(node.data==0)
            {
                break;
            }
            node.next = null;
            if(start==null)
            {
                start = node;
                p = node;
            }
            else{
                p.next = node;
                p = node;
            }
        }
// display list
        System.out.println("Display linked list->");
      p = start;
      while(p!=null){
          System.out.print(p.data+" -> ");
          p = p.next;
      }
        System.out.print("NULL");
    }
}