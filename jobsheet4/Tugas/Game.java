package jobsheet4.Tugas;

public class Game {
  public static void main(String[] args) {
    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");

    System.out.println(player1.getNama() + " vs " + player2.getNama());

    System.out.println("--- Round 1 ---");
    Knife.attack(player1);
    Knife.attack(player2);

  }
}
