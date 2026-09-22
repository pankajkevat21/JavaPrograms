class XOR {
    public int singleNumber(int[] nums) {
        int k=0;
        for( int i=0; i<nums.length; i++)
        {
            for( int j=1+i; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    nums[j]=-10;
                    nums[i]=-10;
                    break;
                }
            }
        }
        for( int i=0;i<nums.length;i++)
        {
            if(nums[i]!=-10)
            {
                k=nums[i];
                break;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        XOR xor = new XOR();
        int []nums= {4,1,2,1,2,1,2};
        System.out.println(xor.singleNumber(nums));;
    }
}