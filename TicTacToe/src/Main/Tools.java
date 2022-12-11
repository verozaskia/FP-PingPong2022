/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author USER
 */

public class Tools extends JPanel {
    private JButton Exit, Reset;
    private Board Brd;
    

    Tools() {
        setLayout(new FlowLayout());
        
        Exit = new JButton("Exit");
        Reset = new JButton("Reset");

        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            System.exit(0);
            }
        });

        Reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Brd.Reset();
            }
        });

        add(Exit);
        add(Reset);
    }
    

    public void SetObject(Board B) {
        Brd = B;
    }
}