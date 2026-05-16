package org.example;

public class O_Pattern {
    public static void main(String[] args) {
        for (int i=0; i<7; i++){
            for (int j=0; j<5; j++){
                if (i == 0 && (j == 0 || j == 4) || i == 6 && (j == 0 || j == 4)) {
                    System.out.print("   ");
                } else if (i==0 || j==0 || j==4 || i==6) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
