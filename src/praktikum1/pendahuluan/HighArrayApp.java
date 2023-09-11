package praktikum1.pendahuluan;

public class HighArrayApp {// awal class
    public static void main(String[] args) { // main method dari class tersebut
        int maxSize = 100; // deklarasi int maxsize dengan value 100
        HighArray arr; // deklarasi object dari HighArray
        arr = new HighArray(maxSize);// inisiasi object arr dengan contructornya
        // impelementasi fungsi penambahan element array
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);
        // implementasi fungsi menampilkan element array
        arr.display();

        int key = 25;// deklarasi integer key dengan value 25
        // kondisi dari fungsi find()
        if (arr.find(key)) {// implementasi fungsi find()
            System.out.println(key +
                    " ditemukan");
        } else {// hasil dari kondisi fungsi find()
            System.out.println(key +
                    " tidak ditemukan");
        }

        // implementasi fungsi delete()
        arr.delete(00);
        arr.delete(80);
        arr.delete(55);

        // implementasi fungsi display()
        arr.display();

        // ....code dari HighClassApp
        System.out.println(arr.size());
    }
}
