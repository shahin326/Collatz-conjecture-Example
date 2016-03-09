/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstonesequence;

/**
 *
 * @author Sl-lAl-liN
 */
public class Calculator {

    /**
     * user input
     */
    private int input;

    /**
     * variable for storing result
     */
    private int number;

    /**
     * max and second max value in sequence
     */
    private int maxValue, secondMaxValue;

    /**
     * Number of steps required to complete calculation
     */
    private int steps;

    /**
     * Class Constructor
     *
     * @param input user input number
     */
    public Calculator(int input) {
        this.input = input;
        this.number = input;
        this.maxValue = input;
        this.secondMaxValue = 0;
        this.steps = 0;
        //request calculation
        calculate(input);
    }

    /**
     * Class method that calculates the Hailstone sequence
     *
     * @param number the number to start calculation for
     */
    private void calculate(int number) {
        //if user enters 1 handle it differently
        if (number == 1) {
            //the sequence for 1 is: 1,4,2,1,4,2,1....
            //this sequence will continue infinitly when 1 reached
            steps = 3;
            this.secondMaxValue = 2;
        }
        // loop until 1 reached
        while (number != 1) {
            //check for even number and if number is not 1
            if (number % 2 == 0 && number != 1) {
                number = (number / 2);
                //check if odd number and if input is not 1
            } else if (number % 2 != 0 && number != 1) {
                number = (number * 3 + 1);
            }
            //set max and secondmax values when a larger number found
            if (number > this.maxValue) {
                this.secondMaxValue = this.maxValue;
                this.maxValue = number;
            } // in some cases input number is the largest number so we check for numbers larger than secondmax
            else if (number < this.maxValue && number > this.secondMaxValue) {
                this.secondMaxValue = number;
            }
            //number of steps increased everytime we loop
            steps++;
        }

    }

    /**
     * getter method for secondMaxValue
     *
     * @return secondMaxValue second largest number in sequence
     */
    public int getSecondMaxValue() {
        return secondMaxValue;
    }

    /**
     * getter method for number of steps
     *
     * @return steps
     */
    public int getSteps() {
        return steps;
    }

    /**
     * getter method for user input
     *
     * @return input the number that user entered
     */
    public int getInput() {
        return input;
    }

}
