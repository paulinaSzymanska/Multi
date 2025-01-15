import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Ticket> tickets = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void checkMyTickets() {
        for (Ticket ticket : tickets) {
            System.out.println("Bought ticket: " + ticket.name());
        }
    }
}
