package Array;

public class LargestElementIndex {
    public static void main(String[] args) {
        int[] arr ={2,4,8,0,6,10};
        int largeIdx = 0;
        int largValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largValue<arr[i])
            {
                largValue = arr[i];
                largeIdx = i;
            }
        }
        System.out.println("Largest element index:"+largeIdx);
    }
}



