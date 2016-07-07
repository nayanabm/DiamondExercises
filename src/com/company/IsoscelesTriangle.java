package com.company;

/**
 * Created by Nayana on 7/6/2016.
 */
public class IsoscelesTriangle {

    public void printIsoscelesTriangle(int numberOfRows){

        for (int row=1;row<=numberOfRows;row++){

            for (int space=1;space<=numberOfRows-row;space++)
                System.out.print(" ");

            for (int star=1;star<=2*row-1;star++)
                System.out.print("*");

            System.out.println("");
        }
    }
}
