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
public class bilBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner= new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a < -30 || a > 30) {
            System.out.println("bilangan harus di antara -30 sampai 30");
        }
        if (b < -30 || b > 30) {
            System.out.println("bilangan harus di antara -30 sampai 30");
        }
        if (c < -30 || c > 30) {
            System.out.println("bilangan harus di antara -30 sampai 30");
        }
        
        int bilanganTerbesar = a;
        if (b > bilanganTerbesar) {
            bilanganTerbesar = b;
        }
        if (c > bilanganTerbesar) {
            bilanganTerbesar = c;
        }
        
        System.out.println(bilanganTerbesar);
    }
    
}
