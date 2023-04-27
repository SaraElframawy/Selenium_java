package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        List<Integer> numbers = List.of(1,6,3,6,326,34,54);
        List<Integer> filtereslist = numbers.stream().filter(x -> x %2 ==0).toList();
        System.out.println(filtereslist);
        //alternaitve
        List<Integer> filterList2 = new ArrayList<>();
        for (int i = 0; i<numbers.size();i++){
            if(numbers.get(i)%2==0){filterList2.add(numbers.get(i));
            }


        } System.out.println(filterList2);
    }
}