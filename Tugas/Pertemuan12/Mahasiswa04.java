package Tugas.Pertemuan12;

public class Mahasiswa04 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa04(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi() {
        System.out.printf("\nNama  : %-10s NIM  : %-10s Kelas : %-10s IPK : %-10s", nama, nim, kelas, ipk);
        System.out.println();
    }
}
