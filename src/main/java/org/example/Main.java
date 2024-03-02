package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       long streamDeStrings = Stream.of("Antonio", "Juan","Maria")
             //  .filter(s -> s.contains("t"));
         //.map(s -> s.toUpperCase());
               .count();

        Arrays.asList();
        // Stream<String>streamDelista = lista.stream();

        //List<String>lista = streamDeStrings.collect(Collectors.toList());
        System.out.println(streamDeStrings);
    }
}