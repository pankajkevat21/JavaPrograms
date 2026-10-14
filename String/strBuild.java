package String;
public class strBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pankaj kevat bhumiya dhana");
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='a')
             sb.setCharAt(i,'A');
            System.out.print(sb.charAt(i)+"");
        }

    }
}
