package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class MinXor {
    public int findMinXor(ArrayList<Integer> A) {

        Collections.sort(A);

        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            int temp = A.get(i) ^ A.get(i+1);
            if(temp < min){
                min = temp;
            }
        }

        return min;
    }
}
