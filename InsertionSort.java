public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={12,11,13,5,6};
        System.out.print("Unsorted Insertion Array:");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        for (int i = 1; i < arr.length; i++) {
                int current = arr[i];
                int j = i-1;
                while(j>=0 && current <arr[j]){
                    arr[j+1]= arr[j];
                    j--;
                }
                arr[j+1]= current;
            
        }
        System.out.print("\nSorted Array:");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }

    }
}
