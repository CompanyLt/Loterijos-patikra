import java.util.ArrayList;
import java.util.Scanner;

public class PerlasCertificateSerive implements ISertificateService
{
    ArrayList<Certificate> certificates;
    Scanner scanner;
    public PerlasCertificateSerive() {
        certificates = new ArrayList<>();
        scanner=new Scanner(System.in);
    }

    public ArrayList<Certificate> certificatesGet()
    {
        return certificates;
    }



    public boolean sertificateCheck(Ticket ticket){

        for (Certificate cert : certificates) {
//            System.out.println("cert" + cert.getCertificate() + ": certid " + cert.getId());
//            System.out.println("ticketcert" + ticket.getCertificate() + ": ticketid " + ticket.getId());
            if (cert.getCertificate() == ticket.getCertificate() && cert.getId() == ticket.getId()) {

                return true;
            }
        }


        return false;

    }


    @Override
    public void ticketCheck(User user){
        int index=1;
        boolean run = true;
        while(run) {

            for (Ticket ticket : user.getTickets()) {

                System.out.println("Nr" + index + ": Bilietas " + ticket.getId());
                index += 1;
            }
            index=1;
            System.out.println("Pasirinkite bilieta, GRISTI I PRADINI MENIU:[ 0 ]");

            if (!scanner.hasNextInt()) {

                System.out.println("Tokio pasirinkimo nera");
                scanner.next();
                continue;
            }
            int command = scanner.nextInt();
            if(command == 0)return;
            if(command<=0 || command> user.getTickets().size()){
                System.out.println("tokio bilieto nera");
                continue;
            }


            int number = user.getTickets().get(command-1).getId();
            int result=0;

            result-=number%10;
            number/=10;
            result-=number%10;
            number/=10;
            result-=number%10;
            number/=10;

            result+=number%10;
            number/=10;
            result+=number%10;
            number/=10;
            result+=number%10;

            //sutikriname ar laimejo plius patikriname bilieto sertifikata
            if(result==0 && sertificateCheck(user.getTickets().get(command-1))== true )
            {

                System.out.println("Jus laimejote!!!");
                user.setWin(true);
                user.setwinnerTicket(user.getTickets().get(command-1).getId());
                user.setMoneyGet(user.getTickets().get(command-1).getId());
                run=false;
            }else{
                System.out.println("Bilietas nesekmingas!!!");
                user.getTickets().remove(command-1);
                user.setGameTry(1);

            }

        }
    }

}
