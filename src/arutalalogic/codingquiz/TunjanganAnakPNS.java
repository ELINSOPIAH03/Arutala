/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

/**
 *
 * @author elin <_.arifaah>
 */
public class TunjanganAnakPNS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(kalkulasiTunjanganAnak(2, 1000000));
        System.out.println(kalkulasiTunjanganAnak(1, 1000000));
    }

    public static int kalkulasiTunjanganAnak(int jumlahAnak, int gajiPokok) {
        // Maksimal dua anak
        jumlahAnak = Math.min(jumlahAnak, 2);

        // Hitung tunjangan anak (2% dari gaji pokok per anak)
        int besaranTunjanganAnak = (int) (0.02 * gajiPokok * jumlahAnak);

        return besaranTunjanganAnak;
    }
    
}
