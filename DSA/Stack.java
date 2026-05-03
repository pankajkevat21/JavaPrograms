import java.util.Scanner;

class stack2{
    int st[]= new int[6];
    int top =-1;
     void push(int value){
         if(top== st.length){
             System.out.println("Stack is full can't push values");
         }else{
             st[++top] =  value;
         }
//         return;
     }
     int pop(){
         int k;
         if(top==-1){
             System.out.println("Stack is empty can't pop ");
             return  -1;
         }
         else {
             k = st[top--];
             return k;
         }

     }

    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else {
            for(int i=0;i<=top;i++){
                System.out.print(st[i]+ " ");
            }
        }
    }


}
public class Stack extends stack2{
    public static void main(String[] args) {

    }
}