/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arutalalogic.logic7;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author elin <_.arifaah>
 */
public class hurufAlay {

    /**
     * @param args the command line arguments
     */
    private static final HashMap<Character, Character> replacementMap = new HashMap<>();

    static {
        replacementMap.put('a', '4');
        replacementMap.put('i', '1');
        replacementMap.put('z', '2');
        replacementMap.put('e', '3');
        replacementMap.put('g', '6');
        replacementMap.put('j', '7');
        replacementMap.put('b', '8');
        
        replacementMap.put('A', '4');
        replacementMap.put('I', '1');
        replacementMap.put('Z', '2');
        replacementMap.put('E', '3');
        replacementMap.put('G', '6');
        replacementMap.put('J', '7');
        replacementMap.put('B', '8');
    }
    public static String translateToAlay(String sentence) {
        StringBuilder alaySentence = new StringBuilder();
        for (char character : sentence.toCharArray()) {
            if (replacementMap.containsKey(character)) {
                alaySentence.append(replacementMap.get(character));
            } else {
                alaySentence.append(character);
            }
        }
        return alaySentence.toString();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String alaySentence = translateToAlay(sentence);
        System.out.println(alaySentence);
    }
    
}
