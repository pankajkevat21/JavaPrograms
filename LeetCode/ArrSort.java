public class ArrSort {
    public static void main(String[] args) {
        int []arr = {3,5,1,6,2};
        System.out.print("unsorted:");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        for (int i = 0; i < arr.length-1; i++) {
            int min  = i;
            for (int j =i+ 1; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    min=j;
                }
            }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

        }
        System.out.print("\nsorted:");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
