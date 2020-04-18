package com.company;

import java.util.List;

public class SingleNumber2 {

    public int singleNumber(final List<Integer> A) {
        int i = 0;
        int res = 0;

        while (i < 32) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {
                if (((A.get(j)) & (1 << i)) != 0) {
                    count++;
                }
            }
            res += ((count % 3) << i);
            i++;

        }
        return res;


    }
}
