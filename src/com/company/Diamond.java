package com.company;

/**
 * Created by Nayana on 7/6/2016.
 */
public class Diamond extends IsoscelesTriangle{


    public void printDiamond(int numberOfRows){

        printIsoscelesTriangle(numberOfRows);
        printLowerTriangle(numberOfRows-1);
    }

    public void printLowerTriangle(int numberOfRows) {

        int starCounter=numberOfRows;

        for (int row=1;row<=numberOfRows;row++){

            for (int space=1;space<=row;space++)
                System.out.print(" ");


            for (int star=1;star<=2*starCounter-1;star++) {
                System.out.print("*");
            }
            starCounter--;
            System.out.println("");
        }
    }
}
