import java.util.Scanner;

public class player
{
  /* attributes */
  public int score = 0;
  public String name = "";
  private double points;
  /* your code here - accessor(s) */ 
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
    name = n;
  }

  public double getPoints(int pnts){
    return points;
  }
}