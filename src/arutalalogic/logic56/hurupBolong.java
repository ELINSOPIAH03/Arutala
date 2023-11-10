/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic56;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class hurupBolong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        String teks = scanner.nextLine();
        teks = teks.toUpperCase(); 

        int jumlahLubang = 0;

        for (int i = 0; i < teks.length(); i++) {
            char huruf = teks.charAt(i);

            switch (huruf) {
                case 'A':
                case 'D':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                    jumlahLubang++;
                    break;
                case 'B':
                    jumlahLubang += 2;
                    break;
            }
        }

        System.out.println(jumlahLubang);
    }
    
}
