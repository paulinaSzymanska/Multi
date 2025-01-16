import java.util.List;
import java.util.Map;

public class Reservation {
    public boolean reserveShow(Cinema cinema, Show show) {
        Repertoire repertoire = cinema.getRepertoire();
        Map<Integer, List<Show>> shows = repertoire.shows();
        for (List<Show> value : shows.values()) {
            if (value.contains(show)) {
                int numberOfFreeSeats = show.getNumberOfSeats();
                if (numberOfFreeSeats > 0) {
                    show.setNumberOfSeats(numberOfFreeSeats + 1);
                    return true;
                }
            }
        }
        return false;
    }
}
