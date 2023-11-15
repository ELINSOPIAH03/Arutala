/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

/**
 *
 * @author elin <_.arifaah>
 */
public class TunjanganBeras {

    /**
     * @param args the command line arguments
     */
    public static int kalkulasiTunjanganBeras(String statusPernikahan, int jumlahAnak) {
        // beras per kilo
        int hargaBerasPerKilo = 15000;

        // Maksimal dua anak 
        jumlahAnak = Math.min(jumlahAnak, 2);

        // Jumlah anggota keluarga (pegawai, istri/suami, dan anak-anak)
        int jumlahAnggotaKeluarga = 1 + (statusPernikahan.equals("Kawin") ? 1 : 0) + jumlahAnak;

        // Besaran tunjangan beras
        int besaranTunjanganBeras = jumlahAnggotaKeluarga * 10 * hargaBerasPerKilo;

        return besaranTunjanganBeras;
    }
    
    public static void main(String[] args) {
        System.out.println(kalkulasiTunjanganBeras("Kawin", 1));
        System.out.println(kalkulasiTunjanganBeras("Kawin", 10));
        System.out.println(kalkulasiTunjanganBeras("Belum Kawin", 0));
    }
    
}
