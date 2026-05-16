package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class A_Pattern {
    public static void main(String[] args) {


                for (int i=0; i<7; i++){
                    for (int j=0; j<5; j++){
                        if (i == 0 && (j == 0 || j == 4)){
                            System.out.print("   ");
                        }else if (j == 0 || i == 0 || j == 4 || i == 3) {
                            System.out.print(" * ");
                        }else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }


    }
}