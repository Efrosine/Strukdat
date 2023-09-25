package praktikum4.pendahuluan;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList();

        while (!theList.isEmpty()) {
            Link aLink = theList.deteleFirst();

            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();

        theList.insertFirst(33);
        theList.insertFirst(55);
        theList.insertFirst(77);
        theList.insertFirst(88);
        theList.displayList();

        Link f = theList.find(77);
        if (f != null) {
            System.out.println("ketemu... " + f.Data);
        } else {
            System.out.println("link tidak ditemukan");
        }

        Link d = theList.delete(88);
        if (d != null) {
            System.out.println("hapus link dengan key " + d.Data);
        } else {
            System.out.println("link tidak ditemukan");
        }
        theList.displayList();
    }
}
