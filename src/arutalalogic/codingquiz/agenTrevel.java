/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class agenTrevel {

    /**
     * @param args the command line arguments
     */
    private static final Bus[] BUS_LIST = {
        new Bus(60, 2300000),
        new Bus(45, 2000000),
        new Bus(32, 1800000),
        new Bus(18, 1500000),
        new Bus(12, 1300000)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0 || n > 120) {
            System.out.println("n harus antara 0 dan 120");
            return;
        }

        Bus[] rekomendasi = cariRekomendasi(n);
        if(n==60){
            System.out.println(rekomendasi[0].getHarga());
        }
        else if (n > 60) {
            Bus[] duaBus = Arrays.copyOf(BUS_LIST, 2);
            System.out.println(totalHarga(duaBus));
        } else if (rekomendasi.length == 1) {
            System.out.println(rekomendasi[0].getHarga());
        } else {
            System.out.println(rekomendasi[0].getHarga());
        }
//        masih terdapat bug ketika input 120 hasilnya harus nya 4600000 maslah 4300000
    }

    private static Bus[] cariRekomendasi(int n) {
        List<Bus> rekomendasi = new ArrayList<>();

        for (Bus bus : BUS_LIST) {
            if (bus.getKapasitas() >= n) {
                rekomendasi.add(bus);
            }
        }

        rekomendasi.sort(Comparator.comparingInt(Bus::getHarga));

        return rekomendasi.toArray(new Bus[0]);
    }

    private static int totalHarga(Bus[] buses) {
        int total = 0;
        for (Bus bus : buses) {
            total += bus.getHarga();
        }
        return total;
    }

    private static class Bus {
        private int kapasitas;
        private int harga;

        public Bus(int kapasitas, int harga) {
            this.kapasitas = kapasitas;
            this.harga = harga;
        }

        public int getKapasitas() {
            return kapasitas;
        }

        public int getHarga() {
            return harga;
        }
    }
}