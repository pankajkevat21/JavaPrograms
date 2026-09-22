package Interview;

public class DLL {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next =null;
            this.prev = null;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next= head;
            head.prev = newNode;
            head = newNode;
        }
    }
}
