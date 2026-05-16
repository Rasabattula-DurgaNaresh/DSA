package org.example;

public class N_Pattern {
    public static void main(String[] args) {
        for (int i=0; i<6; i++){
            for (int j=0; j<6; j++){
                if(j==0 || i==j || j==5){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
