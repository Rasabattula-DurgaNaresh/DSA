package org.example;

public class Q_Pattern {
    public static void main(String[] args) {
        for (int i=0; i<7; i++){
            for (int j=0; j<6; j++){
                if (i==0 && (j==0 || j==4) || i==5 && j==0){
                    System.out.print("   ");
                } else if (j<4 && (i==0 || i==5) || i<5 && (j==0 || j==4)|| i>3 && i+j==1+2*j ) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
