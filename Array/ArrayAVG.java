package Array;

public class ArrayAVG {
    public static void main(String[] args) {
        int[] arr ={2,5,7,4,3};
        float avg =0f;
        for (int i = 0; i < arr.length; i++) {
            avg+= arr[i];
        }
        avg = avg/arr.length;
        System.out.println(avg);
    }
}
