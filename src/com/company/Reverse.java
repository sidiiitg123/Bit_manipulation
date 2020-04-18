package com.company;

import java.util.ArrayList;

public class Reverse {

    public long reverse(long a){
        int i=0;
        long rev=0;
        while(i<32){
            rev=rev<<1;

            if((a&1)!=0){
                rev=rev|1;
            }
            a=a>>1;
            i++;
        }
        return rev;
    }
}
