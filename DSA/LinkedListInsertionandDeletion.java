import  java.util.*;
public class LinkedListInsertionandDeletion {
class List{
    int data;
    List next;
    List(int data){
        this.data = data;
        this.next = null;
    }
}
List head = null, node= null, temp = null;

    public void addFirst(int data){
        node = new List(data);
        if(head == null)
        {
          head = node;
          return;
        }
        else {
            node.next = head;
            head = node;

        }
    }
    public  void addLast(int data){
        node = new List(data);
        if(head==null){
            head = node;
            return;
        }
        else {
            temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void deleteFirst(){
        temp = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
            head = head.next;

    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        List second = null;
        temp = head;
        while(temp.next!=null)
        {
            second = temp;
            temp = temp.next;
        }
        second.next = null;

    }
    public void printList(){
        temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public  static void main(String[] args) {
      LinkedListInsertionandDeletion ll = new LinkedListInsertionandDeletion();
      Scanner sc = new Scanner(System.in);
      int data = sc.nextInt();
       ll.addFirst(data);
        data = sc.nextInt();
        ll.addLast(data);
        data = sc.nextInt();
        ll.addLast(data);
        data = sc.nextInt();
        ll.addLast(data);
        data = sc.nextInt();
        ll.addLast(data);

        ll.printList();
        System.out.println("\ndelete please");
        ll.deleteLast();
        ll.printList();
    }
}

