/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic10;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class sortirBuah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // Input nilai jeruk
        int[] nJeruk = new int[x];
        for (int i = 0; i < x; i++) {
            nJeruk[i] = scanner.nextInt();
        }

        // Hitung jumlah jeruk berdasarkan label
        int ekspor = 0;
        int lokal = 0;
        int krendah = 0;
        for (int i = 0; i < x; i++) {
            switch (kualitasJeruk(nJeruk[i])) {
                case "E":
                    ekspor++;
                    break;
                case "L":
                    lokal++;
                    break;
                case "R":
                    krendah++;
                    break;
            }
        }

        // Cek apakah input valid
        if (x < 1 || x > 200) {
            System.out.println("error");
            return;
        }

        // Tampilkan hasil
        if (isValid(nJeruk)) {
            System.out.println("E " + ekspor);
            System.out.println("L " + lokal);
            System.out.println("R " + krendah);
        } else {
            System.out.println("error");
        }
    }

    private static String kualitasJeruk(int nJeruk) {
        if (nJeruk >= 85 && nJeruk <= 100) {
            return "E";
        } else if (nJeruk >= 60 && nJeruk <= 84) {
            return "L";
        } else {
            return "R";
        }
    }

    private static boolean isValid(int[] nJeruk) {
        for (int i = 0; i < nJeruk.length; i++) {
            if (nJeruk[i] < 0 || nJeruk[i] > 100) {
                return false;
            }
        }
        return true;
    }
    
}
