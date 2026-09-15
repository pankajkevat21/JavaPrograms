package Interview;

public class LL {
    Node head;
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data =data;
            this.next = null;
        }
    }
public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
}
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
       temp.next = newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp =temp.next;
            }
            System.out.print("null");
        }
    }
    static void main(String[] args) {
        LL list  = new LL();
        list.addFirst("pankaj");
        list.addLast("kevat");
        list.addLast("sbi");
        list.printList();
    }
}
