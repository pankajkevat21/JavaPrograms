

public class Main
{
    public int maxProduct(int[] arr) {
        int largest =arr[0];
        int secondLargest = largest;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
        System.out.println(largest);
        secondLargest -= 1;
        largest -= 1;
        return secondLargest*largest;

    }
    public static void main(String[] args) {

        Main mn = new Main();
        //	int arr2[] = {1,5,4,5}; //12
        int arr1[] = {3,4,5,2};//16
        int arr3[] = {3,7};//12
        mn.maxProduct(arr1);
// 		System.out.println(mn.maxProduct(arr1));
// 		System.out.println(mn.maxProduct(arr2));
// 		System.out.println(mn.maxProduct(arr3));
// 		//
    }
}