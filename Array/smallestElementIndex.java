package Array;

public class smallestElementIndex {
    public static void main(String[] args) {
        int[] arr ={2,4,8,0,6,1};
        int smallIdx = 0;
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(minValue>arr[i])
            {
                minValue = arr[i];
                smallIdx = i;
            }
        }
        System.out.println("Smallest element index:"+smallIdx);
    }
}
