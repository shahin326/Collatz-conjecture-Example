/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstonesequence;

import javax.swing.JOptionPane;

/**
 *
 * @author Sl-lAl-liN
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // simple panel for user dialog, which assigns the user input to inputNumber
        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Shahins Hailstone sequence calculator! \n Please enter a natural number less than 1000000:"));
        
        // check for invalid inputs
        while (inputNumber < 0 || inputNumber > 1000000 || inputNumber == 0) {
            //ask again for valid number
            inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Error! Please enter a natural number greater than zero and lesser than 1000000:"));

        }
        JOptionPane.showMessageDialog(
                null, "Thank you! Result is saved to result.html located in projects src folder");

        //creating calculator object
        Calculator calculator = new Calculator(inputNumber);
        
        //creating printer object
        Printer printer = new Printer(calculator);
        
        try {
            //print results to HTML file
            printer.Print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
