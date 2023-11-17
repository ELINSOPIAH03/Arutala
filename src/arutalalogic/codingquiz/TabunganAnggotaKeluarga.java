/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;
import java.util.Scanner;
/**
 *
 * @author elin <_.arifaah>
 */
public class TabunganAnggotaKeluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int jumlahAnggotaKeluarga = scanner.nextInt();
            int jumlahBulan = scanner.nextInt();

            int totalTabungan = jumlahTabungan(jumlahAnggotaKeluarga, jumlahBulan);
            System.out.println(totalTabungan);
    }

    public static int jumlahTabungan(int jumlahAnggotaKeluarga, int jumlahBulan) {
        int totalAkhir = 0;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            int totalPerBulan = jumlahTabunganAnggota(bulan);
            totalAkhir += jumlahAnggotaKeluarga * totalPerBulan;
        }

        return totalAkhir;
    }

    public static int jumlahTabunganAnggota(int bulan) {
        int total = 0;
        int jumlahHari;

        switch (bulan) {
            case 1:
                jumlahHari = 31;
                break;
            case 2:
                jumlahHari = 29; // Menggunakan 28 untuk Februari
                break;
            case 3:
                jumlahHari = 31;
                break;
            case 4:
                jumlahHari = 30;
                break;
            case 5:
                jumlahHari = 31;
                break;
            case 6:
                jumlahHari = 30;
                break;
            case 7:
                jumlahHari = 31;
                break;
            case 8:
                jumlahHari = 31;
                break;
            case 9:
                jumlahHari = 30;
                break;
            case 10:
                jumlahHari = 31;
                break;
            case 11:
                jumlahHari = 30;
                break;
            case 12:
                jumlahHari = 31;
                break;
            default:
                System.out.println("Bulan tidak valid.");
                return 0;
        }

        for (int tanggal = 1; tanggal <= jumlahHari; tanggal++) {
            total += tanggal * 1000;
        }

        return total;
    }
    
}