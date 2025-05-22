package Tugas.Pertemuan12;

public class SLLMain04 {
    public static void main(String[] args) {
        SingleLinkedList04 sll = new SingleLinkedList04();

        Mahasiswa04 mhs1 = new Mahasiswa04("21212203", "Dirga", "4D", 3.6);
        Mahasiswa04 mhs2 = new Mahasiswa04("23212201", "Bimon", "2B", 3.8);
        Mahasiswa04 mhs3 = new Mahasiswa04("22212202", "Cintia", "3C", 3.5);
        Mahasiswa04 mhs4 = new Mahasiswa04("24212200", "Alvaro", "1A", 4.0);

        sll.print(); // Kosong

        sll.addFirst(mhs1); // Dirga
        sll.print();

        sll.addLast(mhs4); // Alvaro
        sll.print();

        sll.insertAfter("Dirga", mhs3); // Cintia
        sll.insertArt(2, mhs2); // Bimon
        sll.print();
    }
}
