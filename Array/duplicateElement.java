package Array;

public class duplicateElement {
    public static void main(String[] args) {

        // Array containing duplicate values
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30, 60};
int count =0;
        // Boolean array of the same size
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    visited[i]= true;
                    visited[j] =true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
             if(visited[i]==false){
                 count++;
             }
        }
        System.out.println("total unique elements:"+count);
    }
}