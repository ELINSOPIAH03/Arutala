/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic9;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class ganjil2Darray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[][] X = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                X[i][j] = scanner.nextInt();
            }
        }

        int bil = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (X[i][j] % 2 != 0) {
                    bil++;
                }
            }
        }
        System.out.println(bil);
    }
    
}
