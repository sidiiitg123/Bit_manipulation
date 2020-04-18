package com.company;

public class NoOfOneBit {
    public int numSetBits(long a) {

        int count=0;
        while(a!=0){
            if((a&1)!=0){
                count++;
                a=a>>1;
            }else{
                a=a>>1;
            }
        }
        return count;
    }
}
