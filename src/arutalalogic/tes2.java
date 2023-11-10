/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class tes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan suhu benda:");
        double suhu = scanner.nextDouble();

        // Menentukan wujud benda berdasarkan suhunya
        if (suhu >= 0 && suhu <= 100) {
            System.out.println("berwujud cair");
        } else {
            System.out.println("berwujud non cair");
        }
    }
    
}
