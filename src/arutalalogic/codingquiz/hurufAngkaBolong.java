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
public class hurufAngkaBolong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        String teks = scanner.nextLine();
        teks = teks; 

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
                case 'a':
                case 'd':
                case 'o':
                case 'p':
                case 'q':
                case 'b':
                case '6':
                case '9':
                case '0':
                case 'e':
                case 'g':
                case '4':
                    jumlahLubang++;
                    break;
                case 'B':
                case '8':
                    jumlahLubang += 2;
                    break;
            }
        }

        System.out.println(jumlahLubang);
    }
    
}
