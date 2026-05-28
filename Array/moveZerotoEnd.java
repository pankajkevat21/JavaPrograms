package Array;

public class moveZerotoEnd {
    public static void main(String[] args) {
        int j =0;
        int nums[] = {1,0,0,2,6,0,7,4,0};
        for (int i = 0; i < nums.length; i++) {
        if(nums[i]!=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
        }
        for(int x: nums){
            System.out.print(x+" ");
        }
    }
}
