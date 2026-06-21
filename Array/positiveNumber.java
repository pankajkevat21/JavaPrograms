package Array;

public class positiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, -3, 6, -4, 2, -6, 7};
        int negNo =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                negNo++;
            }
        }
        System.out.print("negative elements in array"+ negNo);
    }
}