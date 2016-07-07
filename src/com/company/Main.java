package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IsoscelesTriangle isoscelesTriangle=new IsoscelesTriangle();
        Diamond diamond=new Diamond();
        DiamondWithName diamondWithName=new DiamondWithName();

        System.out.println("Isosceles triangle");
        isoscelesTriangle.printIsoscelesTriangle(3);

        System.out.println("Diamond");
        diamond.printDiamond(5);

        System.out.println("Diamond with name");
        diamondWithName.printDiamondWithName(3);

    }
}
