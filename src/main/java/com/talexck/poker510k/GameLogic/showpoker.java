package com.talexck.poker510k.GameLogic;

import com.sun.media.sound.SF2InstrumentRegion;

import javax.swing.*;
import java.util.ArrayList;

import static com.talexck.poker510k.GameLogic.givepoker.*;

public class showpoker {
    public static ArrayList pokered1 = new ArrayList<String>();
    public static ArrayList pokered2 = new ArrayList<String>();
    public static ArrayList pokered3 = new ArrayList<String>();
    public static ArrayList pokered4 = new ArrayList<String>();
    public static Integer ifcalled;//0-没有 1-单张 2-方片一对 3-草花一对 4-红桃一对 5-黑桃一对 6-小王一对 7-大王一对 8-红心5一对 9-四张王
    public static Integer poker;
    public static ArrayList lastpokers = pokerlist;
    public static Integer caller;
    public static Integer callmain(Integer poker1, Integer poker2, Integer callers){
        if(poker2==0/*单张*/){
            if(ifcalled<1){
                ifcalled=1;
                poker = poker1;
                caller=callers;
            }
        }
        if(poker2!=0/*一对*/){
            if(poker1==4 && poker2==4 &&ifcalled<2){
                ifcalled=2;
                poker=4;
                caller=callers;
            }else if(poker1==3 && poker2==3 &&ifcalled<3){
                ifcalled=3;
                poker=3;
                caller=callers;
            }else if(poker1==2 && poker2==2 &&ifcalled<4){
                ifcalled=4;
                poker=2;
                caller=callers;
            }else if(poker1==1 && poker2==1 &&ifcalled<5){
                ifcalled=5;
                poker=1;
                caller=callers;
            }else if(poker1==51 && poker2==51 &&ifcalled<6){
                ifcalled=6;
                poker=5;
                caller=callers;
            }else if(poker1==52 && poker2==52 &&ifcalled<7){
                ifcalled=7;
                poker=5;
                caller=callers;
            }else if(poker1==205 && poker2==205 &&ifcalled<8){
                ifcalled=8;
                String mainpoker = JOptionPane.showInputDialog(null,"1黑2红3梅4方5无主","点主",JOptionPane.PLAIN_MESSAGE);
                poker = Integer.valueOf(mainpoker).intValue();
                caller=callers;
            }else if(poker1==551 && poker2==552 /*一大一小*/&&ifcalled<9){
                ifcalled=9;
                String mainpoker = JOptionPane.showInputDialog(null,"1黑2红3梅4方5无主","点主",JOptionPane.PLAIN_MESSAGE);
                poker = Integer.valueOf(mainpoker).intValue();
                caller=callers;
            }
        }
        return poker;
    }
    public static void showpokers(Integer fister, Integer condition) throws InterruptedException {
        ifcalled = 0;
        caller = 0;
        if(condition==1){//抢台
            Integer i = 0;
            caller=1;//test
            ifcalled=1;//test
            while (i < 25) {
                pokered1.add(pokers1.get(i));
                changepoker(Integer.parseInt(String.valueOf(pokers1.get(i))));
                Thread.sleep(600);
                pokered2.add(pokers2.get(i));
                Thread.sleep(600);
                pokered3.add(pokers3.get(i));
                Thread.sleep(600);
                pokered4.add(pokers4.get(i));
                Thread.sleep(600);
                i++;
            }
            givelastpokers(caller);
        }else {
            if (fister==1) {
                Integer i = 0;
                while (i < 25) {
                    pokered1.add(pokers1.get(i));
                    changepoker(Integer.parseInt(String.valueOf(pokers1.get(i))));
                    Thread.sleep(600);
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(600);
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(600);
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(600);
                    i++;
                }
                givelastpokers(fister);
            }else if(fister==2){
                Integer i = 0;
                while (i < 25) {
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(600);
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(600);
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(600);
                    pokered1.add(pokers1.get(i));
                    changepoker(Integer.parseInt(String.valueOf(pokers1.get(i))));
                    Thread.sleep(600);
                    i++;
                }
                givelastpokers(fister);

            }else if(fister==3){
                Integer i = 0;
                while (i < 25) {
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(600);
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(600);
                    pokered1.add(pokers1.get(i));
                    changepoker(Integer.parseInt(String.valueOf(pokers1.get(i))));
                    Thread.sleep(600);
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(600);
                    i++;
                }
                givelastpokers(fister);
            }else if(fister==4){
                Integer i = 0;
                while (i < 25) {
                    pokered4.add(pokers4.get(i));
                    Thread.sleep(600);
                    pokered1.add(pokers1.get(i));
                    changepoker(Integer.parseInt(String.valueOf(pokers1.get(i))));
                    Thread.sleep(600);
                    pokered2.add(pokers2.get(i));
                    Thread.sleep(600);
                    pokered3.add(pokers3.get(i));
                    Thread.sleep(600);
                    i++;
                }
                givelastpokers(fister);
            }


        }


    }

    public static ArrayList changedpoker = new ArrayList<>();
    public static void changepoker(Integer pokerinfo){
        String pokerthis = "";
        if(pokerinfo<=500) {
            if (Math.round(pokerinfo / 100) == 1) {
                pokerthis = pokerthis + "♠";
            } else if (Math.round(pokerinfo / 100) == 2) {
                pokerthis = pokerthis + "♥";
            } else if (Math.round(pokerinfo / 100) == 3) {
                pokerthis = pokerthis + "♣";
            } else if (Math.round(pokerinfo / 100) == 4) {
                pokerthis = pokerthis + "♦";
            }
            Integer pokerinfoed = pokerinfo - Math.round(pokerinfo/100)*100;
            pokerthis= pokerthis + String.valueOf(pokerinfoed);
        }else if(pokerinfo==551){
            pokerthis = "小王";
        }else if(pokerinfo==552){
            pokerthis = "大王";
        }
        changedpoker.add(pokerthis);
        System.out.println(changedpoker);
    }

    public static void givelastpokers(Integer firster) {
        if(ifcalled>0) {
            Integer i = 0;
            while (i < 8) {
                if (firster == 1) {
                    pokered1.add(lastpokers.get(i));
                    System.out.println(pokered1);
                    changepoker(Integer.parseInt(String.valueOf(lastpokers.get(i))));
                } else if (firster == 2) {
                    pokered2.add(lastpokers.get(i));
                } else if (firster == 3) {
                    pokered3.add(lastpokers.get(i));
                } else if (firster == 4) {
                    pokered4.add(lastpokers.get(i));
                }
                i++;
            }
        }else{

        }
    }
}

