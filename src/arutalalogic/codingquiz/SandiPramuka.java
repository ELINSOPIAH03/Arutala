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
public class SandiPramuka {

    /**
     * @param args the command line arguments
     */
   private static final String[] sandiHuruf = {
            "1", "2", "3", "4", "5", "6", "7",
            "11", "22", "33", "44", "55", "66", "77",
            "111", "222", "333", "444", "555", "666", "777",
    };
    private static String input;
    private static int getSandiNumber(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'B':
                return 11;
            case 'C':
                return 111;
            case 'D':
                return 1111;
            case 'E':
                return 2;
            case 'F':
                return 22;
            case 'G':
                return 222;
            case 'H':
                return 2222;
            case 'I':
                return 3;
            case 'J':
                return 33;
            case 'K':
                return 333;
            case 'L':
                return 3333;
            case 'M':
                return 4;
            case 'N':
                return 44;
            case 'O':
                return 444;
            case 'P':
                return 4444;
            case 'Q':
                return 5;
            case 'R':
                return 55;
            case 'S':
                return 555;
            case 'T':
                return 5555;
            case 'U':
                return 6;
            case 'V':
                return 66;
            case 'W':
                return 666;
            case 'X':
                return 6666;
            case 'Y':
                return 7;
            case 'Z':
                return 77;
            case ' ':
                return 0;
            default:
                return -1;
        }
    }

    private static int getCount(char c) {
        int count = 1;
        char prev = c;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == prev) {
                count++;
            } else {
                break;
            }
            prev = input.charAt(i);
        }
        return count;
    }

    private static int[] encodeToSandi(String input) {
        int[] sandi = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            sandi[i] = getSandiNumber(input.charAt(i));
        }
        return sandi;
    }

    private static String generateSandiString(int[] sandi) {
        StringBuilder sandiString = new StringBuilder();

        for (int i = 0; i < sandi.length; i++) {
            sandiString.append(sandi[i]);

            if (i < sandi.length - 1) {
                String currentCode = Integer.toString(sandi[i]);
                String nextCode = Integer.toString(sandi[i + 1]);

                if (currentCode.endsWith(nextCode.substring(0, 1))) {
                    sandiString.append("-");
                }
            }
        }
        return sandiString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().toUpperCase();
        int[] sandi = encodeToSandi(input);
        String sandiString = generateSandiString(sandi);
        System.out.println(sandiString);
    }
}