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
    
    game nim = new game(); 
    nim.play();
    
  }
}