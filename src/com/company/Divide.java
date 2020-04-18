package com.company;

public class Divide {
    public int divide(int A, int B) {
        long sign=0;
        if((A<0 && B >0)|| (A>0 && B <0) ){
            sign=-1;
        }else if((A>0 && B>0)||(A<0 && B<0)){
            sign =1;
        }
        long divident=Math.abs(Long.valueOf(A));
        long divisor=Math.abs(Long.valueOf(B));

        long quotient=0;

        while(divident>=divisor){
            divident-=divisor;
            quotient++;
        }
        quotient*=sign;
        if(quotient>Integer.MAX_VALUE || quotient<Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        return (int) quotient;

    }
}
