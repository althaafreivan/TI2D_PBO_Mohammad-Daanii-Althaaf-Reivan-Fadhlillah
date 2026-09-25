 package jobsheet4.Tugas;

class Knife extends Weapon {
  public Knife() {
    super(10);
  }

  @Override 
  public static  void attack(Player player) {
    super.attack(
    player.takeDamage(super.getDamage()*Critical());
  }

  public static double Critical() {
    return  Math.random() < 0.2 ? 2.0 : 1.0;
  }
   
}