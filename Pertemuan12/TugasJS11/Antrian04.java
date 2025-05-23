package Pertemuan12.TugasJS11;
public class Antrian04 {
        class Node {
        Mahasiswa04 data;
        Node next;

        Node(Mahasiswa04 mhs) {
            this.data = mhs;
            this.next = null;
        }
    }
    private Node front, rear;
    private int size = 0;
    private final int MAX = 10; 

    public boolean isEmpty() {
        return front == null;
    }
    public boolean isFull() {
        return size == MAX;
    }
    public void enqueue(Mahasiswa04 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh.");
            return;
        }
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
        } else {
            System.out.print("Memanggil mahasiswa: ");
            front.data.tampilInfo();
            front = front.next;
            size--;
            if (front == null) rear = null; 
        }
    }
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        Node current = front;
        while (current != null) {
            current.data.tampilInfo();
            current = current.next;
        }
    }
    public void tampilDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilInfo();
            System.out.print("Mahasiswa terakhir : ");
            rear.data.tampilInfo();
        }
    }
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
    public int getSize() {
        return size;
    }
}
