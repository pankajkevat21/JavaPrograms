public class Q26SmallestAndLargest {
    public static void main(String[] args) {
        int[] arr ={10,40,6,78,7,436,7,100};
        int smallest=arr[0], largest=arr[0];
        int secondlarge = Integer.MIN_VALUE;
        int thirdlarge = Integer.MIN_VALUE;


        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }
                if(arr[i]>largest)
                {
                    thirdlarge = secondlarge;
                    secondlarge = largest;
                    largest = arr[i];
                }
                else if(secondlarge< arr[i] && arr[i]!=largest)
                {
                    thirdlarge = secondlarge;
                    secondlarge = arr[i];
                }
        }
        System.out.println("smallest element:"+smallest+"\nLargest element:"+largest);
        System.out.println("second larges:"+secondlarge);
        System.out.println("Third larges:"+thirdlarge);
    }
}
