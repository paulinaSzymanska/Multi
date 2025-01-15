public class Reservation {
    //rezerwacja miejsc

    public void reserveShow(Cinema cinema, Show show) {
        if (cinema.checkIfShowExists(show)) {
            cinema.reserveShow(show);
        }
    }
}
