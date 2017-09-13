public class Backpack {
    private static int totalPencils = 0;
    private static int totalPens = 0;
    private static int totalNotebooks = 0;

    private int pencils;
    private int pens;
    private int notebooks;

    public Backpack(int pencils, int pens, int notebooks) {
        this.pencils = pencils;
        this.pens = pens;
        this.notebooks = notebooks;

        totalPencils += pencils;
        totalPens += pens;
        totalNotebooks += notebooks;
    }

    public static int getTotalPencils() {
        return totalPencils;
    }

    public static int getTotalPens() {
        return totalPens;
    }

    public static int getTotalNotebooks() {
        return totalNotebooks;
    }
}
