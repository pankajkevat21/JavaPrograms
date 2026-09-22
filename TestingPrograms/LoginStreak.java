package TestingPrograms;

public class LoginStreak {
    public static int loginHighestStreak(String s){
        int maxStreak =0;
        int currentStreak=0;
        for(char ch: s.toCharArray()){
            if(ch=='L'){
                currentStreak++;
                maxStreak = Math.max(currentStreak, maxStreak);
            }
            else{
                currentStreak =0;
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        String steak =" LLNLLLLLNL";
        System.out.println(loginHighestStreak(steak));
    }
}
