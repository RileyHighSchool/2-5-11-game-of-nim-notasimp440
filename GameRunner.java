/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/
public class GameRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim!");

    board.populate(); // static method call
     int fileSize = board.getFileSize();
    
    game nim = new game(); 
    nim.play();
    if(nim.running == true){
      
      while(fileSize != 1 || fileSize != 0){
       game.setFirstPlayer();
      }
    }
  }
}