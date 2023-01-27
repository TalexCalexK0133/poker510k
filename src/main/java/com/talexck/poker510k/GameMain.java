package com.talexck.poker510k;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.talexck.poker510k.GameLogic.showpoker.callmain;

public class GameMain extends JFrame {
    private MenuItemActionListener menuItemAction=new MenuItemActionListener();
    public static Integer mainpoker;
    public static Integer turns;
    public GameMain() throws InterruptedException {
        super("510k游戏");

        JPanel constrol=new JPanel();
        constrol.setLayout(new GridLayout(3, 2));
        Button newgame = new Button("出牌");
        newgame.addActionListener(menuItemAction);
        Button button = new Button("叫主/炒牌");
        button.addActionListener(menuItemAction);
        Button computerMove = new Button("造反");
        computerMove.addActionListener(menuItemAction);
        Button computerMove2 = new Button("开始");
        computerMove2.addActionListener(menuItemAction);
        constrol.add(newgame);
        constrol.add(button);
        constrol.add(computerMove);
        constrol.add(computerMove2);
        this.add(constrol,BorderLayout.SOUTH);
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        mainpoker = 2;
        turns=1;
    }

    public static Integer poker=0;

    public static void tipinfo(String info, String title){
        JOptionPane.showMessageDialog(null,info,title,JOptionPane.PLAIN_MESSAGE);
    }

    class MenuItemActionListener extends JFrame  implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actionCommand=e.getActionCommand();
            if("出牌".equals(actionCommand)){

            }else if("叫主/炒牌".equals(actionCommand)){
                Integer poker1 = 0;//得到选牌
                Integer poker2 = 0;
                if (poker2==0 && poker1!=0 && poker1-Math.round(poker1/100)*100==mainpoker && poker==0){
                    poker1 = Math.round(poker1/100);
                    poker=callmain(poker1, poker2, 1);
                }else if(poker1==poker2 && poker1-Math.round(poker1/100)*100==mainpoker){
                    poker1 = Math.round(poker1/100);
                    poker2 = Math.round(poker1/100);
                    Integer pokers = poker;
                    poker=callmain(poker1, poker2,1);
                    if(pokers==poker){
                        tipinfo("叫主/炒牌失败","提示");
                    }
                }else if(poker1==poker2 && poker1==551) {
                    poker1 = Math.round(poker1 / 100);
                    poker2 = Math.round(poker1 / 100);
                    Integer pokers = poker;
                    poker = callmain(poker1, poker2,1);
                    if(pokers==poker){
                        tipinfo("叫主/炒牌失败","提示");
                    }
                }else if(poker1==poker2 && poker1==552) {
                    poker1 = Math.round(poker1 / 100);
                    poker2 = Math.round(poker1 / 100);
                    Integer pokers = poker;
                    poker = callmain(poker1, poker2,1);
                    if(pokers==poker){
                        tipinfo("叫主/炒牌失败","提示");
                    }
                }else if(poker1==poker2 && poker1==205) {
                    poker1 = 205;
                    poker2 = 205;
                    poker = callmain(poker1, poker2,1);
                }
                else if(poker1==551 && poker2==552) {
                    poker1 = 551;
                    poker2 = 552;
                    poker = callmain(poker1, poker2,1);//这边丢过去叫主成功
                }else{
                    tipinfo("叫主/炒牌失败","提示");
                }
            }else if("造反".equals(actionCommand)) {
                //暂不开发，一人无硬主且无软主时触发重发牌
            }else if("开始".equals(actionCommand)) {
                if(mainpoker==2 && turns==1) {
                    startagame(1, 1);
                }
            }
        }
    }
    public static void startagame(Integer uper, Integer condition){
        try {
            com.talexck.poker510k.GameLogic.givepoker.givepokers(uper,condition);
        } catch (InterruptedException ex) {
        }
    }
}
