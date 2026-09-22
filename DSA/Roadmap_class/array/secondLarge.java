package Roadmap_class.array;

public class secondLarge {
    public static void main(String[] args) {
        int arr[] = {7,14,15,21,19};
        if(arr.length==0){
            System.out.println("Array is empty");
            return;
        }
        int second_large =0;
        int large =arr[0];
        for(int num:arr){
            if(large<num){
                second_large =large;
                large = num;
            }
            if(second_large<num && large!=num){
                second_large =num;
            }
        }
        System.out.println("Largest:"+large);
        System.out.println("secondLargest:"+second_large);
    }
}
