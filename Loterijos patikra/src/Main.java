import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        User user = new User("Tomas");
        ISertificateService perlasCertificateService = new PerlasCertificateSerive();
        ITicketBuyService perlasTicketService = new PerlasTicketBuyService(perlasCertificateService);
        LotteryPerlas perlas = new LotteryPerlas(perlasCertificateService,perlasTicketService);

        perlas.navigation(user);

        if(user.getWin())user.resultPrint();






    }
}