/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class cekSudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] y = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] z = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for (int i = 0; i < 3; i++) {
            int[] baris = new int[]{x[i], y[i], z[i]};
            Arrays.sort(baris);
            for (int j = 0; j < 2; j++) {
                if (baris[j] == baris[j + 1]) {
                    System.out.println("tidak valid");
                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            int[] kolom = new int[]{x[i], y[i], z[i]};
            Arrays.sort(kolom);
            for (int j = 0; j < 2; j++) {
                if (kolom[j] == kolom[j + 1]) {
                    System.out.println("tidak valid");
                    return;
                }
            }
        }
        System.out.println("valid");
    }
    
}
