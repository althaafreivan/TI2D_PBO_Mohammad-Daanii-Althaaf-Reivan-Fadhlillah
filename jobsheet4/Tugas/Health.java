package jobsheet4.Tugas;

public class Health {
  private static final double _maxHealth = 100.0f;
  private double _currentHealth;

  public Health() {
    this._currentHealth = _maxHealth;
  }

  public double getCurrentHealth() {
    return _currentHealth;
  }

  public void setCurrentHealth(double currentHealth) {
    this._currentHealth = currentHealth;
  }
}
