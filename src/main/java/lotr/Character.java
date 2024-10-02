package lotr;

public abstract class Character {
    private int power;
    private int hp;

    public Character(int power, int hp) {
      this.power = power;
      this.hp = hp;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
      return this.hp > 0;
    }

    public int getPower() {
      return this.power;
    }

    public void setPower(int newPower) {
      this.power = newPower;
    }

    public int getHp() {
      return this.hp;
    }

    public void setHp(int newHp) {
      if (newHp < 0) {
        this.hp = 0;
      } else {
        this.hp = newHp;
      }
    }

    public String toString() {
      return this.getClass().getSimpleName() + "{hp=" + this.hp + ", power=" + this.power + "}";
    }

}