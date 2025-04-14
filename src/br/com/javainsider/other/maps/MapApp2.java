package br.com.javainsider.other.maps;

import java.util.*;


public class MapApp2 {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new LinkedHashMap<>();
        scoreMap.put("Player A", 300);
        scoreMap.put("Player B", 500);
        scoreMap.put("Player C", 200);
        scoreMap.put("Player D", 700);

        Set<String> keys = scoreMap.keySet();

        for(String key : keys) {
            System.out.println(key);
        }

        Collection<Integer> values = scoreMap.values();

        for (Integer value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String, Integer>> entries =  scoreMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.format("%s ===> %d\n", entry.getKey(), entry.getValue());
        }

    }
}
