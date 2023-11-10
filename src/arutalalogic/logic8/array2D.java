/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic8;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.next().charAt(0);
            }
        }

        // Cek apakah ada huruf vokal
        boolean isVokal = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 'a' || array[i][j] == 'i' || array[i][j] == 'u' || array[i][j] == 'e' || array[i][j] == 'o' || array[i][j] == 'A' || array[i][j] == 'I' || array[i][j] == 'U' || array[i][j] == 'E' || array[i][j] == 'O') {
                    isVokal = true;
                    break;
                }
            }
        }

        // Output
        if (!isVokal) {
            System.out.println("tidak ada huruf vokal");
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == 'a' || array[i][j] == 'i' || array[i][j] == 'u' || array[i][j] == 'e' || array[i][j] == 'o'|| array[i][j] == 'A' || array[i][j] == 'I' || array[i][j] == 'U' || array[i][j] == 'E' || array[i][j] == 'O') {
                        System.out.println(array[i][j] + ": (" + (i+1) + "," + (j+1) + ")");
                    }
                }
            }
        }
    }
}
