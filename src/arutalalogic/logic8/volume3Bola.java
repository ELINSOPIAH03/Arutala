/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic8;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class volume3Bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int R1 = scanner.nextInt();
        int R2 = scanner.nextInt();
        int R3 = scanner.nextInt();
        double r = scanner.nextDouble();

        // Hitung jari-jari bola kedua dan ketiga
        double R2r = r * R2 / R1;
        double R3r = r * R3 / R1;

        // Hitung volume masing-masing bola
        double V1 = (4.0 / 3.0) * 3.14 * r * r * r;
        double V2 = (4.0 / 3.0) * 3.14 * R2r * R2r * R2r;
        double V3 = (4.0 / 3.0) * 3.14 * R3r * R3r * R3r;

        // Hitung jumlah volume
        double jumlahVolume = V1 + V2 + V3;

        // Output jumlah volume
        System.out.printf("%.2f\n", jumlahVolume);
    }
}