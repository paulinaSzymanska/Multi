public class Cinema {
    String name;
    Show show;
    Repertoire repertoire;

    public Cinema(String name, Repertoire repertoire) {
        this.name = name;
        this.repertoire = repertoire;
    }


    public boolean checkIfShowExists(Show show) {
        return false;
    }

    public void reserveShow(Show show) {
        System.out.println("Reservating show....");
    }

    public void buyTickets(Ticket ticket) {
        System.out.println("you bought ticket " + ticket.name() + " in cinema " + name);
    }

    public void checkRepertoire() {
        repertoire.printCurrentRepertoire();
    }
}
