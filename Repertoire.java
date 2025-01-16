import java.util.List;
import java.util.Map;

public record Repertoire(Map<Integer, List<Show>> shows) {

    public void printCurrentRepertoire() {
        for (Integer i : shows.keySet()) {
            System.out.println("Repertoire for day: " + i);
            System.out.println(shows.get(i));
        }
    }
}
