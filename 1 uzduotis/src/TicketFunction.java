import java.util.ArrayList;

public abstract class TicketFunction
{


    public abstract void ticketBuy(User user);
    public abstract void ticketCheck(User user);

    public abstract void navigation(User user);

    public abstract boolean sertificateCheck(Ticket ticket);
}
