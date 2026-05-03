public class And {
    public static void main(String[] args) {
        int[] arr = {13,4,7,3,362,36,447,5};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = 1+i; j <arr.length ; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]= arr[i];
            arr[i]= temp;
        }
        for(int x:arr)
        {
            System.out.println(x);
        }
    }

    public static class CalculatorGUI {
    }
}
