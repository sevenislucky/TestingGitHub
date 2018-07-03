/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millionaire;
import javax.swing.JFrame;

/**
 *
 * @author kjwil
 */
public class Millionaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 256;
        int pound = total / 100;
        int whatsLeft = total % 100;

        int fiftypence = whatsLeft / 50;
        whatsLeft = whatsLeft % 50;

        int twentyPence = whatsLeft / 20;
        whatsLeft = whatsLeft % 20;

        int tenPence = whatsLeft / 10;
        whatsLeft = whatsLeft % 10;

        int fivepence = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int twopence = whatsLeft / 2;
        whatsLeft = whatsLeft % 2;

        int penny = whatsLeft / 1;

        System.out.println("From " + total + "you get..");
        System.out.println(pound + " pounds");
        System.out.println(fiftypence + " fifties");
        System.out.println(twentyPence + " twenties");
        System.out.println(tenPence + " tens");
        System.out.println(fivepence + " fives");
        System.out.println(twopence + " twos");
        System.out.println(penny + " pennies");
    }

}
