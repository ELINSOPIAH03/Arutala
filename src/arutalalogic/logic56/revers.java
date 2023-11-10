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
public class revers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        String teks = scanner.nextLine();

        char[] arrayTeks = teks.toCharArray();

        int awal = 0;
        int akhir = arrayTeks.length - 1;

        while (awal < akhir) {
            char temp = arrayTeks[awal];
            arrayTeks[awal] = arrayTeks[akhir];
            arrayTeks[akhir] = temp;

            awal++;
            akhir--;
        }

        System.out.println(new String(arrayTeks));
    }
    
}
