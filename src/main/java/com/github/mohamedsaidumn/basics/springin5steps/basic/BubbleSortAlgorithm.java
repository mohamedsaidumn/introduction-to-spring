package com.github.mohamedsaidumn.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Qualifier("bubble")
@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Logic for Bubble Sort
        return numbers;
    }
}