package Array;

public class Find_Element {
    public static void main(String[] args) {
        int arr[] ={3,6,23,7,12,87,23,23};
        int target = 23;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Element frequency "+count);
    }
}
