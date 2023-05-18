public class Enemy {
  int health;
  int maxHealth;
  int damage;
  int level;
  String name;
  int xp;
  boolean isAlive = true;
  
  public Enemy(Player player){
    name = "Duede";
    level = player.getLevel();
    if (level == 1){
      damage = 5;
      maxHealth = 20;
      health = 20;
      xp = 5;
      }
    else if (level == 2){
      damage = 7;
      maxHealth = 21;
      health = 21;
      xp = 7;
      }
    else if (level == 3) {
      damage = 10;
      maxHealth = 22;
      health = 22;
      xp = 10;
      }
    else{
      
      damage = player.getDamage() - 3;
      maxHealth = player.getHealth() + 3;
      health = player.getHealth() + 3;
      xp = player.getDamage();
      }
    }
  public int getHealth(){
    return health;
    }
  public void setHealth(int he){
    health = he;
    }
  public int getDamage(){
    return damage;
    }
  public boolean getIsAlive(){
    return isAlive;
    }
  public void setIsAlive(boolean dead){
    isAlive = dead;
    }
  public String getName(){
    return name;
    } 
  public int getMaxHealth(){
    return maxHealth;
  }
  }