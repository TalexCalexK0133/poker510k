package com.talexck.poker510k.GameLogic;

import java.util.ArrayList;
import com.talexck.poker510k.GameLogic.givepoker.*;

import static com.talexck.poker510k.GameLogic.givepoker.pokers1;
import static com.talexck.poker510k.GameLogic.givepoker.pokers2;
import static com.talexck.poker510k.GameLogic.givepoker.pokers3;
import static com.talexck.poker510k.GameLogic.givepoker.pokers4;

public class showpoker {
    public static ArrayList pokered1 = new ArrayList<String>();
    public static ArrayList pokered2 = new ArrayList<String>();
    public static ArrayList pokered3 = new ArrayList<String>();
    public static ArrayList pokered4 = new ArrayList<String>();
    public static void showpokers(Integer fister, Integer condition) throws InterruptedException {
        if(condition==1){//抢台
            Integer i = 0;
            while (i < 25) {
                i++;
                pokered1.add(pokers1.get(i));
                Thread.sleep(1000);
                pokered2.add(pokers2.get(i));
                Thread.sleep(1000);
                pokered3.add(pokers3.get(i));
                Thread.sleep(1000);
                pokered4.add(pokers4.get(i));
                Thread.sleep(1000);
            }
        }else {
            if (fister==1) {
                Integer i = 0;
                while (i < 25) {
                    i++;
                    pokered1.add(pokers1.get(i));
                    Thread.sleep(1000);
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(1000);
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(1000);
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(1000);
                }
            }else if(fister==2){
                Integer i = 0;
                while (i < 25) {
                    i++;
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(1000);
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(1000);
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(1000);
                    pokered1.add(pokers1.get(i));
                    Thread.sleep(1000);
                }
            }else if(fister==3){
                Integer i = 0;
                while (i < 25) {
                    i++;
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(1000);
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(1000);
                    pokered1.add(pokers1.get(i));
                    Thread.sleep(1000);
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(1000);
                }
            }else if(fister==4){
                Integer i = 0;
                while (i < 25) {
                    i++;
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(1000);
                    pokered1.add(pokers1.get(i));
                    Thread.sleep(1000);
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(1000);
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(1000);
                }
            }

        }
    }
}

