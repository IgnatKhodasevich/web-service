package org.example.webservice;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortImpl implements SortAlgorithm {

    public int[] sort(int[] numbers){
        // sorting...
        System.out.println(4);
        return numbers;
    }
}
