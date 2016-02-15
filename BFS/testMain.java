package BFS;

import java.util.*;
import java.util.Scanner;
class testMain {

    public static void main(String[] args) {
        System.out.println("The initial board State is:123405678 ");
       
        String initState = "123405678"; 
        System.out.println("The final board State is: 123456780");
        String finalState = "123456780"; 
        System.out.println();
        solvePuzzle sp = new solvePuzzle(initState, finalState);
        System.out.println("\n1. BFS ");
        System.out.println("Enter 0 to continue\n");
        Scanner opt = new Scanner(System.in);
        int option = opt.nextInt();
        
            sp.callAlgo(algoEnum.BFS);
        opt.close();
    }

}

