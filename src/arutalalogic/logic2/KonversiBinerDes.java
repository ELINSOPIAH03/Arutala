/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic2;

import java.util.Scanner;

/**
 *
 * @author elin
 */
public class KonversiBinerDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bilangan biner: ");
        String bilanganBiner = scan.next();

        int bilanganDesimal = konversiBinerKeDesimal(bilanganBiner);
        System.out.println(bilanganDesimal);
    }
    public static int konversiBinerKeDesimal(String bilanganBiner) {
        int bilanganDesimal = 0;

        int panjang = bilanganBiner.length();
        for (int i = panjang - 1; i >= 0; i--) {
            char digit = bilanganBiner.charAt(i);
            if (digit == '1') {
                bilanganDesimal += Math.pow(2, panjang - 1 - i);
            }
        }
        return bilanganDesimal;
    }
}
    
