import java.util.Random;

public class Show {
    private final String show;
    private final ShowType showType;
    private final int numberOfRoom;
    private int numberOfSeats;

    public Show(String show, ShowType showType, int numberOfSeats) {
        this.show = show;
        this.showType = showType;
        this.numberOfSeats = numberOfSeats;
        Random random = new Random();
        this.numberOfRoom = random.nextInt(1, 111);
    }

    public String getShow() {
        return show;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    @Override
    public String toString() {
        return "Show{" +
                "shows=" + show +
                ", showType=" + showType +
                '}';
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
