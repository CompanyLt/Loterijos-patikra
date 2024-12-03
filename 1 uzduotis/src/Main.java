import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        User user = new User("Tomas");
        LotteryPerlas perlas = new LotteryPerlas();

        perlas.navigation(user);

        if(user.getWin())user.resultPrint();






    }
}