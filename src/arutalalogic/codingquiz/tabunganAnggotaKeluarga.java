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
public class tabunganAnggotaKeluarga {

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        if(m < 1 || m > 6){
            System.out.println("n harus diantara 1 sampai 6");
        }
        if(n < 1 || n > 12){
            System.out.println("n harus diantara 1 sampai 12 tidak boleh lebih dari 1 tahun");
        }
        
        
        //deklarasi itungan bulan ganjil genap kabisat
        int x = 1;
        int y = 31;
        int z = 30;
        int b = 1;
        
        // Menghitung total tabungan
        //n(n + 1) / 2
        if(n%2 == 1){
            int hasil = ((y*(y+1)/2)*m)*n-2;
            System.out.println(hasil);
        }else{
            int hasil = ((z*(z+1)/2)*m)*n-2;
            System.out.println(hasil);
        }
        
        
        
//        long totalSavings = m * calculateTotalDeret() * n;

        // Output
//        System.out.println(totalSavings);
    }

//    private static long calculateTotalDeret() {
//        int a = 1; // suku pertama
//        int n = 31; // jumlah suku
//        int d = 1; // beda suku-suku berturut-turut
//
//        return (long) (n / 2.0) * (2 * a + (n - 1) * d); 
//    }
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if(m < 1 || m > 6){
            System.out.println("n harus diantara 1 sampai 6");
        }
        if(n < 1 || n > 12){
            System.out.println("n harus diantara 1 sampai 12 tidak boleh lebih dari 1 tahun");
        }
        
        int totalTabungan = jumlahTabungan(m, n);

        System.out.println(totalTabungan);
    }

    public static int jumlahTabungan(int m, int n) {
        int totalAkhir = 0;

        for (int bulan = 1; bulan <= n; bulan++) {
            int totalPerBulan = jumlahTabunganAnggota(bulan);
            totalAkhir += m * totalPerBulan;
        }

        return totalAkhir;
    }

    public static int jumlahTabunganAnggota(int bulan) {
        int total = 0;

        for (int tanggal = 1; tanggal <= (bulan == 2 ? 29 : (bulan % 2 == 1 ? 31 : 30)); tanggal++) {
            total += tanggal * 1000;
        }

        return total;
    }
    
}
