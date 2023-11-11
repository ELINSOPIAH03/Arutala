/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class konversiDetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int detik = scanner.nextInt();
        // detik ke hari
        int hari = detik / (24 * 60 * 60);
        //detik yang tersisa ke jam
        int jam = (detik % (24 * 60 * 60)) / (60 * 60);
        //detik yang tersisa ke menit
        int menit = (detik % (60 * 60)) / 60;
        //detik yang tersisa ke detik
        int detikSisa = detik % 60;

        // Tampilkan hasil
        System.out.println(hari);
        System.out.println(jam);
        System.out.println(menit);
        System.out.println(detikSisa);
    }
    
}
