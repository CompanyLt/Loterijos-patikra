import java.util.ArrayList;
import java.util.List;
public class User {
    String name;
    int gameTry;
    int winnerTicket;
    boolean win;
    ArrayList<Ticket> tickets;
    float moneySpend;
    float moneyGet;

    public  User(String _name){
        name=_name;
        tickets = new ArrayList<>();
        gameTry=0;
        winnerTicket=0;
        win=false;
        moneySpend=0;
        moneyGet=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGameTry() {
        return gameTry;
    }

    public void setGameTry(int gameTry) {
        this.gameTry += gameTry;
    }

    public float getMoneySpend() {
        return moneySpend;
    }

    public void setMoneySpend(float moneySpend) {
        this.moneySpend += moneySpend;
    }

    public float getMoneyGet() {
        return moneyGet;
    }

    public void setMoneyGet(float moneyGet) {
        this.moneyGet = moneyGet/1000;
    }

    public int getwinnerTicket() {
        return winnerTicket;
    }

    public void setwinnerTicket(int ticket) {
        this.winnerTicket = ticket;
    }

    public boolean getWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTicket(Ticket _ticket) {
        tickets.add(_ticket);
    }

    public void resultPrint()
    {
        System.out.println("---------WINNER--------------");
        System.out.println("Laimetojas:"+name);
        System.out.println("Laimingas bilietas:"+winnerTicket);
        System.out.println("Panaudota bandymu:"+gameTry);
        System.out.println("Isleista pinigu:"+moneySpend);
        System.out.println("Laimeta pinigu:"+moneyGet);
    }
}
