import java.util.Scanner;

public class Player
{
  /* attributes */
  public int score;
  public String name;
  private double points;
  /* your code here - accessor(s) */ 
Scanner sc = new Scanner(System.in);

  public Player(){
    System.out.println("What is your name? ");
    name = sc.nextLine();
    score = 0;
  }
  public int getScore(){
    return score;
    
  }

  public String getName(){

    return name;
  }

  /* your code here - mutator(s) */ 
  public void updateScore(int s){
    score += s; 
    
  }
  public void setName(String n){
    System.out.println("enter your name: ");
    String name = sc.nextLine();
     n = name;
  }

  public double getPoints(int pnts){
    return points;
  }
}