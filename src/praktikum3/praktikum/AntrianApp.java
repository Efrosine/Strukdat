package praktikum3.praktikum;

public class AntrianApp {
    public static void main(String[] args) {
        String people[] = { "Andi", "Ahmad", "Satrio", "Afrizal", "Sukron", "Mahmud" };
        Queue theQueue = new Queue(4);

        System.out.println(">> beberapa mulai mengantri");
        for (String person : people) {
            if (theQueue.isFull()) {
                System.out.println("Maaf " + person + ", antrian masih penuh");
            } else {
                theQueue.insert(person);
                System.out.println(person + " masuk antrian");
            }
        }

        System.out.println("\n>>isi antrian");
        theQueue.getAntrian();

        while (!theQueue.isEmpty()) {
            System.out.println(theQueue.remove() + " Keluar Antrian");
            theQueue.getAntrian();
            System.out.println();
        }

        System.out.println("Antrian Kosong");
        System.out.println(theQueue.size() + " Person");
        theQueue.getAntrian();

    }
}