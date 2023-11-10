/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic4;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class konversiCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input suhu dalam satuan Celcius
        System.out.print("Masukkan suhu dalam satuan Celcius: ");
        double suhuCelcius = input.nextDouble();

        // Periksa validitas input
        if (suhuCelcius < -100 || suhuCelcius > 100) {
            System.out.println("Suhu dalam Celcius harus antara -100 dan 100");
            return;
        }

        // Konversi suhu ke Fahrenheit
        double suhuFahrenheit = suhuCelcius * 1.8 + 32;

        // Output suhu dalam satuan Fahrenheit
        System.out.printf("%.2f\n", suhuFahrenheit);
    }
    
}
