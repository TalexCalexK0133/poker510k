package com.talexck.poker510k;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.talexck.poker510k.GameLogic.showpoker.callmain;

public class GameMain extends JFrame {
    private MenuItemActionListener menuItemAction=new MenuItemActionListener();
    public static Integer mainpoker;
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
        constrol.add(newgame);
        constrol.add(button);
        constrol.add(computerMove);
        this.add(constrol,BorderLayout.SOUTH);
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        com.talexck.poker510k.GameLogic.givepoker.givepokers(1,1);
        mainpoker = 2;
    }

    public static Integer poker=0;

    class MenuItemActionListener extends JFrame  implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actionCommand=e.getActionCommand();
            if("出牌".equals(actionCommand)){

            }else if("叫主/炒牌".equals(actionCommand)){
                Integer poker1 = 0;//得到选牌
                Integer poker2 = 0;
                if (poker2==0 && poker1!=0 && poker1-Math.round(poker1/100)*100==mainpoker && poker==0){
                    poker1 = Math.round(poker1/100);
                    poker=callmain(poker1, poker2);
                }else if(poker1==poker2 && poker1-Math.round(poker1/100)*100==mainpoker){
                    poker1 = Math.round(poker1/100);
                    poker2 = Math.round(poker1/100);
                    Integer pokers = poker;
                    poker=callmain(poker1, poker2);
                    if(pokers==poker){
                        //丢回去
                    }
                }else if(poker1==poker2 && poker1==551) {
                    poker1 = Math.round(poker1 / 100);
                    poker2 = Math.round(poker1 / 100);
                    Integer pokers = poker;
                    poker = callmain(poker1, poker2);
                    if(pokers==poker){
                        //丢回去
                    }
                }else if(poker1==poker2 && poker1==552) {
                    poker1 = Math.round(poker1 / 100);
                    poker2 = Math.round(poker1 / 100);
                    Integer pokers = poker;
                    poker = callmain(poker1, poker2);
                    if(pokers==poker){
                        //丢回去
                    }
                }else if(poker1==poker2 && poker1==205) {
                    poker1 = 205;
                    poker2 = 205;
                    poker = callmain(poker1, poker2);
                }
                else if(poker1==551 && poker2==552) {
                    poker1 = 551;
                    poker2 = 552;
                    poker = callmain(poker1, poker2);//这边丢过去叫主成功
                }else{
                    //丢回去
                }
            }else if("造反".equals(actionCommand)) {
                //暂不开发，一人无硬主且无软主时触发重发牌
            }
        }
    }
}
