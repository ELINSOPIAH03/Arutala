/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class konversiKeRomawi {

    /**
     * @param args the command line arguments
     */
    private static final Map<Integer, String> SIMBOL_ANGKA_ROMAWI = new HashMap<>();

    static {
        SIMBOL_ANGKA_ROMAWI.put(1, "I");
        SIMBOL_ANGKA_ROMAWI.put(4, "IV");
        SIMBOL_ANGKA_ROMAWI.put(5, "V");
        SIMBOL_ANGKA_ROMAWI.put(9, "IX");
        SIMBOL_ANGKA_ROMAWI.put(10, "X");
        SIMBOL_ANGKA_ROMAWI.put(40, "XL");
        SIMBOL_ANGKA_ROMAWI.put(50, "L");
        SIMBOL_ANGKA_ROMAWI.put(90, "XC");
        SIMBOL_ANGKA_ROMAWI.put(100, "C");
        SIMBOL_ANGKA_ROMAWI.put(400, "CD");
        SIMBOL_ANGKA_ROMAWI.put(500, "D");
        SIMBOL_ANGKA_ROMAWI.put(900, "CM");
        SIMBOL_ANGKA_ROMAWI.put(1000, "M");
    }

    public static String konversi(int angka) {
        if (angka < 1 || angka > 3999) {
            return "angka harus antara 1 dan 3999";
        }

        StringBuilder stringAngkaRomawi = new StringBuilder();

        // Mengurutkan simbol-simbol dari yang terbesar ke terkecil
        Integer[] simbol = SIMBOL_ANGKA_ROMAWI.keySet().toArray(new Integer[0]);
        Arrays.sort(simbol, Comparator.reverseOrder());

        for (int key : simbol) {
            while (angka >= key) {
                stringAngkaRomawi.append(SIMBOL_ANGKA_ROMAWI.get(key));
                angka -= key;
            }
        }

        return stringAngkaRomawi.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input: ");
        int angka = scanner.nextInt();

        System.out.println(konversi(angka));
    }
}