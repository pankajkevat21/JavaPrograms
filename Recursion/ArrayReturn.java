package Recursion;

public class ArrayReturn {
   public static  int [] arrret(){
        int arr[] = {1,5,3,7,35};
        return  arr;
    }
    public  static  int[] doublearray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
        return  arr;
    }
    public static int[]  getarr(){
       return  new int[] {10,20,30};
    }
   public static void main(String[] args) {
       int a[] ={10,20,30};
      int result[] = arrret();
        for(int x: result){
            System.out.print(x+ " ");
        }
        System.out.println();
        result = doublearray(a);
        for(int x: result){
            System.out.print(x+ " ");
        }
        System.out.println();
        result = getarr();
        for(int x: result){
            System.out.print(x+ " ");
        }
   }
    }

