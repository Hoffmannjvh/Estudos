package br.com.javainsider.other.api;

public class ExCache {

    public static void main(String[] args) {

        Cache cache = new Cache();
        System.out.println(cache.get("House"));
        System.out.println(cache.get("House"));
        System.out.println(cache.get("House"));
        System.out.println(cache.get("House"));

        System.out.println(cache.get("Room"));
        System.out.println(cache.get("Room"));
        System.out.println(cache.get("Room"));
    }

}
