package jobsheet4.Tugas;

public class Weapon {
  private int damage;

  public Weapon(int value) {
    this.damage = value;
  }

  public  double getDamage() {
    return damage;
  }

  public static   void attack(Player player) {
    player.takeDamage(damage);
  }
}
