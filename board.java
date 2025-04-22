import java.util.Scanner;

public class Board {
    private static  int pileSize;
    private static Scanner sc = new Scanner(System.in);

    public static void populate(){
        pileSize = (int) (Math.random()*40 + 10);
    }

    public static void takePieces(){
        System.out.println("How many pieces will you take?");
        int piecesToTake = sc.nextInt();
        while (piecesToTake < 1 || piecesToTake > Board.getPileSize() / 2){
            System.out.println("Try again");
            piecesToTake = sc.nextInt();
        }
        pileSize = pileSize - piecesToTake;
    }
    public static int getPileSize(){
        return pileSize;
    }
}
