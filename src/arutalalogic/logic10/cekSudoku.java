/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

        if (isValidRow(x) && isValidRow(y) && isValidRow(z) && isValidColumn(x, y, z)) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }

    private static boolean isValidRow(int[] row) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : row) {
            if (!uniqueNumbers.add(num)) {
                return false; // Ada duplikat dalam satu baris
            }
        }
        return true;
    }

    private static boolean isValidColumn(int[] x, int[] y, int[] z) {
        for (int i = 0; i < x.length; i++) {
            Set<Integer> uniqueNumbers = new HashSet<>();
            if (!uniqueNumbers.add(x[i]) || !uniqueNumbers.add(y[i]) || !uniqueNumbers.add(z[i])) {
                return false; // Ada duplikat dalam satu kolom
            }
        }
        return true;
    }
}