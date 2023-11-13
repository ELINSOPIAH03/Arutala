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
public class yudisium {

    /**
     * @param args the command line arguments
     */
    private static final int NILAI_A = 4;
    private static final int NILAI_B = 3;
    private static final int NILAI_C = 2;
    private static final int NILAI_D = 1;
    private static final int NILAI_E = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMataKuliah = scanner.nextInt();

        // Inisialisasi variabel
        int totalNilai = 0;
        boolean adaNilaiE = false;

        // Membaca input nilai mata kuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            char nilai = scanner.next().charAt(0);

            // Hitung total nilai
            totalNilai += getNilaiHuruf(nilai);

            // Cek apakah ada nilai E
            if (nilai == 'E') {
                adaNilaiE = true;
            }
        }

        // Hitung IPK
        float ipk = (float) totalNilai / jumlahMataKuliah;

        // Tentukan yudisium
        String yudisium;
        if (adaNilaiE || ipk < 2) {
            yudisium = "Pending";
        } else if (ipk >= 3.5) {
            yudisium = "Cum Laude";
        } else if (ipk >= 2.75) {
            yudisium = "Sangat Memuaskan";
        } else {
            yudisium = "Memuaskan";
        }

        // Cetak yudisium
        System.out.println(yudisium);
    }

    private static int getNilaiHuruf(char nilai) {
        switch (nilai) {
            case 'A':
                return NILAI_A;
            case 'B':
                return NILAI_B;
            case 'C':
                return NILAI_C;
            case 'D':
                return NILAI_D;
            case 'E':
                return NILAI_E;
            default:
                throw new IllegalArgumentException("Nilai huruf tidak valid");
        }
    }
}
