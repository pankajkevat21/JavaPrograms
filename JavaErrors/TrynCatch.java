package JavaErrors;

public class TrynCatch {
    public static void main(String[] args) {
        int arr[] = {10,345,2,6,6};
        try {
            System.out.println(arr[10]);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
