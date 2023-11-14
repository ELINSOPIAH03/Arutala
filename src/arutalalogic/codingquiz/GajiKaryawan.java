/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kotaCabang = scanner.nextLine().trim().toLowerCase();
        String posisiJabatan = scanner.nextLine().trim().toLowerCase();
        int lamaBekerja = scanner.nextInt();
        boolean statusMenikah = scanner.nextBoolean();

        hitungGajiKaryawan(kotaCabang, posisiJabatan, lamaBekerja, statusMenikah);
    }

    public static void hitungGajiKaryawan(String kotaCabang, String posisiJabatan, int lamaBekerja, boolean statusMenikah) {
        int umkGarut = 1961085;
        int umkBandung = 3742276;
        int umkJakarta = 4453935;
        int umkBekasi = 4782935;
        int umkBogor = 4330249;
        int umkPalembang = 3289409;

        int gajiPokok = 0;

        switch (posisiJabatan) {
            case "admin":
                if (lamaBekerja < 2) {
                    gajiPokok = umkByCity(kotaCabang);
                } else {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 1.2);
                }
                break;
            case "coordinator":
                if (lamaBekerja < 3) {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 1.1);
                } else {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 1.3);
                }
                break;
            case "spv":
                if (lamaBekerja < 2) {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 1.25);
                } else if (lamaBekerja >= 2 && lamaBekerja <= 4) {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 1.4);
                } else {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 1.5);
                }
                break;
            case "sprinter":
                gajiPokok = (int) (umkByCity(kotaCabang) * 0.9);
                break;
            case "officer":
                gajiPokok = umkByCity(kotaCabang);
                break;
            case "manager":
                if (lamaBekerja < 3) {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 1.5);
                } else {
                    gajiPokok = (int) (umkByCity(kotaCabang) * 2);
                }
                break;
            default:
                System.out.println("Posisi jabatan tidak valid.");
                System.exit(0);
        }

        int tunjanganKeluarga = statusMenikah ? (int) (gajiPokok * 0.1) : 0;
        int tunjanganJabatan = lamaBekerja > 4 ? (int) (gajiPokok * 0.05) : 0;
        int tunjanganPegawai = tunjanganByPosition(posisiJabatan);

        int gajiKotor = gajiPokok + tunjanganKeluarga + tunjanganJabatan + tunjanganPegawai;

        int potonganPensiun = (int) (gajiKotor * 0.02);
        int potonganBPJS = (int) (gajiKotor * 0.02);
        int potonganPPH = (int) (gajiKotor * 0.05);

        int gajiBersih = gajiKotor - potonganPensiun - potonganBPJS - potonganPPH;

        System.out.println(gajiPokok);
        System.out.println(tunjanganKeluarga);
        System.out.println(tunjanganJabatan);
        System.out.println(tunjanganPegawai);
        System.out.println(gajiKotor);
        System.out.println(potonganPensiun);
        System.out.println(potonganBPJS);
        System.out.println(potonganPPH);
        System.out.println(gajiBersih);
    }

    public static int umkByCity(String kotaCabang) {
        switch (kotaCabang) {
            case "garut":
                return 1961085;
            case "bandung":
                return 3742276;
            case "jakarta":
                return 4453935;
            case "bekasi":
                return 4782935;
            case "bogor":
                return 4330249;
            case "palembang":
                return 3289409;
            default:
                System.out.println("Kota cabang tidak valid.");
                System.exit(0);
                return 0;
        }
    }

    public static int tunjanganByPosition(String posisiJabatan) {
        switch (posisiJabatan) {
            case "admin":
                return 200000;
            case "coordinator":
                return 500000;
            case "spv":
                return 700000;
            case "manager":
                return 1000000;
            case "sprinter":
            case "officer":
                return 200000;
            default:
                System.out.println("Posisi jabatan tidak valid.");
                System.exit(0);
                return 0;
        }
    }
}