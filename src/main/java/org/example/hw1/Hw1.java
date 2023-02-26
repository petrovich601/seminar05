package org.example.hw1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Hw1 {
    public static void main(String[] args) {
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
            //            if (!mapCh.containsKey(str.charAt(i))) {
            //                mapCh.put(str.charAt(i), 1);
            //            } else {
            //                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
            //            }
            //            }
        }
        for (var entry : mapS.entrySet()) {
            System.out.println("'" + entry.getKey() + "'" + " встретилась: " + entry.getValue() + " раз(а)");
        }
    }
}


