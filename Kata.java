package org.example;

import static java.lang.Math.floor;

public class Kata {
    public static String datingRange(int age) {
        //return min-max
        int min = 0;
        int max = 0;


        if (age <= 14) {        //in case your are younger than 14
            double minD = (double) min;
            double maxD = (double) max;


            minD = floor((age - (0.10 * age)));
            maxD = floor((age + (0.10 * age)));

            min = (int) minD;
            max = (int) maxD;

        } else {                //in other cases

        double minD = (double) min;
        double maxD = (double) max;

        minD = floor(((age/2)+7));
        maxD = floor(((age-7)*2));

        min = (int) minD;
        max = (int) maxD;

    }
        String idealAge = min + "-" + max;

        return idealAge;
    }

}
