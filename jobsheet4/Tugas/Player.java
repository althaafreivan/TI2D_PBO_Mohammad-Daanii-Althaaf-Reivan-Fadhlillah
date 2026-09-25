package jobsheet4.Tugas;

public class Player {
  private String name;
  public  Health health;
  
  public Player(String name) {
    this.name = name;
    this.health = new Health();
  }

  public String getNama() {
    return name;
  }

  public void takeDamage(double damage) {
    double currentHealth = health.getCurrentHealth();
    double newHealth = currentHealth - damage;
    if (newHealth < 0) {
      newHealth = 0;
      System.out.println("" + name + " has been defeated!");
    }
    health.setCurrentHealth(newHealth);
    System.out.println("Health =" + health.getCurrentHealth());
  }
}
