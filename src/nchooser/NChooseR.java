/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nchooser;

import javax.swing.JOptionPane;

/**
 *
 * @author conas1290
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                        
        String listing = "";
        int n, r, numways;

        r = Integer.parseInt(JOptionPane.showInputDialog("This program will calculate the number of ways \n to choose r different objects from a set of n objects \n How many object would you like to choose?"));
        n = Integer.parseInt(JOptionPane.showInputDialog("How many objects to choose from"));
        //Main calculation 
       numways = factorial(n)/(factorial(r)*factorial(n-r));
       System.out.println("There are " + numways + " ways to choose " + r + " from a set of " + n + " objects");
      
    }                                         

    static public int factorial (int n) {
        if (n==1 || n==0) {
            return 1;
        } else {
            return (n*factorial(n-1));
        }

    }
    
}
