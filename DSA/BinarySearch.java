public class BinarySearch {
    static int binary(int nums[],int  target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { 5,10,15,20,25,90};
        int target = 110;
        int result =binary(nums, target);
        if(result==-1)
        {
            System.out.println("element not present in this array");
        }
        else {
            System.out.println("Element found at index "+result);
        }

    }
}
