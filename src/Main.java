import java.util.*;

public class Main{
  
  public static int Dice(){
    int random;
    random = (int) (Math.random() * 7 + 1);
    return random;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String clase = "";
    int num = 2;
    String username ="";
    while (num > 1){
      System.out.println("Bienvenido jugador, Por favor inserte su numbre: ");
      username = scan.nextLine();
      System.out.println("Hola! " + username + " por favor escoja su clase");
      System.out.println("[t] para la clase de tanque");
      System.out.println("[m] para la clase de mago");
      System.out.println("[g] para la clase a Guerrero");
      clase = scan.nextLine();
      while (!clase.toLowerCase().equals("t") && !clase.toLowerCase().equals("m") && !clase.toLowerCase().equals("g")){
        System.out.println("Por favor escoja una clase");
        clase = scan.nextLine();
      }
      num--;
    }
    if (clase.toLowerCase().equals("t")){
      Player player = new Player(clase, username);
      Enemy enemy = new Enemy(player);
      Battle battle = new Battle(player, enemy);
      Battle.BattleCamp();
    }
    if (clase.toLowerCase().equals("m")){
      Player player = new Player(clase, username);
      Enemy enemy = new Enemy(player);
      Battle battle = new Battle(player, enemy);
      Battle.BattleCamp();
    }
    if (clase.toLowerCase().equals("g")){
      Player player = new Player(clase, username); 
      Enemy enemy = new Enemy(player);
      Battle battle = new Battle(player, enemy);
      Battle.BattleCamp();
    }
  }
}