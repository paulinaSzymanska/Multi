import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Show show1 = new Show("Mufasa", ShowType.VIP, 20);
        Show show2 = new Show("Gladiator", ShowType.VIP, 20);
        Show show3 = new Show("ABC", ShowType.NORMAL, 32);
        Show show4 = new Show("Przyroda i t", ShowType.THREED, 32);
        Show show5 = new Show("Diana", ShowType.VIP, 111);
        Show show6 = new Show("Pingwiny", ShowType.THREED, 11);
        Show show7 = new Show("Corgi", ShowType.VIP, 43);
        Map<Integer, List<Show>> showsCin1 = new HashMap<>();

        showsCin1.put(1, List.of(show1, show2));
        showsCin1.put(2, List.of(show3, show2));
        showsCin1.put(3, List.of(show4, show7));
        showsCin1.put(4, List.of(show5, show3));
        showsCin1.put(5, List.of(show6, show5));
        Repertoire repertoire = new Repertoire(showsCin1);

        Map<Integer, List<Show>> showsCin2 = new HashMap<>();

        showsCin2.put(1, List.of(show6, show2));
        showsCin2.put(2, List.of(show7, show2));
        showsCin2.put(3, List.of(show1, show1));
        showsCin2.put(4, List.of(show3, show3));
        showsCin2.put(5, List.of(show2, show5));
        Repertoire repertoire2 = new Repertoire(showsCin2);

        Cinema cinema1 = new Cinema("Cinema1", repertoire);
        Cinema cinema2 = new Cinema("Cinema2", repertoire2);

        Reservation reservation = new Reservation();
        TicketBuyer ticketBuyer = new TicketBuyer();
        Person person = new Person("Heniek");

        //chcemy mieć możliwość rezerwacji miejsc przed seansem - DONE
//        System.out.println("Reservation of the ticker finished with the result: " + reservation.reserveShow(cinema1, show1));

        //chcemy mieć możliwość kupienia biletów z wyprzedzeniem - DONE
//        ticketBuyer.buyTickets(Ticket.Vip, person);

//        chcemy mieć możliwość sprawdzenia repertuaru na najbliższy tydzień - DONE
//        chcemy mieć możliwość obsługi seansów VIP i 3D- DONE
//        cinema2.checkRepertoire();

//        chcemy mieć możliwość sprawdzenia swoich biletów - DONE
//        ticketBuyer.buyTickets(Ticket.Vip, person);
//        person.checkMyTickets();

//        chcemy mieć możliwość zakupu biletów bez konta- DONE
//        ticketBuyer.buyTickets(Ticket.Normal);

    }
}
