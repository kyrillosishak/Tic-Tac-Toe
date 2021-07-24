/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JOptionPane;

/**
 *
 * @author kerog
 */
public class TicTacToe {
    //defining 2D Array 
static char Game [] [] = new char [3][3];

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
        
       while(!Winner()){
          
       }
       if (GUI.triger %2 == 0)
           JOptionPane.showMessageDialog(gui, "O IS THE WINNER");
       else
           JOptionPane.showMessageDialog(gui, "X IS THE WINNER");
    }
    
    
    public static boolean chechRow (){
        if ((Game[0][0] == 'x' || Game[0][0] == 'o')&&(Game[0][1] == 'x' || Game[0][1] == 'o')&&(Game[0][2] == 'x' || Game[0][2] == 'o')&&(Game[0][0] == Game[0][1] && Game[0][1] == Game[0][2]) )
            return true;
        else if ((Game[1][0] == 'x' || Game[1][0] == 'o')&&(Game[1][1] == 'x' || Game[1][1] == 'o')&&(Game[1][2] == 'x' || Game[1][2] == 'o')&&
                (Game[1][0] == Game[1][1] && Game[1][1] == Game[1][2]))
            return true;
        else if ((Game[2][0] == 'x' || Game[2][0] == 'o')&&(Game[2][1] == 'x' || Game[2][1] == 'o')&&(Game[2][2] == 'x' || Game[2][2] == 'o')&&
                (Game[2][0] == Game[2][1] && Game[2][1] == Game[2][2]))
            return true;
        else 
            return false;
    }
    public static boolean chechCol (){
        if ((Game[0][0] == 'x' || Game[0][0] == 'o')&&(Game[1][0] == 'x' || Game[1][0] == 'o')&&(Game[2][0] == 'x' || Game[2][0] == 'o')&&
            (Game[0][0] == Game[1][0] && Game[1][0] == Game[2][0]) )
            return true;
        else if ((Game[0][1] == 'x' || Game[0][1] == 'o')&&(Game[1][1] == 'x' || Game[1][1] == 'o')&&(Game[2][1] == 'x' || Game[2][1] == 'o')&&
                (Game[0][1] == Game[1][1] && Game[1][1] == Game[2][1]))
            return true;
        else if ((Game[0][2] == 'x' || Game[0][2] == 'o')&&(Game[1][2] == 'x' || Game[1][2] == 'o')&&(Game[2][2] == 'x' || Game[2][2] == 'o')&&
                (Game[0][2] == Game[1][2] && Game[1][2] == Game[2][2]))
            return true;
        else 
            return false;
    }
    public static boolean checkRDiagonals(){
       if ((Game[0][0] == 'x' || Game[0][0] == 'o')&&(Game[1][1] == 'x' || Game[1][1] == 'o')&&(Game[2][2] == 'x' || Game[2][2] == 'o')&&
            (Game[0][0] == Game[1][1] && Game[1][1] == Game[2][2]) )
            return true;
       else
           return false;
    }
    public static boolean checkLDiagonals(){
         if ((Game[0][2] == 'x' || Game[0][2] == 'o')&&(Game[1][1] == 'x' || Game[1][1] == 'o')&&(Game[2][0] == 'x' || Game[2][0] == 'o')&&
            (Game[0][2] == Game[1][1] && Game[1][1] == Game[2][0]) )
            return true;
       else
           return false;
    }
    public static boolean Winner (){
        if (chechRow()||chechCol() || checkLDiagonals() || checkRDiagonals())
            return true;
        else
            return false;
    }
}
