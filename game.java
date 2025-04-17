import java.util.Scanner;

public class game {
    private player player1;
    private player player2;
    public boolean running = false;
    Scanner sc = new Scanner(System.in);

    public void setFirstPlayer(){
        System.out.println("choose plyaer one's username");
         player1.name = sc.nextLine();
         System.out.println("welcome " + player1.getName());

    }

    public void setSecondPlayer(){
        System.out.println("choose plyaer two's username");
         player2.name = sc.nextLine();
         System.out.println("welcome " + player2.getName());

    }
    public void play(){
        running = true;
    }
}
