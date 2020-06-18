package com.javalesson.oop;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 1, 4, 5, 6, 6);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.printf("Iterator: %d \t", iterator.next());
        }
        System.out.println("\n");
        while (iterator.hasPrevious()) {
            System.out.printf("Iterator: %d \t", iterator.previous());
        }

        list.sort(null);

        list.forEach(x -> {
            if (x % 2 == 0) System.out.println(x);
            else System.out.println("");
        });
        list.forEach(System.out::println);


        
        Map<String, String> map = new HashMap<>();
        map.put("One", "Колбаса");
        map.put("Two", "Сыр");
        map.put("Three", "Хлеб");
        map.put("Four", "Помидорка");

        map.forEach((x, y) -> System.out.printf("%s : %s \n", x, y));

        map.remove("Four");
        System.out.println("___________________");
        map.forEach((x, y) -> System.out.printf("%s : %s \n", x, y));
        System.out.println("___________________");
        map.computeIfAbsent("Four", x -> "Огурец");
        map.forEach((x, y) -> System.out.printf("%s : %s \n", x, y));
        System.out.println("___________________");
        System.out.println(map.getOrDefault("Five", "Not found"));
        System.out.println("___________________");
        map.values().forEach(x -> getCheese(x));
        System.out.println("___________________");
        System.out.println(map.keySet());
        System.out.println("___________________");
        System.out.println(map.entrySet().stream().filter(y -> y.getKey().equals("One")).count());
    }


    public static void getCheese(String x) {
        if (x.equals("Сыр")) {
            System.out.println("Cheeese");
        }
        System.out.println("Not Found");
    }
}
