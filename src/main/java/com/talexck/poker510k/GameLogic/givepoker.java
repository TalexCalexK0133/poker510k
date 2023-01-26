package com.talexck.poker510k.GameLogic;

import java.util.ArrayList;
import java.util.Random;

import static com.talexck.poker510k.GameLogic.showpoker.showpokers;
import static com.talexck.poker510k.GameLogic.startpoker.pokers;

public class givepoker {
    public static ArrayList pokers1 = new ArrayList<String>();//player
    public static ArrayList pokers2 = new ArrayList<String>();//computer
    public static ArrayList pokers3 = new ArrayList<String>();//computer
    public static ArrayList pokers4 = new ArrayList<String>();//computer

    public static ArrayList pokerlist = pokers;
    public static void givepokers(Integer uper, Integer condition) throws InterruptedException {
        Integer firster;
        pokerlist = pokers;
        if(condition==1){//第一把抢台
            firster=1;
        }else{
            firster=uper;
        }
        if(firster==1){
            Integer i=0;
            while (i<25){
                i++;
                pokerget();
            }
            System.out.println(pokerlist);
        }else if(firster==2){
            Integer i=0;
            poker2get();
            poker3get();
            poker4get();
            while (i<24){
                i++;
                pokerget();
            }
            poker1get();
            System.out.println(pokerlist);
        }else if(firster==3){
            Integer i=0;
            poker3get();
            poker4get();
            while (i<24){
                i++;
                pokerget();
            }
            poker1get();
            poker2get();
            System.out.println(pokerlist);
        }else if(firster==4){
            Integer i=0;
            poker4get();
            while (i<24){
                i++;
                pokerget();
            }
            poker1get();
            poker2get();
            poker3get();
            System.out.println(pokerlist);
        }
        System.out.println(pokers1);
        System.out.println(pokers2);
        System.out.println(pokers3);
        System.out.println(pokers4);

        showpokers(firster,condition);
    }
    public static void pokerget(){
        poker1get();
        poker2get();
        poker3get();
        poker4get();
    }
    public static void poker1get(){
        Integer number;
        Integer max;
        Random r = new Random();
        max=pokerlist.size();
        number =  r.nextInt((max - 1) + 1);
        pokers1.add(pokerlist.get(number));
        pokerlist.remove(pokerlist.get(number));
    }
    public static void poker2get(){
        Integer number;
        Integer max;
        Random r = new Random();
        max=pokerlist.size();
        number =  r.nextInt((max - 1) + 1);
        pokers2.add(pokerlist.get(number));
        pokerlist.remove(pokerlist.get(number));
    }
    public static void poker3get(){
        Integer number;
        Integer max;
        Random r = new Random();
        max=pokerlist.size();
        number = r.nextInt((max - 1) + 1);
        pokers3.add(pokerlist.get(number));
        pokerlist.remove(pokerlist.get(number));
    }
    public static void poker4get(){
        Integer number;
        Integer max;
        Random r = new Random();
        max=pokerlist.size();
        number =  r.nextInt((max - 1) + 1);
        pokers4.add(pokerlist.get(number));
        pokerlist.remove(pokerlist.get(number));
    }
}
