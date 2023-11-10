/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic3;
import java.util.Scanner;
/**
 *
 * @author elin <_.arifaah>
 */
public class kelipatan3dan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        //System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        int hasil = cekKelipatan(bilangan);
        System.out.println(hasil);

    }

    public static int cekKelipatan(int number) {
        if (number % 3 == 0 && number % 4 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
