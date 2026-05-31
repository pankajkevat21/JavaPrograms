package TestingPrograms;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class List {
    public static void main(String[] args) {
        Node head = null, temp = null, node;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");
    int   k = sc.nextInt();
            if(k==0){
                break;
            }
            node = new Node(k);
            if(head==null){
                head = node;
                temp = node;
            }
            else {
                temp.next = node;
                temp = node;
            }

            break;
        }
        temp = head;

        while (temp != null) {
            System.out.print(temp+" ");
            temp = temp.next;
        }
    }
}