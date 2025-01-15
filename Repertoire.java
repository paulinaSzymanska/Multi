import java.util.HashMap;
import java.util.Map;

public class Repertoire {
    Map<Integer, Show> shows = new HashMap<>();

    public Repertoire(Map<Integer, Show> shows) {
        this.shows = shows;
    }

    public void printCurrentRepertoire() {
        for (Integer i : shows.keySet()) {

        }
    }
}
