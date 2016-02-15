package sri;

import java.util.Scanner;

public class solvePuzzle {
    String initialState;
    String finalState ;
    State stInit = null, stFinal = null;
    solvePuzzle(String initialState, String finalState) {
        this.initialState = initialState;
        this.finalState = finalState;
    }

    void callAlgo(algoEnum algoSelected) {
        switch (algoSelected) {
        
        case BFS:
            System.out.println("Breath First Search\n------------------------------");
            BFS_final bfs = new BFS_final(initialState, finalState);
            bfs.play();
            break;

        

        default:
            break;
        }
    }
}