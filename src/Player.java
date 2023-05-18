public class Player{
  String username = " ";
  String clase;
  String claseDelPersonaje  = " ";
  int level;
  int mana;
  int maxMana;
  int damage;
  int health;
  int maxHealth;
  int xp;
  int xpNextLevel = 15;
  boolean isAlive = true;

  public Player(String clase, String name){
    this.clase = clase;
    if(clase.equals("t")){
      username = name;
      level = 1;
      health = 25;
      maxHealth = 25;
      damage = 5;
      xp = 0;
      claseDelPersonaje = "Tanque";
    }
    if(clase.equals("m")){
      username = name;
      level = 1;
      health = 16;
      maxHealth = 16;
      damage = 8;
      xp = 0;
      claseDelPersonaje = "Mago";
      mana = 20;
      maxMana = 20;
    }
    if(clase.equals("g")){
      username = name;
      level = 1;
      health = 17;
      maxHealth = 17;
      damage = 7;
      xp = 0;
      claseDelPersonaje = "Guerrero";
    }
  }
  public void stats(){
    if(claseDelPersonaje.equals("Mago")){
      System.out.println("\b [Estadisticas del Jugador] \n");
      System.out.println("Nombre: " + username  );
      System.out.println("Nivel: " + level );
      System.out.println("Vida: " + health + "/" + maxHealth );
      System.out.println("Mana: " + mana + "/" + maxMana);
      System.out.println("Xp: " + xp + "/" + xpNextLevel );
      System.out.println("Ataque: " + damage );
    }
    else {
      System.out.println("\b [Estadisticas del Jugador] \n");
      System.out.println("Nombre: " + username );
      System.out.println("Nivel: " + level);
      System.out.println("Vida: " + health + "/" + maxHealth );
      System.out.println("Xp: " + xp + "/" + xpNextLevel );
      System.out.println("Ataque: " + damage );
    }
  }
  public int getLevel(){
    return level;
  }
  public int getDamage(){
    return damage;
  }
  public int getHealth(){
    return health;
  }
  public void setHealth(int he){
    health = he;
  }
  public boolean getIsAlive(){
    return isAlive;
  }
  public void setIsAlive(boolean dead){
    isAlive = dead;
  }
  public String getClase(){
    return claseDelPersonaje;
  }
  public int getMaxHealth(){
    return maxHealth;
  }
}