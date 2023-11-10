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
public class volTabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.print("Masukkan jari-jari tabung: ");
        double R = scan.nextDouble();

//        System.out.print("Masukkan tinggi tabung: ");
        double t = scan.nextDouble();
        
        if (validasiInput(R, t)) {
            double V = calculateVolume(R, t);
            String hasil=String.format("%.2f", V);
            System.out.println(hasil);
           
        }else {
            System.out.println("Input tidak valid.  R dan t tidak boleh kurang dari 0 dan lebih dari 100");
        }
    }
    public static double calculateVolume(double R, double t) {
        final double phi = 3.14;
        return phi * Math.pow(R, 2) * t;
    }
    public static boolean validasiInput(double R, double t) {
        return (R >= 0 && R <= 100) && (t >= 0 && t <= 100);
    }
}
