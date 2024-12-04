import java.util.ArrayList;

public interface ISertificateService
{
     boolean sertificateCheck(Ticket ticket);
     void ticketCheck(User user);
     ArrayList<Certificate> certificatesGet();

}
