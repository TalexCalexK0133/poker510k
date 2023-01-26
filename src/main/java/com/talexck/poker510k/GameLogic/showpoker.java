package com.talexck.poker510k.GameLogic;

import javax.swing.*;
import java.util.ArrayList;

import static com.talexck.poker510k.GameLogic.givepoker.pokers1;
import static com.talexck.poker510k.GameLogic.givepoker.pokers2;
import static com.talexck.poker510k.GameLogic.givepoker.pokers3;
import static com.talexck.poker510k.GameLogic.givepoker.pokers4;

public class showpoker {
    public static ArrayList pokered1 = new ArrayList<String>();
    public static ArrayList pokered2 = new ArrayList<String>();
    public static ArrayList pokered3 = new ArrayList<String>();
    public static ArrayList pokered4 = new ArrayList<String>();
    public static Integer ifcalled;//0-没有 1-单张 2-方片一对 3-草花一对 4-红桃一对 5-黑桃一对 6-小王一对 7-大王一对 8-红心5一对 9-四张王
    public static Integer poker;
    public static Integer callmain(Integer poker1, Integer poker2){
        if(poker2==0/*单张*/){
            if(ifcalled<1){
                ifcalled=1;
                poker = poker1;
            }
        }
        if(poker2!=0/*一对*/){
            if(poker1==4 && poker2==4 &&ifcalled<2){
                ifcalled=2;
                poker=4;
            }else if(poker1==3 && poker2==3 &&ifcalled<3){
                ifcalled=3;
                poker=3;
            }else if(poker1==2 && poker2==2 &&ifcalled<4){
                ifcalled=4;
                poker=2;
            }else if(poker1==1 && poker2==1 &&ifcalled<5){
                ifcalled=5;
                poker=1;
            }else if(poker1==51 && poker2==51 &&ifcalled<6){
                ifcalled=6;
                poker=5;
            }else if(poker1==52 && poker2==52 &&ifcalled<7){
                ifcalled=7;
                poker=5;
            }else if(poker1==205 && poker2==205 &&ifcalled<8){
                ifcalled=8;
                String mainpoker = JOptionPane.showInputDialog(null,"1黑2红3梅4方5无主","点主",JOptionPane.PLAIN_MESSAGE);
                poker = Integer.valueOf(mainpoker).intValue();
            }else if(poker1==51 && poker2==2 /*一大一小*/&&ifcalled<9){
                ifcalled=9;
                String mainpoker = JOptionPane.showInputDialog(null,"1黑2红3梅4方5无主","点主",JOptionPane.PLAIN_MESSAGE);
                poker = Integer.valueOf(mainpoker).intValue();
            }
        }
        return poker;
    }
    public static void showpokers(Integer fister, Integer condition) throws InterruptedException {
        ifcalled = 0;
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

