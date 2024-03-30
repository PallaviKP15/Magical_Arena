import java.util.Random;

public class MagicalArena {
	static Random random = new Random();

	public static int rollDie() {
	    return random.nextInt(6) + 1; // 1 to 6 sided die
	}

	public static void fight(Player attacker, Player defender) {
	    int attackRoll = rollDie();
	    int defenseRoll = rollDie();
	        

	    int attackDamage = attacker.attack * attackRoll;
	    int defenseStrength = defender.strength * defenseRoll;

	    int damageTaken = Math.max(0, attackDamage - defenseStrength);
	    defender.health -= damageTaken;
	        
	    System.out.println("Attacker rolls " + attackRoll + ", Defender rolls " + defenseRoll);
	    System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength);
	    System.out.println("Defender health reduced by " + damageTaken + " to " + defender.health + "\n");
	}

	public static void main(String[] args) {
	    Player playerA = new Player(50, 5, 10);
	    Player playerB = new Player(100, 10, 5);

	    System.out.println("Starting battle!");
	    System.out.println();
	        
	    while (playerA.health > 0 && playerB.health > 0) {
	        if (playerA.health <= 0 || playerB.health <= 0) {
	            	break;
	        }
	            
	    	System.out.println("PlayerA : { health="+playerA.health+", strength="+playerA.strength+", attack="+playerA.attack+" }");
      		System.out.println("PlayerB : { health="+playerB.health+", strength="+playerB.strength+", attack="+playerB.attack+" }");
	            
	    	fight(playerA, playerB);        
	        if (playerB.health <= 0) {
	     		System.out.println("Player A wins!");
	                break;
	        }
					      
	    	System.out.println("PlayerB : { health="+playerB.health+", strength="+playerB.strength+", attack="+playerB.attack+" }");
	      	System.out.println("PlayerA : { health="+playerA.health+", strength="+playerA.strength+", attack="+playerA.attack+" }");
	      	        
	      	fight(playerB, playerA);
	      	      
	        if (playerA.health <= 0) {
	            System.out.println("Player B wins!");
	            break;
	        }
	    }
	}
}


