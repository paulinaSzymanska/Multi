import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CinemaSystem cinemaSystem = new CinemaSystem();

        Show show1 = new Show(List.of("Mufasa", "calienczka"));
        Show show2 = new Show(List.of("Gladiator", "Psy"));
        Show show3 = new Show(List.of("Mufasa", "ABC"));
        Show show4 = new Show(List.of("Przyroda i ty", "Kiepscy"));
        Show show5 = new Show(List.of("Diana", "Zorro"));
        Show show6 = new Show(List.of("Zoo", "Pingwiny"));
        Show show7 = new Show(List.of("Sushi", "Corgi"));
        Map<Integer, Show> shows = new HashMap<>();

        shows.put(1, show1);
        shows.put(2, show2);
        shows.put(3, show3);
        shows.put(4, show4);
        shows.put(5, show5);
        Repertoire repertoire = new Repertoire(shows);

        Map<Integer, Show> showsCin2 = new HashMap<>();

        shows.put(1, show5);
        shows.put(2, show6);
        shows.put(3, show7);
        shows.put(4, show4);
        shows.put(5, show1);
        Repertoire repertoire2 = new Repertoire(showsCin2);

        Cinema cinema1 = new Cinema("Cinema1", repertoire);
        Cinema cinema2 = new Cinema("Cinema2", repertoire2);


        cinemaSystem.addCinema(cinema1);
        cinemaSystem.addCinema(cinema2);

        cinema1.reserveShow(show1);
        cinema2.buyTickets(Ticket.Vip);

        cinema2.checkRepertoire();
    }
}
