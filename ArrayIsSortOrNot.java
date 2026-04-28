public class ArrayIsSortOrNot {
    public  static boolean  boolea(int arr[], int idx) {
        if (arr.length - 1 == idx){
            return  true;
        }
            if (arr[idx] < arr[idx + 1]) {
                return boolea(arr, idx + 1);
            } else {
                return false;
            }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};

        System.out.println("Is arrary sorted ? ->"+boolea(arr,0));

    }
}
