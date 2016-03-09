/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstonesequence;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sl-lAl-liN
 */
public class Printer {
    /**
     * calculator object
     */
    private Calculator calculator;
    
    /**
     * Class Constructor that assigns calculator object
     * @param calculator calculator object
     */
    public Printer(Calculator calculator){
        this.calculator = calculator;
    }
    
    /**
     * Printer method that prints results to a HTML file and opens it in default browser
     * @throws IOException 
     */
    public void Print() throws IOException {
        //BufferedWriter object
        //init. writer object with an output file
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/results.html"));

        // process the result and write to file
        //results are provided by calculator object
        try {
            writer.write("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "<head>\n"
                    + "    <meta charset=\"UTF-8\" /> \n"
                    + "    <title>\n"
                    + "        Thank you for reading me!\n"
                    + "    </title>\n"
                    + "    \n"
                    + "</head>\n"
                    + "<body>\n"
                    + "\n"
                    + "<h1>\n"
                    + "    Hailstone sequence calculation by Shahin Safari\n"
                    + "</h1>\n"
                    + "<p>\n"
                    + "    The input number was: " + calculator.getInput() + "\n"
                    + "</p>\n"
                    + "\n"
                    + "<p>\n"
                    + "    The number of steps it took to reach 1 was: " + calculator.getSteps() + "\n"
                    + "</p>\n"
                    + "\n"
                    + "<p>\n"
                    + "    Second largest number in the sequence was: " + calculator.getSecondMaxValue() + "\n"
                    + "</p>\n"
                    + "\n"
                    + "</body>\n"
                    + "</html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //close writer
        writer.close();
        
        //open the file in browser
        File htmlFile = new File("src/results.html");
        Desktop.getDesktop().browse(htmlFile.toURI());

    }

}
