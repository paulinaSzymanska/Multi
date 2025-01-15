import java.util.Map;

public class Repertoire {
    Map<Integer, Show> shows;

    public Repertoire(Map<Integer, Show> shows) {
        this.shows = shows;
    }

    public void printCurrentRepertoire() {
        for (Integer i : shows.keySet()) {
            System.out.println("Repertoire for day: " + i);
            System.out.println(shows.get(i));
        }
    }
}
