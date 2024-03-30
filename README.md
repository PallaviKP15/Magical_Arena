# Magical_Arena
In the Magical Arena, every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0. 

In this Magical_Arena two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0

<h2>It includes two classes:- </h2>
<ol>
  <li>Player class</li>
  <li>MagicalArena class</li>
</ol>

The Player class to represent each player in the arena by declaring the health, strength and attack variables of type int.

The MagicalArena class sets up two players and simulates the battle between them, with each player taking turns attacking until one player's health reaches 0. The attacking die rolls are randomly generated using the rollDie() method. In order to generate random numbers, I have first created an instance of this class i.e random and then invoked nextInt() method, using that instance and set the range from 1 to 6.

Initially while condition checks whether both the players health is greater than 0. Then player with lower health attacks first at the start of a match this can be achieved by using if statement.

it will run the iterations until one of the players health reaches 0 and declares the winner among them.

<h3>Sample test case:</h3><br>
Consider two players: <br>
<ul type="none">
  <li>Player A has 50 health, 5 strength and 10 attack<br></li>
  <li>Player B has 100 health, 10 strength and 5 attack</li>
</ul>

PlayerA with lower health i.e 50 attacks first at the start of a match. 

PlayerA : { health=50, strength=5, attack=10 }<br>
PlayerB : { health=100, strength=10, attack=5 }<br>
Attacker rolls 4, Defender rolls 5<br>
Attack damage: 40, Defense strength: 50<br>
Defender health reduced by 0 to 100<br>

PlayerB : { health=100, strength=10, attack=5 }<br>
PlayerA : { health=50, strength=5, attack=10 }<br>
Attacker rolls 5, Defender rolls 4<br>
Attack damage: 25, Defense strength: 20<br>
Defender health reduced by 5 to 45<br>

PlayerA : { health=45, strength=5, attack=10 }<br>
PlayerB : { health=100, strength=10, attack=5 }<br>
Attacker rolls 4, Defender rolls 3<br>
Attack damage: 40, Defense strength: 30<br>
Defender health reduced by 10 to 90<br>

PlayerB : { health=90, strength=10, attack=5 }<br>
PlayerA : { health=45, strength=5, attack=10 }<br>
Attacker rolls 6, Defender rolls 3<br>
Attack damage: 30, Defense strength: 15<br>
Defender health reduced by 15 to 30<br>

PlayerA : { health=30, strength=5, attack=10 }<br>
PlayerB : { health=90, strength=10, attack=5 }<br>
Attacker rolls 5, Defender rolls 3<br>
Attack damage: 50, Defense strength: 30<br>
Defender health reduced by 20 to 70<br>

PlayerB : { health=70, strength=10, attack=5 }<br>
PlayerA : { health=30, strength=5, attack=10 }<br>
Attacker rolls 4, Defender rolls 2<br>
Attack damage: 20, Defense strength: 10<br>
Defender health reduced by 10 to 20<br>

PlayerA : { health=20, strength=5, attack=10 }<br>
PlayerB : { health=70, strength=10, attack=5 }<br>
Attacker rolls 3, Defender rolls 6<br>
Attack damage: 30, Defense strength: 60<br>
Defender health reduced by 0 to 70<br>

PlayerB : { health=70, strength=10, attack=5 }<br>
PlayerA : { health=20, strength=5, attack=10 }<br>
Attacker rolls 6, Defender rolls 3<br>
Attack damage: 30, Defense strength: 15<br>
Defender health reduced by 15 to 5<br>

PlayerA : { health=5, strength=5, attack=10 }<br>
PlayerB : { health=70, strength=10, attack=5 }<br>
Attacker rolls 2, Defender rolls 5<br>
Attack damage: 20, Defense strength: 50<br>
Defender health reduced by 0 to 70<br>

PlayerB : { health=70, strength=10, attack=5 }<br>
PlayerA : { health=5, strength=5, attack=10 }<br>
Attacker rolls 2, Defender rolls 4<br>
Attack damage: 10, Defense strength: 20<br>
Defender health reduced by 0 to 5<br>

PlayerA : { health=5, strength=5, attack=10 }<br>
PlayerB : { health=70, strength=10, attack=5 }<br>
Attacker rolls 1, Defender rolls 4<br>
Attack damage: 10, Defense strength: 40<br>
Defender health reduced by 0 to 70<br>

PlayerB : { health=70, strength=10, attack=5 }<br>
PlayerA : { health=5, strength=5, attack=10 }<br>
Attacker rolls 2, Defender rolls 2<br>
Attack damage: 10, Defense strength: 10<br>
Defender health reduced by 0 to 5<br>

PlayerA : { health=5, strength=5, attack=10 }<br>
PlayerB : { health=70, strength=10, attack=5 }<br>
Attacker rolls 2, Defender rolls 3<br>
Attack damage: 20, Defense strength: 30<br>
Defender health reduced by 0 to 70<br>

PlayerB : { health=70, strength=10, attack=5 }<br>
PlayerA : { health=5, strength=5, attack=10 }<br>
Attacker rolls 3, Defender rolls 5<br>
Attack damage: 15, Defense strength: 25<br>
Defender health reduced by 0 to 5<br>

PlayerA : { health=5, strength=5, attack=10 }<br>
PlayerB : { health=70, strength=10, attack=5 }<br>
Attacker rolls 5, Defender rolls 3<br>
Attack damage: 50, Defense strength: 30<br>
Defender health reduced by 20 to 50<br>

PlayerB : { health=50, strength=10, attack=5 }<br>
PlayerA : { health=5, strength=5, attack=10 }<br>
Attacker rolls 2, Defender rolls 1<br>
Attack damage: 10, Defense strength: 5<br>
Defender health reduced by 5 to 0<br>

Since Player A health reaches 0 - Player B wins!









