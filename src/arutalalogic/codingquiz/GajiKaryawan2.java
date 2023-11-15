/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class GajiKaryawan2 {

    /**
     * @param args the command line arguments
     */
    private static final int[][] GAJI_POKOK = {
            {8000000, 9000000, 7500000, 7200000, 8500000},  // Software Engineer
            {7000000, 8000000, 6500000, 6200000, 7500000},  // Data Analyst
            {7500000, 8500000, 7000000, 6800000, 8000000},  // UX Designer
            {10000000, 11000000, 9500000, 9200000, 10500000},  // Project Manager
            {7500000, 8500000, 7000000, 6800000, 8000000}   // QA Engineer
    };

    private static final int[] TUNJANGAN_TRANSPORT = {1000000, 1500000, 1200000, 1100000, 1300000};

    private static final int TUNJANGAN_MAKAN_PER_HARI = 50000;
    private static final double TUNJANGAN_KESEHATAN_PERCENTAGE = 0.02;
    private static final double POTONGAN_BPJS_PERCENTAGE = 0.03;
    private static final double POTONGAN_PPH_PERCENTAGE = 0.05;
    private static final int DAYS_IN_MONTH = 22;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
//        System.out.println("Masukkan Posisi karyawan:");
        String posisi = scanner.nextLine();

//        System.out.println("Masukkan Divisi karyawan:");
        String divisi = scanner.nextLine();

        // Hitung gaji bersih
        int totalHariKerja = DAYS_IN_MONTH;
        double gajiBersih = calculateGajiBersih(posisi, divisi, totalHariKerja);

        // Output
        System.out.println(posisi);
        System.out.println(divisi);
        System.out.println(totalHariKerja + " hari");
        System.out.println(formatCurrency(gajiBersih));
    }

    private static String formatCurrency(double amount) {
        DecimalFormat currencyFormatter = new DecimalFormat("###,###,##0.00");
        return currencyFormatter.format(amount);
    }

    private static double getGajiPokok(String posisi, String divisi) {
        int posisiIndex = getPositionIndex(posisi);
        int divisiIndex = getDivisionIndex(divisi);
        return GAJI_POKOK[posisiIndex][divisiIndex];
    }

    private static int getTunjanganTransport(String divisi) {
        int divisiIndex = getDivisionIndex(divisi);
        return TUNJANGAN_TRANSPORT[divisiIndex];
    }

    private static double calculateTunjanganKesehatan(double gajiPokok) {
        return gajiPokok * TUNJANGAN_KESEHATAN_PERCENTAGE;
    }

    private static double calculatePotonganBPJS(double gajiPokok) {
        return gajiPokok * POTONGAN_BPJS_PERCENTAGE;
    }

    private static double calculatePotonganPPH(double gajiPokok) {
        return gajiPokok * POTONGAN_PPH_PERCENTAGE;
    }

    private static double calculateGajiBersih(String posisi, String divisi, int totalHariKerja) {
        double gajiPokok = getGajiPokok(posisi, divisi);
        int tunjanganTransport = getTunjanganTransport(divisi);
        int tunjanganMakan = TUNJANGAN_MAKAN_PER_HARI * totalHariKerja;
        double tunjanganKesehatan = calculateTunjanganKesehatan(gajiPokok);
        double potonganBPJS = calculatePotonganBPJS(gajiPokok);
        double potonganPPH = calculatePotonganPPH(gajiPokok);

        return gajiPokok + tunjanganTransport + tunjanganMakan + tunjanganKesehatan - potonganBPJS - potonganPPH;
    }

    private static int getPositionIndex(String posisi) {
        switch (posisi.toLowerCase()) {
            case "software engineer":
                return 0;
            case "data analyst":
                return 1;
            case "ux designer":
                return 2;
            case "project manager":
                return 3;
            case "qa engineer":
                return 4;
            default:
                return -1;
        }
    }

    private static int getDivisionIndex(String divisi) {
        switch (divisi.toLowerCase()) {
            case "surabaya":
                return 0;
            case "jakarta":
                return 1;
            case "bandung":
                return 2;
            case "medan":
                return 3;
            case "makassar":
                return 4;
            default:
                return -1;
        }
    }
    
}
