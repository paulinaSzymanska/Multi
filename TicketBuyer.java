import java.util.List;

public class TicketBuyer {

    public void buyTickets(Ticket ticket, Person person) {
        List<Ticket> currTickets = person.getTickets();
        currTickets.add(ticket);
        System.out.println(person.getName() + " bought ticket " + ticket.name());
    }

    public void buyTickets(Ticket ticket) {
        System.out.println("You bought ticket we will sent you link with ticket: " + ticket.name());
    }
}
