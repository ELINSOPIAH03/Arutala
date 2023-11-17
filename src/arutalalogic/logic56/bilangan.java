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
public class bilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        if ((X < 0 ||  X > 100)||(Y < 0 || Y > 100)) {
            System.out.println("X dan Y harus antara 0 dan 100");
            return;
        }
        // Menampilkan bilangan bulat dari X hingga Y
        for (int i = X; i <= Y; i++) {
            System.out.print(i+"\n");
        }
    }
}
