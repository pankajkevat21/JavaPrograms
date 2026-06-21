package Array;

public class Find_Element {
    public static void main(String[] args) {
        int arr[] ={3,6,7,12,87,23,23};
        int target = 23;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("element found at index "+i);
            }
        }
    }
}
