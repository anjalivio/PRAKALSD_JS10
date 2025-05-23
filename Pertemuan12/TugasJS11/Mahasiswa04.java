package Pertemuan12.TugasJS11;

public class Mahasiswa04 {
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa04(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInfo() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Keperluan: " + keperluan);
    }
}

