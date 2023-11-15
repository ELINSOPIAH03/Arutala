/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

/**
 *
 * @author elin <_.arifaah>
 */
public class TunjanganUmumJabatan {

    /**
     * @param args the command line arguments
     */
    public static int kalkulasiTunjanganUmumJabatan(int golonganPangkat) {
        // Besaran tunjangan umum jabatan berdasarkan golongan pangkat
        int tunjanganUmumJabatan;

        // Menentukan besaran tunjangan umum jabatan berdasarkan golongan pangkat
        switch (golonganPangkat) {
            case 1:
                tunjanganUmumJabatan = 175000;
                break;
            case 2:
                tunjanganUmumJabatan = 180000;
                break;
            case 3:
                tunjanganUmumJabatan = 185000;
                break;
            case 4:
                tunjanganUmumJabatan = 190000;
                break;
            default:
                tunjanganUmumJabatan = 0; // Golongan pangkat tidak valid
        }

        return tunjanganUmumJabatan;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(kalkulasiTunjanganUmumJabatan(1));
        System.out.println(kalkulasiTunjanganUmumJabatan(2));
        System.out.println(kalkulasiTunjanganUmumJabatan(3));
    }
    
}
