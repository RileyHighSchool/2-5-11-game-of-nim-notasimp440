import java.util.Scanner;

public class board {
    private static  int pileSize;
    private static Scanner sc = new Scanner(System.in);

    public static void populate(){
        pileSize = 10;
    }
    public static void takePieces(){
        System.out.println("how many pieces will you take");
        int piecesToTake = sc.nextInt();
        pileSize = pileSize - piecesToTake;
    }
    public static int getFileSize(){
        return pileSize;
    }
}
