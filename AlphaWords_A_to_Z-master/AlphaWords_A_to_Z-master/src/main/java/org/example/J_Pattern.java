package org.example;

public class J_Pattern {
    public static void main(String[] args) {
        for (int i=0; i<7; i++){
            for (int j=0; j<4; j++){
                if (i==6 && (j==0 || j==3)){
                    System.out.print("   ");
                } else if (j==3 || i==6 || i==5 && j==0) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
