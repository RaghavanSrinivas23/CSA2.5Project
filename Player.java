import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name = ""; 
  private double points;
  /* your code here - constructor(s) */ 
  public Player()
  {
    points = 0;
    System.out.println("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    System.out.println("Hello and welcome to the game " + newName);
  }
  public Player(String inputName)
  {
    name = inputName;
    points = 0;
    System.out.println("Hello and welcome to the game " + name);
  }
  /* your code here - accessor(s) */ 
  public String getName()
  {
    return name;
  }
  
  public void setName(String x)
  {
    name = x;
  }
  /* your code here - mutator(s) */ 
  public double getPoints()
  {
    return points;
  }
}
