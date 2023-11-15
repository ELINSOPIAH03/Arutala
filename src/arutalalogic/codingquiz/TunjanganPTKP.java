/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

/**
 *
 * @author elin <_.arifaah>
 */
public class TunjanganPTKP {

    /**
     * @param args the command line arguments
     */
    public static int kalkulasiPTKP(String statusPernikahan, int jumlahAnak) {
        // PTKP untuk pegawai (diri sendiri)
        int ptkpPegawai = 36000000;

        // PTKP untuk istri/suami 
        int ptkpIstriSuami = statusPernikahan.equals("Kawin") ? 3000000 : 0;

        // Besaran PTKP untuk anak (maksimal 3 anak)
        int ptkpAnak = Math.min(jumlahAnak, 3) * 3000000;

        // PTKP untuk total anggota keluarga
        int totalPTKP = ptkpPegawai + ptkpIstriSuami + ptkpAnak;

        return totalPTKP;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(kalkulasiPTKP("Kawin", 1));
        System.out.println(kalkulasiPTKP("Belum Kawin", 0));
        System.out.println(kalkulasiPTKP("Cerai", 2));
    }
    
}
