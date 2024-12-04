import java.util.ArrayList;
import java.util.Scanner;

public class LotteryPerlas extends Navigation
{
    public final ISertificateService certificateService;
    public final ITicketBuyService ticketbuyService;
    ArrayList<Certificate> certificates;
    Scanner scanner ;

    public LotteryPerlas(ISertificateService _certificateService,ITicketBuyService _ticketBuyService){
        certificates=new ArrayList<>();
        certificateService = _certificateService;
        ticketbuyService = _ticketBuyService;
        scanner = new Scanner(System.in);
    }


    @Override
    public void navigation(User user)
    {
        boolean perlasIn=true;
        while(perlasIn){
            System.out.println("[1]Pirkti bilieta,[2]Tikrinti bilieta, [3]Iseiti");
            System.out.println("Pasirinkite veiksma");
            if(!scanner.hasNextInt()) {
                System.out.println("Tokio pasirinkimo nera");
                scanner.next();
                continue;
            }
            int command = scanner.nextInt();
            switch(command){
                case 1:
                    ticketbuyService.ticketBuy(user);
                    System.out.println("Bilietas nupirktas.");
                    break;
                case 2:

                    certificateService.ticketCheck(user);

                    if(user.getWin())
                    {
                        perlasIn=false;
                    }
                    break;
                case 3:
                    System.out.println("Viso gero.");
                    perlasIn=false;
                    break;

            }



        }
    }



}
