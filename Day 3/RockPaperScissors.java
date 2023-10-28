/*1. Rock Paper Scissors Program :  Create a simple game of rock-paper-scissors where the user plays against the computer. Use conditional statements to determine the winner of each round.*/

import java.util.Scanner;
public class RockPaperScissors {
  public static void main(String[] args) {
    String player1, player2;
    System.out.println("Player 1 starts with:");
    Scanner scanner = new Scanner(System.in);
    player1 = scanner.nextLine();
    System.out.println("Player 2 starts with:");
    player2 = scanner.nextLine();

    if(player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors")) {
      System.out.println("Player 1 wins");
    } else if(player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper")) {
      System.out.println("Player 1 wins");
    } else if(player1.equalsIgnoreCase(player2)) {
      System.out.println("It's a draw");
    } else {
      System.out.println("Player 2 wins");
    }
  }
}
