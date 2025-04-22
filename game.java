import java.util.Scanner;

public class Game {
    private  Player player1;
    private  Player player2;
    public Player currentPlayer;
    public boolean running = false;
    
    Scanner sc = new Scanner(System.in);


    public Game(){
        player1 = new Player();
        player2 = new Player();
    }
    public void setFirstPlayer(){
        if( Math.random() > .5){
            currentPlayer = player1;
        } else{
            currentPlayer = player2;
        }
         
    }

    public void switchPlayer(){
        if (currentPlayer.equals(player1)){
            currentPlayer = player2;
        } else{
            currentPlayer = player1;
        }

    }
    public void play(){
        setFirstPlayer();
        while(Board.getPileSize() > 1){
            System.out.println("it is now " + currentPlayer.getName() + "'s turn");
            System.out.println("there are " + Board.getPileSize() + " pieces on the board");
            Board.takePieces();
            switchPlayer();
            

        }
        endGame();
        

    }

    public void endGame(){
        if (currentPlayer == player1){
            System.out.println(player2.getName() + " is the winner!");
            player2.updateScore(1);

        }
        else{
            System.out.println(player1.getName() + " is the winner");
            player1.updateScore(1);
        }
        System.out.println("the score between " + player1.getName() + " and " + player2.getName() + " is " + player1.getScore() + " to " + player2.getScore() );

        System.out.println("would you like to play again? y or n:");
        String input = sc.nextLine();
        if(input.equals("y")){
            Board.populate();
            play();
        }

        

    }
}
