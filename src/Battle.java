import java.util.Scanner;

public class Battle {
  private static Scanner decision = new Scanner(System.in);
  private static String action;
  private static Player player;
  private static Enemy enemy;

  public Battle(Player player, Enemy enemy) {
    this.player = player;
    this.enemy = enemy;
  }

  public static void BattleCamp() {
    System.out.println("\n¡Oh no! ¡Un temido " + enemy.getName() + " te desafió a un combate!\n");
    while (player.getIsAlive() && enemy.getIsAlive()) {
      System.out.println("\n¿Qué vas a hacer?");
      System.out.println("[a] Atacar | [c] Curar\n");
      action = decision.nextLine();
      if (action.equalsIgnoreCase("a")) {
        plaAttack();
      } else {
        plaHeal();
      }
      System.out.println("\nAhora es el turno del enemigo...\n");
      if (Main.Dice() >= 4) {
        eneAttack();
      } else{
        eneHeal();
      }
    }
  }

  public static void plaHeal() {
    int num = Main.Dice();
    if (player.getHealth() < player.getMaxHealth() && player.getMaxHealth() - player.getHealth() <= num) {
      System.out.println("\n¡El " + player.getClase() + " se ha curado " + num + " puntos de salud!\n");
      player.setHealth(player.getHealth() + num);
    } else {
      System.out.println("\n¡Ya tienes suficiente vida y no es necesario en este momento!\n");
    }
  }

  public static void plaAttack() {
    if (Main.Dice() > 2) {
      AtaqueEfectivo();
      enemy.setHealth(enemy.getHealth() - player.getDamage());
      if (enemy.getHealth() <= 0) {
        enemy.setIsAlive(false);
        System.out.println("\n¡Derrotaste al enemigo " + enemy.getName() + "!");
      } else {
        System.out.println("\n¡El enemigo " + enemy.getName() + " ha recibido " + player.getDamage() + " puntos de daño!\n");
        System.out.println("\nSalud restante del enemigo: " + enemy.getHealth() + "/" + enemy.getMaxHealth() +"\n");
      }
    } else {
      AtaqueFailed();
    }
  }

  public static void eneHeal() {
    int num = Main.Dice();
    if (enemy.getHealth() < enemy.getMaxHealth() && enemy.getMaxHealth() - enemy.getHealth() <= num) {
      System.out.println("\n¡El " + enemy.getName() + " se ha curado " + num + " puntos de salud!\n");
      enemy.setHealth(enemy.getHealth() + num);
    } else {
      System.out.println("\n¡El enemigo " + enemy.getName() + " ya tiene suficiente vida y no quiere gastar más!\n");
    }
  }

  public static void eneAttack() {
    if (Main.Dice() > 3) {
      AtaqueEfectivo();
      player.setHealth(player.getHealth() - enemy.getDamage());
      if (player.getHealth() <= 0) {
        player.setIsAlive(false);
        System.out.println("\n¡El enemigo " + enemy.getName() + " te ha derrotado!");
      } else {
        System.out.println("\n¡El enemigo " + enemy.getName() + " te ha causado " + enemy.getDamage() + " puntos de daño!\n");
        System.out.println("\nSalud restante del jugador: " + player.getHealth() + "/" + player.getMaxHealth() + "\n");
      }
    } else {
      AtaqueFailed();
    }
  }

  public static void AtaqueEfectivo() {
    int num = Main.Dice();
    switch (num) {
      case 1:
        System.out.println("\n\n¡Un gran golpe!\n");
        break;
      case 2:
        System.out.println("\n\n¡Un golpe fulminante!\n");
        break;
      case 3:
        System.out.println("\n\n¡Qué impacto!\n");
        break;
      case 4:
        System.out.println("\n\n¡Y acierta el golpe!\n");
        break;
      case 5:
        System.out.println("\n\n¡Wow, qué fuerte!\n");
        break;
      case 6:
        System.out.println("\n\n¡Cuánta fuerza!\n");
        break;
      default:
        System.out.println("\n\n¡Un golpe efectivo!\n");
        break;
    }
  }

  public static void AtaqueFailed() {
    int num = Main.Dice();
    switch (num) {
      case 1:
        System.out.println("\n\n¡Uy, tan cerca!\n");
        break;
      case 2:
        System.out.println("\n\n¡Fallaste!\n");
        break;
      case 3:
        System.out.println("\n\n¡A dónde apuntas?\n");
        break;
      case 4:
        System.out.println("\n\n¡Allá no está el enemigo!\n");
        break;
      case 5:
        System.out.println("\n\n¡Inténtalo de nuevo!\n");
        break;
      case 6:
        System.out.println("\n\n¡¿Qué haces? ¡El enemigo está justo frente a ti!\n");
        break;
      default:
        System.out.println("\n\n¡Un golpe efectivo!\n");
        break;
    }
  }
}