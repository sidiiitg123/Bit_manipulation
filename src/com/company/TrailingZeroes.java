package com.company;

public class TrailingZeroes {

    public int solve(int A) {

        int i=0,count=0;
        while(i<32){
            if((A & (1<<i))==0){
                count++;
            }else{
                break;
            }
            i++;
        }
        return count;
    }
}
