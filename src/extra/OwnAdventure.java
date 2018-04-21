package extra;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	System.out.println("Escape the room You are locked in a room. In the room, your currently see 3 doors.");
	System.out.println("The door on the left is made of oak wood. The one in the middle is a glass mirror On the right, is a stone door");
	System.out.println("In front of the doors is two chests. One of which has the key, while the other has a swarm of wasps");
	
	int chest = JOptionPane.showOptionDialog(null, "Pick a chest", "Key Chest", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "LEFT" /*option 0*/, "RIGHT" /*option1*/}, null);
if (chest == 0) {
	System.out.println("Player was attacked by swarm of wasps");
	
}
else {
	System.out.println("Player found key");
	int door = JOptionPane.showOptionDialog(null, "Which door would you like to go through?", "Door", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "wood", "glass", "stone" }, null);
	if (door == 0) {
		System.out.println("Player died");
	}
	else if (door == 2) {
		System.out.println("Player died");
	}
	else {
		System.out.println("You have found yourself ");
	}
}

}
}
