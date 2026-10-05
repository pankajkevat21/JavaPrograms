package patterns;
public class Diamond
{
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for(int j=1;j<6-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            //System.out.println();
            int l =i;
            for(int j=1;j<=i;j++){
                System.out.print(l--);
            }
            System.out.println();
        }

    }
}