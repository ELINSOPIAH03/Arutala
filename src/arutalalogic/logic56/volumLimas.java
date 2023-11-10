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
public class volumLimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double P = scanner.nextDouble();
        double L = scanner.nextDouble();
        double T = scanner.nextDouble();
        
        if ((P < 0 ||  P > 20)||(L < 0 || L > 20)||(T < 0 || T > 20)) {
            System.out.println("P L T harus antara 0 dan 20");
            return;
        }
        
        double V = P*L*T/3;
        System.out.printf("%.6f\n", V);
    }
    
}
