package materi4;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();

        theList.insertFirst(10);
        theList.insertFirst(20);
        theList.insertFirst(30);
        theList.insertFirst(40);
        theList.displayList();

        Link aLink = theList.deteleFirst();
        System.out.print("Deleted ");
        aLink.displayLink();
        System.out.println("");

        theList.displayList();

        Link f = theList.find(30);
        if (f != null) {
            System.out.println("ketemu... " + f.Data);
        } else {
            System.out.println("link tidak ditemukan");
        }

        if (theList.insert(20, 25)) {
            System.out.println("Penambahan berhasil");
        } else {
            System.out.println("Penambahan gagal");
        }
        theList.displayList();

        Link d = theList.delete(25);
        if (d != null) {
            System.out.println("hapus link dengan key " + d.Data);
        } else {
            System.out.println("link tidak ditemukan");
        }
        theList.displayList();
    }
}
