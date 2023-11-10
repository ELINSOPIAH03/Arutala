/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic3;
import java.util.Scanner;
/**
 *
 * @author elin <_.arifaah>
 */
public class perbandingan3persegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input rasio sisi dan sisi persegi pertama
//        System.out.print("Masukkan rasio sisi R1 R2 R3 dan sisi S : ");
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int r3 = input.nextInt();
        double s = input.nextDouble();

        // Periksa validitas input
        if (r1 < 1 || r1 > 100) {
            System.out.println("Rasio sisi R1 harus antara 1 dan 100");
            return;
        }
        if (r2 < 1 || r2 > 100) {
            System.out.println("Rasio sisi R2 harus antara 1 dan 100");
            return;
        }
        if (r3 < 1 || r3 > 100) {
            System.out.println("Rasio sisi R3 harus antara 1 dan 100");
            return;
        }if (s < 0 || s > 100) {
            System.out.println("Rasio sisi s harus antara 1 dan 100");
            return;
        }

        // Hitung sisi-sisi lainnya
        double s2 = s * r2 / r1;
        double s3 = s * r3 / r1;

        // Hitung luas masing-masing persegi
        double luas1 = s * s;
        double luas2 = s2 * s2;
        double luas3 = s3 * s3;

        // Hitung total luas
        double totalLuas = luas1 + luas2 + luas3;

        // Output hasil
        System.out.printf("%.2f\n", totalLuas);

    }
}
