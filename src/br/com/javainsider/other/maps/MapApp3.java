package br.com.javainsider.other.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapApp3 {

    public static void main(String[] args) {

        Map<Name, Integer> map = new TreeMap<>();
        map.put(new Name("Joao", "Oliveira"), 35);
        map.put(new Name("Maria", "Silva"), 22);
        map.put(new Name("Celso", "Cerqueira"), 43);
        map.put(new Name("Celso", "Cerqueira"), 43);

        System.out.println(map);

    }

}
