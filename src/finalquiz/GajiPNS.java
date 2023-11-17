/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalquiz;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 * Created By : Elin Sopiah
 * Created At : 12.03 Kamis, 16 November 2023
 */
public class GajiPNS {

    /**
     * @param args the command line arguments
     */
    private String nama;
    private int golonganPangkat;
    private String tipeGolongan;
    private int masaKerja;
    private String statusPernikahan;
    private int jumlahAnak;
    
    // Data tabel gaji pokok berdasarkan golongan, masa kerja, dan ruang kerja
    private static final double[][][] GAJI_POKOK = {
            // Golongan I
            {
                {1560800, 1560800, 1560800, 1560800},  // Masa Kerja 0
                {1560800, 1560800, 1560800, 1560800},  // Masa Kerja 1
                {1610000, 1610000, 1610000, 1610000},  // Masa Kerja 2
                {1610000, 1704500, 1776600, 1851800},   // Masa Kerja 3
                {1660700, 1704500, 1776600, 1851800},
                {1660700, 1758200, 1832600, 1910100},
                {1713000, 1758200, 1832600, 1910100},
                {1713000, 1813600, 1890300, 1970200},
                {1766900, 1813600, 1890300, 1970200},
                {1766900, 1870700, 1949800, 2032300},
                {1822600, 1870700, 1949800, 2032300},
                {1822600, 1929600, 2011200, 2096300},
                {1880000, 1929600, 2011200, 2096300},
                {1880000, 1990400, 2074600, 2162300},
                {1939200, 1990400, 2074600, 2162300},
                {1939200, 2053100, 2139900, 2230400},
                {2000300, 2053100, 2139900, 2230400},
                {2000300, 2117700, 2207300, 2300700},
                {2063300, 2117700, 2207300, 2300700},
                {2063300, 2184400, 2276800, 2373100},
                {2128300, 2184400, 2276800, 2373100},
                {2128300, 2253200, 2348500, 2447900},
                {2195300, 2253200, 2348500, 2447900},
                {2195300, 2324200, 2422500, 2525000},
                {2264400, 2324200, 2422500, 2525000},
                {2264400, 2397400, 2498800, 2604500},
                {2335800, 2397400, 2498800, 2604500},
                {2335800, 2472900, 2557500, 2686500},
            },
            // Golongan II
            {
                {2022200, 2022200, 2022200, 2022200},
                {2054100, 2054100, 2054100, 2054100},
                {2054100, 2054100, 2054100, 2054100},
                {2118800, 2208400, 2301800, 2399200},
                {2118800, 2208400, 2301800, 2399200},
                {2185500, 2277900, 2374300, 2474700},
                {2185500, 2277900, 2374300, 2474700},
                {2254300, 2349700, 2449100, 2552700},
                {2254300, 2349700, 2449100, 2552700},
                {2325300, 2423700, 2526200, 2633100},
                {2325300, 2423700, 2526200, 2633100},
                {2398600, 2500000, 2605800, 2716000},
                {2398600, 2500000, 2605800, 2716000},
                {2474100, 2578800, 2687800, 2801500},
                {2474100, 2578800, 2687800, 2801500},
                {2552000, 2660000, 2772500, 2889800},
                {2552000, 2660000, 2772500, 2889800},
                {2632400, 2743800, 2859800, 2980800},
                {2632400, 2743800, 2859800, 2980800},
                {2715300, 2830200, 2949900, 3074700},
                {2715300, 2830200, 2949900, 3074700},
                {2800800, 2919300, 3042800, 3171500},
                {2800800, 2919300, 3042800, 3171500},
                {2889100, 3011200, 3138600, 3271400},

            },
            // Golongan III
            {
                {2579400, 2688500, 2802300, 2920800},
                {2579400, 2688500, 2802300, 2920800},
                {2660700, 2773200, 2890500, 3012800},
                {2660700, 2773200, 2890500, 3012800},
                {2744500, 2860500, 2981500, 3107700},
                {2744500, 2860500, 2981500, 3107700},
                {2830900, 2950600, 3075500, 3205500},
                {2830900, 2950600, 3075500, 3205500},
                {2920100, 3043600, 3172300, 3306500},
                {2920100, 3043600, 3172300, 3306500},
                {3012000, 3139400, 3272200, 3410600},
                {3012000, 3139400, 3272200, 3410600},
                {3106900, 3238300, 3375300, 3518100},
                {3106900, 3238300, 3375300, 3518100},
                {3204700, 3340300, 3481600, 3628900},
                {3204700, 3340300, 3481600, 3628900},
                {3305700, 3445500, 3591200, 3743100},
                {3305700, 3445500, 3591200, 3743100},
                {3409800, 3554000, 3704300, 3861000},
                {3409800, 3554000, 3704300, 3861000},
                {3517200, 3665900, 3821000, 3982600},
                {3517200, 3665900, 3821000, 3982600},
                {3627900, 3781400, 3941400, 4108100},
                {3627900, 3781400, 3941400, 4108100},
                {3742200, 3900500, 4065500, 4237500},
                {3742200, 3900500, 4065500, 4237500},
                {3860100, 4023300, 4193500, 4370900},
                {3860100, 4023300, 4193500, 4370900},
                {3981600, 4150100, 4325600, 4508600},
                {3981600, 4150100, 4325600, 4508600},
                {4107000, 4280800, 4461800, 4650600},
                {4107000, 4280800, 4461800, 4650600},
                {4236400, 4415600, 4602400, 4797000},
            },
            // Golongan IV
            {
                {3044300, 3173100, 3307300, 3447200, 3593100},
                {3044300, 3173100, 3307300, 3447200, 3593100},
                {3140200, 3272100, 3411500, 3555800, 3706200},
                {3140200, 3272100, 3411500, 3555800, 3706200},
                {3239100, 3376100, 3518900, 3667800, 3822900},
                {3239100, 3376100, 3518900, 3667800, 3822900},
                {3341100, 3482500, 3629800, 3783300, 3943300},
                {3341100, 3482500, 3629800, 3783300, 3943300},
                {3446400, 3592100, 3744100, 3902500, 4067500},
                {3446400, 3592100, 3744100, 3902500, 4067500},
                {3554900, 3705300, 3862000, 4025400, 4195700},
                {3554900, 3705300, 3862000, 4025400, 4195700},
                {3666900, 3822000, 3983600, 4152200, 4327800},
                {3666900, 3822000, 3983600, 4152200, 4327800},
                {3782400, 3942400, 4109100, 4282900, 4462100},
                {3782400, 3942400, 4109100, 4282900, 4462100},
                {3901500, 4066500, 4238500, 4417800, 4604700},
                {3901500, 4066500, 4238500, 4417800, 4604700},
                {4024400, 4194600, 4372000, 4557000, 4749700},
                {4024400, 4194600, 4372000, 4557000, 4749700},
                {4151100, 4326700, 4509700, 4700500, 4899300},
                {4151100, 4326700, 4509700, 4700500, 4899300},
                {4281800, 4463000, 4651800, 4848500, 5053600},
                {4281800, 4463000, 4651800, 4848500, 5053600},
                {4416700, 4603500, 4798300, 5001200, 5212800},
                {4416700, 4603500, 4798300, 5001200, 5212800},
                {4555800, 4748500, 4949400, 5158700, 5377000},
                {4555800, 4748500, 4949400, 5158700, 5377000},
                {4699300, 4898100, 5105300, 5321200, 5546300},
                {4699300, 4898100, 5105300, 5321200, 5546300},
                {4847300, 5052300, 5266100, 5488800, 5721000},
                {4847300, 5052300, 5266100, 5488800, 5721000},
                {5000000, 5211500, 5431900, 5661700, 5901200},
            }
    };

    public GajiPNS(String nama, int golonganPangkat, String tipeGolongan, int masaKerja, String statusPernikahan, int jumlahAnak) {
        this.nama = nama;
        this.golonganPangkat = golonganPangkat;
        this.tipeGolongan = tipeGolongan;
        this.masaKerja = Math.min(masaKerja, 27);  // Maksimal masa kerja adalah 27 tahun
        this.statusPernikahan = statusPernikahan;
        this.jumlahAnak = Math.min(jumlahAnak, 2);  // Maksimal dua anak
    }

    public double kalkulasiGajiPokok() {
        int indexGolongan = golonganPangkat - 1;  // Golongan dimulai dari 1, array dimulai dari 0
        int indexMasaKerja = Math.min(masaKerja, GAJI_POKOK[indexGolongan].length - 1);  // Ambil masa kerja paling akhir jika melebihi tabel

        return GAJI_POKOK[indexGolongan][indexMasaKerja][getIndexRuangKerja(tipeGolongan)];
    }
    private static int getIndexRuangKerja(String tipeGolongan) {
        switch (tipeGolongan) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            default:
                throw new IllegalArgumentException("Tipe golongan tidak valid: " + tipeGolongan);
        }
    }

    public double kalkulasiTunjanganKeluarga() {
        // Implementasi kalkulasi tunjangan keluarga
        double tunjanganKeluarga = 0;

        if (statusPernikahan.equalsIgnoreCase("1")) {
            tunjanganKeluarga = 0.1 * kalkulasiGajiPokok();
        }

        return tunjanganKeluarga;
    }

    public double kalkulasiTunjanganAnak() {
        // Implementasi kalkulasi tunjangan anak
        double tunjanganAnak = 0.02 * kalkulasiGajiPokok() * jumlahAnak;

        return tunjanganAnak;
    }

    public double kalkulasiTunjanganBeras() {
        // Implementasi kalkulasi tunjangan beras
            int jumlahAnakUntukTunjangan = Math.min(2, jumlahAnak);
            int isKawin = (statusPernikahan.equalsIgnoreCase("1")) ? 2 : 1;

            double tunjanganBeras = 15000 * 10 * (isKawin + jumlahAnakUntukTunjangan);

            return tunjanganBeras;
    }

    public double kalkulasiTunjanganUmumJabatan() {
        // Implementasi kalkulasi tunjangan umum jabatan
        double tunjanganUmumJabatan = 0;

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
        }

        return tunjanganUmumJabatan;
    }

    public double kalkulasiGajiKotor() {
        // Implementasi kalkulasi gaji kotor
        double gajiKotor = kalkulasiGajiPokok() + kalkulasiTunjanganKeluarga() +
                kalkulasiTunjanganAnak() + kalkulasiTunjanganBeras() + kalkulasiTunjanganUmumJabatan();

        return gajiKotor;
    }

    public double kalkulasiPotonganPPH() {
        // Implementasi kalkulasi potongan PPH
//        double biayaJabatan = 0.05 * kalkulasiGajiKotor();
//        double iuranPensiun = 0.0475 * (kalkulasiGajiPokok() + kalkulasiTunjanganKeluarga() + kalkulasiTunjanganAnak());
//        double ptkpDiriSendiri = 36000000;
//        double ptkpPasangan = 3000000;
//        double ptkpAnak = 3000000 * 3;
//        double ptkp = ptkpDiriSendiri + ptkpPasangan + ptkpAnak;
//        double pkp = kalkulasiGajiKotor() - biayaJabatan - iuranPensiun - ptkp;
//
//        if (pkp <= 0) {
//            return 0;
//        }
//
//        double tarifPph = 0.05;  // Contoh tarif PPH, bisa disesuaikan dengan peraturan yang berlaku
//        double potonganPph = tarifPph * pkp;
//
//        return potonganPph;
        if (kalkulasiGajiKotor() > 4500000){
            double biayaJabatan = 0.05 * kalkulasiGajiKotor();
            double iuranPensiun = 0.0475 * (kalkulasiGajiPokok() + kalkulasiTunjanganKeluarga() + kalkulasiTunjanganAnak());

            // Menyesuaikan PTKP berdasarkan status pernikahan
            double ptkpPasangan = 0;
            double ptkpAnak = 0;

            if (statusPernikahan.equalsIgnoreCase("1")) {
                ptkpPasangan = 3000000;
            }

        //    int jumlahAnakAnak = getJumlahAnak();
            if (jumlahAnak > 3) {
                jumlahAnak = 3;
            }
            ptkpAnak = 3000000 * jumlahAnak;

            double ptkpDiriSendiri = 36000000;
            double ptkp = ptkpDiriSendiri + ptkpPasangan + ptkpAnak;
            double bruto = kalkulasiGajiKotor();
            //System.out.println("bruto"+bruto);
            double neto1thn = (bruto - (biayaJabatan+iuranPensiun))*12;
            //System.out.println("neto1thn"+neto1thn);
            double penghasilanKenaPajak = neto1thn - ptkp;
            //System.out.println("penghasilanKenaPajak"+penghasilanKenaPajak);
            double pphDisetahunkan = 0.05*penghasilanKenaPajak;
            //System.out.println("pphDisetahunkan"+pphDisetahunkan);
            double pphSebulan = pphDisetahunkan/12;
            //double pkp = kalkulasiGajiKotor() - biayaJabatan - iuranPensiun - ptkp;

    //    if (pkp <= 0) {
    //        return 0;
    //    }
    //
    //    double tarifPph = 0.05;  // Contoh tarif PPH, bisa disesuaikan dengan peraturan yang berlaku
    //    double potonganPph = tarifPph * pkp;

            return pphSebulan;
        }
            return 0;
    }

    public double kalkulasiPotonganIWP() {
        // Implementasi kalkulasi potongan IWP
        double potonganIWP = 0.1 * (kalkulasiGajiPokok() + kalkulasiTunjanganAnak() + kalkulasiTunjanganKeluarga());

        return potonganIWP;
    }

    public double kalkulasiPotonganTaperum() {
        // Implementasi kalkulasi potongan taperum
        double potonganTaperum = 0;

        switch (golonganPangkat) {
            case 1:
                potonganTaperum = 3000;
                break;
            case 2:
                potonganTaperum = 5000;
                break;
            case 3:
                potonganTaperum = 7000;
                break;
            case 4:
                potonganTaperum = 10000;
                break;
        }

        return potonganTaperum;
    }

    public double kalkulasiGajiBersih() {
        // Implementasi kalkulasi gaji bersih
        double gajiBersih = kalkulasiGajiKotor() - kalkulasiPotonganPPH() - kalkulasiPotonganIWP() - kalkulasiPotonganTaperum();

        return gajiBersih;
    }
    private static String formatCurrency(double amount) {
        DecimalFormat currencyFormatter = new DecimalFormat("###,###,##0.00");
        return currencyFormatter.format(amount);
    }
    public void displayOutput() {
        // Implementasi tampilan output sesuai dengan kebutuhan
        System.out.println("\nNama PNS          : " + nama);
        System.out.println("Gaji Pokok        : " + formatCurrency(kalkulasiGajiPokok()));
        System.out.println("Tunjangan Keluarga: " + formatCurrency(kalkulasiTunjanganKeluarga()));
        System.out.println("Tunjangan Anak    : " + formatCurrency(kalkulasiTunjanganAnak()));
        System.out.println("Tunjangan Beras   : " + formatCurrency(kalkulasiTunjanganBeras()));
        System.out.println("Tunjangan Jabatan : " + formatCurrency(kalkulasiTunjanganUmumJabatan()));
        System.out.println("Gaji Bruto        : " + formatCurrency(kalkulasiGajiKotor()));
        System.out.println("Potongan PPH 21   : " + formatCurrency(kalkulasiPotonganPPH()));
        System.out.println("Potongan IWP      : " + formatCurrency(kalkulasiPotonganIWP()));
        System.out.println("Potongan Taperum  : " + formatCurrency(kalkulasiPotonganTaperum()));
        System.out.println("Gaji Take Home Pay: " + formatCurrency(kalkulasiGajiBersih()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Pegawai: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Golongan Pangkat (1-4): ");
        int golonganPangkat = scanner.nextInt();
        
        if (golonganPangkat < 1 || golonganPangkat > 4) {
            System.out.println("Golongan pangkat harus antara 1 sampai 4");
        }
        
        switch(golonganPangkat){
            case 1:
            case 2:
            case 3:
                System.out.print("Masukkan Golongan Ruang Kerja (A, B, C, D): ");
                break;
            case 4:
                System.out.print("Masukkan Golongan Ruang Kerja (A, B, C, D, E): ");
                break;
//                String tipeGolongan = scanner.next().toUpperCase();           
        }
//        String tipeGolongan = scanner.next().toUpperCase();
//        System.out.print("Masukkan Golongan Ruang Kerja (A, B, C, D, E): ");
        String tipeGolongan = scanner.next().toUpperCase();
        

        System.out.print("Masukkan Masa Kerja: ");
        int masaKerja = scanner.nextInt();

        System.out.print("Masukkan Status Pernikahan (0 = Belum Kawin, 1 = Kawin, 2 = Cerai): ");
        String statusPernikahan = scanner.next();

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = scanner.nextInt();

        GajiPNS pegawai = new GajiPNS(nama, golonganPangkat, tipeGolongan, masaKerja, statusPernikahan, jumlahAnak);
        pegawai.displayOutput();
    }
}
