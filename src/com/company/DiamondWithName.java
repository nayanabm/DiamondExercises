package com.company;

/**
 * Created by Nayana on 7/6/2016.
 */
public class DiamondWithName extends Diamond{


    public void printDiamondWithName(int numberOfRows){

        printIsoscelesTriangle(numberOfRows-1);
        System.out.println("Nayana");
        printLowerTriangle(numberOfRows-1);
    }

}
