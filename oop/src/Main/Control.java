/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author vero zaskia
 */

public class Control extends JFrame {

    /*
    this is the main controler that controls
    and combines different components of the game.
    */ 

    private Board GameBoard; //Board and Button
    private Tools Panel; // Exit and Reset

    Control() {
        setLayout(new BorderLayout());

    GameBoard = new Board();
    Panel = new Tools();

    Panel.SetObject(GameBoard);

    add(GameBoard, BorderLayout.CENTER);
    add(Panel, BorderLayout.SOUTH);

    setVisible(true);
    setSize(550, 550);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
