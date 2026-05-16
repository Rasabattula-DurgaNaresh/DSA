package org.example;

public class Y_Pattern {
    public static void main(String[] args) {
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                if (i<4 && i==j || i<4 && i+j==6 || i>3 && j==3){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
