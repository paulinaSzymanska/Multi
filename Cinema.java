public class Cinema {
    private final String name;
    private Show show;
    private final Repertoire repertoire;

    public Cinema(String name, Repertoire repertoire) {
        this.name = name;
        this.repertoire = repertoire;
    }

    public void checkRepertoire() {
        repertoire.printCurrentRepertoire();
    }

    public Repertoire getRepertoire() {
        return repertoire;
    }
}
