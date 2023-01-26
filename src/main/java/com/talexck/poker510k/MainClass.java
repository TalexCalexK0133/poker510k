package com.talexck.poker510k;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass extends JFrame {
    public static void main(String args[]){
        new MainClass();
        com.talexck.poker510k.GameLogic.startpoker.startpokers();
    }
    private MenuItemActionListener menuItemAction=new MenuItemActionListener();
    public MainClass(){
        super("510k游戏");

        JPanel constrol=new JPanel();
        constrol.setLayout(new GridLayout(3, 2));
        Button newgame = new Button("进入游戏");
        newgame.addActionListener(menuItemAction);
        Button button = new Button("登录联网");
        button.addActionListener(menuItemAction);
        Button computerMove = new Button("退出游戏");
        computerMove.addActionListener(menuItemAction);
        constrol.add(newgame);
        constrol.add(button);
        constrol.add(computerMove);
        this.add(constrol,BorderLayout.SOUTH);

        this.setJMenuBar(setJMenuBar());
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }



    private JMenuBar setJMenuBar(){
        JMenuBar jmb = new JMenuBar();

        JMenu game= new JMenu("游戏");

        JMenuItem newgame= new JMenuItem("新游戏");

        newgame.addActionListener(menuItemAction);

        game.add(newgame);

        jmb.add(game);
        return jmb;
    }
    class MenuItemActionListener extends JFrame  implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String actionCommand=e.getActionCommand();
            if("新游戏".equals(actionCommand)){
                dispose();
                new MainClass();
            }else if("退出游戏".equals(actionCommand)){
                System.exit(0);
            }else if("进入游戏".equals(actionCommand)) {
                dispose();
                try {
                    new GameMain();
                } catch (InterruptedException ex) {
                }
            }
        }
    }


}
