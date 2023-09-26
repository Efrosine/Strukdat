package praktikum4.praktikum;

public class Record {
    int id;
    String nama;

    public Record(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "{ " + id + ", " + nama + " }";
    }

}
