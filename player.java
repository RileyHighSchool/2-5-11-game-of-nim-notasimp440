import java.util.Scanner;

public class player
{
  /* attributes */
  public int score = 0;
  public String name = "";
  private double points;
  /* your code here - accessor(s) */ 
Scanner sc = new Scanner(System.in);

  public int getScore(){
    return score;
    
  }

  public String getName(){

    return name;
  }

  /* your code here - mutator(s) */ 
  public void updateScore(int s){
    score += 1; 
    
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