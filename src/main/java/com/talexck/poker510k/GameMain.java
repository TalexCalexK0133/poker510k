package com.talexck.poker510k;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMain extends JFrame {
    private MenuItemActionListener menuItemAction=new MenuItemActionListener();
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
    }

    class MenuItemActionListener extends JFrame  implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actionCommand=e.getActionCommand();
            if("出牌".equals(actionCommand)){

            }else if("叫主/炒牌".equals(actionCommand)){

            }else if("造反".equals(actionCommand)) {

            }
        }
    }
}
