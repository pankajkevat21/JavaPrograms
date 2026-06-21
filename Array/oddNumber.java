package Array;

public class oddNumber {
    public static void main(String[] args) {
        int[] arr ={1,3,6,4,2,6,7};
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                odd++;
            }
        }
        System.out.println("odd number in this array"+ odd);
    }
}
