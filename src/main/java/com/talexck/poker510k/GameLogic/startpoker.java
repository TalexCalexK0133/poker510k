package com.talexck.poker510k.GameLogic;

import javax.swing.*;
import java.util.ArrayList;

public class startpoker {
    public static ArrayList pokers = new ArrayList<String>();
    //1-->黑桃 2-->红桃 3--->草花 4--->方块 5--->王 1-13 ---> A2345678910JQK 51--->小王 52--->大王
    public static void startpokers(){
        Integer k = 0;
        while (k<2) {
            k++;
            Integer j = 100;
            while (j <= 400) {
                Integer i = 0;
                while (i < 13) {
                    i++;
                    Integer s = i+j;
                    pokers.add(s);
                    String t = Integer.toString(s);
                }
                j = j + 100;
            }
            pokers.add(551);
            pokers.add(552);

        }
        System.out.println(pokers);
    }


}
