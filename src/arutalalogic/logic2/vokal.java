/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class vokal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.print("Masukkan sebuah karakter: ");
        char karakter = scan.next().charAt(0);

        boolean isVokal = cekHurufVokal(karakter);
        System.out.println(isVokal);

        scan.close();
    }
     public static boolean cekHurufVokal(char karakter) {
        karakter = Character.toLowerCase(karakter); // Ubah karakter menjadi huruf kecil

        // Mengecek apakah karakter adalah huruf vokal
        return karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u';
    }
   }
