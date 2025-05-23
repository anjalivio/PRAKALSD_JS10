package Pertemuan12;
import java.util.Scanner;

public class SLLMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList04 sll = new SingleLinkedList04();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa04 mhs = new Mahasiswa04(nim, nama, kelas, ipk);
            if (i == 0) {
                sll.addFirst(mhs);
            } else {
                sll.addLast(mhs);
            }
        }
        System.out.println("\nDaftar Mahasiswa:");
        sll.print();

        System.out.println("data index 1 :");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
