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
public class PrimaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca 10 bilangan bulat dari input
        int[] arrayPrima = new int[10];
        for (int i = 0; i < 10; i++) {
            do {
                arrayPrima[i] = scanner.nextInt();
                
                if (arrayPrima[i] < 0 || arrayPrima[i] > 32750) {
                    System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0 dan 32.750.");
                }
            } while (arrayPrima[i] < 0 || arrayPrima[i] > 32750);
        }
        // Menghitung jumlah bilangan prima dalam array
        int countPrimes = countPrimesInArray(arrayPrima);

        // Menampilkan hasil
        System.out.println(countPrimes);

        scanner.close();
    }

    // Fungsi untuk menghitung jumlah bilangan prima dalam array
    private static int countPrimesInArray(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    // Fungsi untuk memeriksa apakah sebuah bilangan adalah bilangan prima
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
