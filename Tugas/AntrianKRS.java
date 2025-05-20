package Tugas;

public class AntrianKRS {
    final int MAKS_DIPROSES = 30;
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahDilayani = 0;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk proses KRS.");
            return;
        }

        if (jumlahDilayani + 2 > MAKS_DIPROSES) {
            System.out.println("Batas maksimal 30 mahasiswa telah diproses oleh DPA.");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Data seluruh mahasiswa dalam antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanTerdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < Math.min(2, size); i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahSudahDiproses() {
        System.out.println("Jumlah mahasiswa yang telah melakukan KRS: " + jumlahDilayani);
    }

    public void cetakSisaMahasiswa() {
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS " + size);
    }
}

