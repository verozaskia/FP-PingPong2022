/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javax.swing.*;

/**
 *
 * @author USER
 */
class GameArray {
    
private Board Brd;
private int Arr[][];
private boolean Turn;
private JButton Pressed;

GameArray(Board B) {

    Arr = new int[3][3];

    Brd = B;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            Arr[i][j] = 0;
        }
    }

}

public void ArrayInitialize(int i, int j, int Marker) {

    //Set Data sent by Action listener in Board

    Arr[i][j] = Marker;
    WinCheck(Marker);
}


public void WinCheck(int Marker) {

    // if the specified array indexs contain a certain Maker (1,2) on winning pattrens then announce winner

    if ((Arr[0][0] == Marker && Arr[0][1] == Marker && Arr[0][2] == Marker) || 
            (Arr[1][0] == Marker && Arr[1][1] == Marker && Arr[1][2] == Marker) || 
            (Arr[2][0] == Marker && Arr[2][1] == Marker && Arr[2][2] == Marker)) {

        if (Marker == 1) {
            JOptionPane.showMessageDialog(Brd, "Selamat : Pemain 1 (Menang)");
        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(Brd, "Selamat : Pemain 2 (Menang)");
        }

        Brd.DisableAll(false);

    } else if ((Arr[0][0] == Marker && Arr[1][0] == Marker && Arr[2][0] == Marker) 
            || (Arr[0][1] == Marker && Arr[1][1] == Marker && Arr[2][1] == Marker) 
            || (Arr[0][2] == Marker && Arr[1][2] == Marker && Arr[2][2] == Marker)) {

        if (Marker == 1) {
            JOptionPane.showMessageDialog(Brd, "Selamat : Player 1 (Menang)");

        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(Brd, "Selamat : Pemain 2 (Menang)");

        }
        Brd.DisableAll(false);

    } else if ((Arr[0][0] == Marker && Arr[1][1] == Marker && Arr[2][2] == Marker) || 
            (Arr[2][0] == Marker && Arr[1][1] == Marker && Arr[0][2] == Marker)) {

        if (Marker == 1) {
            JOptionPane.showMessageDialog(Brd, "Selamat : Pemain 1 (Menang)");

        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(Brd, "Selamat : Pemain 2 (Menang)");

        }
        Brd.DisableAll(false);

    }

}

}