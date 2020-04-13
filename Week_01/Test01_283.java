package com.we_smart.meshlamp.utils;

public class Test01_283 {

    public void test(int[] array) {
        int index = 0;
        for (int x = 0 ; x < array.length - 1 ; x++) {
            if (array[ x ] == 0) {
                index++;
                for (int t = x ; t < array.length - index - 1 ; t++) {
                    array[ t ] = array[ t + 1 ];
                    continue;
                }
                array[ array.length - index - 1 ] = 0;
            }
            for (int y = x + 1 ; y < array.length - index ; y++) {
                if (array[ x ] > array[ y ]) {
                    int temp = array[ x ];
                    array[ x ] = array[ y ];
                    array[ y ] = temp;
                }
            }
        }
    }
}
