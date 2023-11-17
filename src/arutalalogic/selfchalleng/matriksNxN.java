/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.selfchalleng;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class matriksNxN {

    /**
     * @param args the command line arguments
     */
    public static void cetakMatriksIdentitas(int N) {
        // Perulangan untuk baris
        for (int i = 0; i < N; i++) {
            // Perulangan untuk kolom
            for (int j = 0; j < N; j++) {
                // Jika indeks baris sama dengan indeks kolom, cetak 1, selain itu cetak 0
                System.out.print((i == j) ? "1" : "0");

                // Jika ini bukan elemen terakhir dalam baris, cetak spasi
                if (j < N - 1) {
//                    System.out.print(" ");
                }
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Menerima input bilangan bulat positif N
        System.out.print("Masukkan bilangan bulat positif N (1 s.d 7): ");
        int N = scanner.nextInt();
        if (N < 1 || N > 7) {
            System.out.println("Nilai N harus antara 1 sampai 7");
        }

        // Mencetak matriks identitas berukuran N x N
        cetakMatriksIdentitas(N);
    }
    
}
