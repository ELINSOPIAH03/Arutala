/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic7;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class luasNLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double R = scanner.nextDouble();
        int N = scanner.nextInt();
        
//        double r = 2;
//        int n = 1;

        double luasNLingkaran = hitungLuasNLingkaran(R, N);

        System.out.printf("%.2f",luasNLingkaran);
    }
    
    public static double hitungLuasNLingkaran(double R, int N) {
    // Validasi input
    if (N == 1 || R == 1) {
        double luasLingkaran = 3.14 * R * R;
        double luasNLingkaran = luasLingkaran * N;
        // Format output
        return (luasNLingkaran);
    }
    if (R < 0 || R > 100) {
        System.out.println("Jari-jari harus lebih besar dari 0 dan kurang dari atau sama dengan 100");
    }

    if (N < 0 || N > 50) {
        System.out.println("Jumlah lingkaran harus lebih besar dari 0 dan kurang dari atau sama dengan 50");
    }

    // Hitung luas N-lingkaran
    double luasLingkaran = 3.14 * R * R;
    double luasNLingkaran = luasLingkaran * N;
    // Format output
    return Math.round(luasNLingkaran);
}
    
}