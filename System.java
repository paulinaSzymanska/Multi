import java.util.ArrayList;
import java.util.List;

public class System {
    List<Cinema> cinemas = new ArrayList<>();

    public void addCinema(Cinema cinema) {
        cinemas.add(cinema);
    }

    public void removeCinema(Cinema cinema) {
        cinemas.remove(cinema);
    }
}