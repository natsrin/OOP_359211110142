package oop_lab3;


public class TestNestedLoop {
    public static void main(String[] args) {
        int x = 1;
        int y = 15;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 8 || i == j || j == 1)
                    System.out.printf("*\t");
                else if (i < j) {
                    System.out.print(y-- + "\t");
                } else {
                    System.out.print(x++ + "\t");
                }
            }//j
            System.out.println();
        }//main
    }
}
