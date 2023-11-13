/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.codingquiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class rekomendasiWisata {

    /**
     * @param args the command line arguments
     * rumus yang di gunakan 
     * Total Biaya=(Biaya Transportasi PP+
     * (Biaya Akomodasi×d"hari")+
     * (Biaya Wisata Kuliner ×d"hari")+
     * Biaya Aktivitas Wisata Tambahan)×p"banyak orang"
     */
    public static void recommendDestination(int p, int d, int b) {
        // Data destinasi dan biaya
        Map<String, Map<String, Integer>> destinations = new HashMap<>();
        destinations.put("Lombok", createDestination(2170000, 125000, 75000, 250000));
        destinations.put("Bangkok", createDestination(3780000, 155000, 55000, 300000));
        destinations.put("Singapura", createDestination(1200000, 170000, 85000, 360000));
        destinations.put("Tokyo", createDestination(4760000, 170000, 105000, 325000));

        String closestDestination = null;
        int minDifference = Integer.MAX_VALUE;

        for (Map.Entry<String, Map<String, Integer>> entry : destinations.entrySet()) {
            String destination = entry.getKey();
            Map<String, Integer> costs = entry.getValue();

            int totalCost = (costs.get("transportation") + (costs.get("accommodation") * d) +
                    (costs.get("culinary") * d) + costs.get("additional")) * p;

            int remainingBudget = b - totalCost;

            if (remainingBudget >= 0 && remainingBudget < minDifference) {
                minDifference = remainingBudget;
                closestDestination = destination;
            }
        }

        if (closestDestination != null) {
            System.out.println(closestDestination + " " + (b - minDifference));
        } else {
            System.out.println("Need more budget");
        }
    }

    private static Map<String, Integer> createDestination(int transportation, int accommodation, int culinary, int additional) {
        Map<String, Integer> destination = new HashMap<>();
        destination.put("transportation", transportation);
        destination.put("accommodation", accommodation);
        destination.put("culinary", culinary);
        destination.put("additional", additional);
        return destination;
    }

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        // Rekomendasi destinasi
        recommendDestination(p, d, b);
    }
}