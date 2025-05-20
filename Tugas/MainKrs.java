package Tugas;

import java.util.Scanner;

public class MainKrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN PERSUTUJUAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Mahasiswa Paling Belakang");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah yang Sudah Diproses");
            System.out.println("11. Cetak Sisa Mahasiswa Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanTerdepan();
                    break;
                case 5:
                    antrian.tampilkanBelakang();
                    break;
                case 6:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 7:
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh.");
                    } else {
                        System.out.println("Antrian masih tersedia.");
                    }
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    antrian.cetakJumlahAntrian();
                    break;
                case 10:
                    antrian.cetakJumlahSudahDiproses();
                    break;
                case 11:
                    antrian.cetakSisaMahasiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}

