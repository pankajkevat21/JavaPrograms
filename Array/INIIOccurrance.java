package Array;

public class INIIOccurrance {
    public static void main(String[] args) {
        int arr[] = {23, 6, 23, 7, 12, 87, 23, 23};
        int firstOccurance = -1;
        int lastOccurance = -1;
        int target =23;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target && firstOccurance==-1){
                lastOccurance = i;
                firstOccurance =i;
            }
            if(arr[i]==target){
                lastOccurance =i;
            }
        }
        System.out.println("First occurance:"+firstOccurance);
        System.out.println("Last occurance:"+lastOccurance);
    }
}

