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
public class RhythmGame {

    /**
     * @param args the command line arguments
     */
    //menghitung skor berdasarkan jumlah ketepatan
    public static int calculateScore(int perfectCount, int greatCount, int goodCount, int missCount) {
        int totalScore = (perfectCount * 100) + (greatCount * 80) + (goodCount * 60) + (missCount * 0);
        return totalScore;
    }

    //menghitung total maksimal skor yang bisa dicapai pada lagu tertentu
    public static int calculateTotalMaxScore(int maxPerfect, int maxGreat, int maxGood) {
        return (maxPerfect * 100) + (maxGreat * 80) + (maxGood * 60);
    }

    // peringkat berdasarkan persentase skor
    public static String getRank(double percentage) {
        if (percentage >= 90) {
            return "S (Super)";
        } else if (percentage >= 80) {
            return "A (Amazing)";
        } else if (percentage >= 70) {
            return "B (Brilliant)";
        } else if (percentage >= 60) {
            return "C (Cool)";
        } else {
            return "D (Decent)";
        }
    }

    //menampilkan hasil perhitungan skor dan peringkat pemain
    public static void printResult(String playerName, int totalScore, int totalMaxScore, String rank) {
        System.out.println(totalScore);
        System.out.println(playerName + " peringkat " + rank);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        // Input jumlah poin "Perfect", "Great", "Good", dan "Miss"
        int perfectCount = scanner.nextInt();
        int greatCount = scanner.nextInt();
        int goodCount = scanner.nextInt();
        int missCount = scanner.nextInt();

        // Hitung skor
        int totalScore = calculateScore(perfectCount, greatCount, goodCount, missCount);
        int totalMaxScore = calculateTotalMaxScore(100, 0, 0);
        double percentage = (double) totalScore / totalMaxScore * 100;
        String rank = getRank(percentage);

        // Tampilkan hasil
        printResult(playerName, totalScore, totalMaxScore, rank);
    }
    
}
