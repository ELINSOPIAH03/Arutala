/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

/**
 *
 * @author elin <_.arifaah>
 */
public class TunjanganKeluarga {

    /**
     * @param args the command line arguments
     */
    public static int kalkulasiTunjanganKeluarga(String statusPernikahan, int gajiPokok) {
        //tunjangan keluarga status kawin (10% dari gaji pokok)
        double final_TUNJANGAN_KAWIN = 0.10;

        // tunjangan keluarga
        int result;

        // Konversi status pernikahan ke huruf kecil 
        String statusLower = statusPernikahan.toLowerCase();

        // Menentukan besaran tunjangan keluarga berdasarkan status pernikahan
        if (statusLower.equals("kawin")) {
            result = (int) (final_TUNJANGAN_KAWIN * gajiPokok);
        } else {
            result = 0;
        }

        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(kalkulasiTunjanganKeluarga("Kawin", 1000000));
        System.out.println(kalkulasiTunjanganKeluarga("kawin", 2000000));
        System.out.println(kalkulasiTunjanganKeluarga("Belum Kawin", 1000000));
    }
    
}
