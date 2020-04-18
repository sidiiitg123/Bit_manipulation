package com.company;

import java.util.ArrayList;

public class DiffBitSum {
    public int cntBits(ArrayList<Integer> A) {
        final int M = (int) 1e9+7;

        long sum = 0;

        for(int i=0;i<=31;i++){
            long count = 0;
            for(int j=0;j<A.size();j++){
                if(((A.get(j))&(1<<i))!=0){
                    count++;
                }
            }

            sum = (sum + 2L*count*(A.size()-count))%M;
            sum  = sum%M;
        }
        return (int)sum%M;
    }
}
