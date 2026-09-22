package Roadmap_class.array;

public class sum {
    public static void main(String[] args) {
        int arr[] ={12,56,3,61,60};
        int sum =0;
        int large =arr[0];
        for(int summ:arr){
            if(summ>large){
                large=summ;
            }
            sum+=summ;
        }
        System.out.println("the sum of the array:"+sum);
        System.out.println("the largest element:"+large);
    }
}
