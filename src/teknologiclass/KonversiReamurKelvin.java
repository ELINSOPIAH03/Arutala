/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teknologiclass;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class KonversiReamurKelvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);

        // Input suhu dalam satuan Celcius
        System.out.print("Masukkan suhu dalam satuan Reamur: ");
        double suhuReamur = input.nextDouble();

        // Periksa validitas input
        if (suhuReamur < -100 || suhuReamur > 100) {
            System.out.println("Suhu dalam Celcius harus antara -100 dan 100");
            return;
        }

        double suhuKelvin = suhuReamur * 1.25 + 273;

        System.out.printf("%.2f\n", suhuKelvin);
    }
    
}
