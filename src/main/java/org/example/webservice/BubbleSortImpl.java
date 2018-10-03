package org.example.webservice;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortImpl implements SortAlgorithm {

    public int[] sort(int[] numbers){
        // sorting...
        System.out.println(3);
        return numbers;
    }
}
