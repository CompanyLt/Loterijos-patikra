import java.util.Random;

public class PerlasTicketBuyService implements ITicketBuyService {
    ISertificateService sertificateService;


    public PerlasTicketBuyService(ISertificateService service){
        sertificateService=service;
    }

    @Override
    public void ticketBuy(User user){
        Random random = new Random();
        Ticket ticket=new Ticket();
        int idGeneration = 100000 + random.nextInt(900000);
        float certificateGeneration = idGeneration/2;
        ticket.setId(idGeneration);
        ticket.setCertificate(certificateGeneration);
        user.setTicket(ticket);

        Certificate certificate= new Certificate(idGeneration,certificateGeneration);
         sertificateService.certificatesGet().add(certificate);
        user.setMoneySpend(5);

    }

}
