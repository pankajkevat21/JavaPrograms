package TestingPrograms;

public class pairSum {
    static  int[] parisum2(int[] nums, int target)
    {
        int j = nums.length-1;
       int i =0;
        while (i<j){
            int pairsum = nums[i]+nums[j];
            if(pairsum<target){
                 j--;
               }
            if(pairsum>target){
                     i++;
         }
            if(pairsum==target){
                return new int[]{i, j};
            }
        }return new int[]{-1, -1};
    }
    static int[] pairAdd1(int[] nums,int target)
    {
        int pairsum = 0;

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,13};
        int target = 19;
       int[] result=  pairAdd1(arr,target);
       for (int x :result)
       {
           System.out.print(x+" ");
       }

    }

}
