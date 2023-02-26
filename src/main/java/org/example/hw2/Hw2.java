package org.example.hw2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * 2) Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом)
 */

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isk = scanner.nextLine();
        Map<String, Integer> mapS = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        System.out.println(str);
        String charsToRemove = ".—";
        for (char c : charsToRemove.toCharArray()) {
            str = str.replace(String.valueOf(c), "");
        }
        str = str.replaceAll("\\s+", " ");
        str = str.toLowerCase();
        int le = 0;
        String[] arr = str.split(" ");
        for ( String ignored : arr) {
            le += 1;
        }
        for (int i = 0; i < le; i++) {
            mapS.putIfAbsent(arr[i], 0);
            mapS.put(arr[i], mapS.get(arr[i]) + 1);
        }
        System.out.println("'" + isk + "'" + " встретилась: " + mapS.get(isk) + " раз(а)");
    }
}
