package com.company;

import java.util.ArrayList;

public class XORSubArrayAndResult {

    public int solve(ArrayList<Integer> A) {
        if(A.size()%2==0){
            return 0;
        }
        int result=0;
        for(int i=0;i<A.size();i+=2){
            result=result^A.get(i);
        }
        return result;
    }
}
