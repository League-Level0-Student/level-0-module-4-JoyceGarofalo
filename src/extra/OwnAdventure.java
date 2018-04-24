package extra;


import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Escape the room You are locked in a room. In the room, your currently see 3 doors.");
	JOptionPane.showMessageDialog(null,"The door on the left is made of oak wood. The one in the middle is a glass mirror On the right, is a stone door");
	JOptionPane.showMessageDialog(null,"In front of the doors is two chests. One of which has the key, while the other has a swarm of wasps");
	
	int chest = JOptionPane.showOptionDialog(null, "Pick a chest", "Key Chest", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "LEFT" /*option 0*/, "RIGHT" /*option1*/}, null);
if (chest == 0) {
JOptionPane.showMessageDialog(null,"Player was attacked by swarm of wasps");
	
}
else {
	JOptionPane.showMessageDialog(null,"Player found key");
	int door = JOptionPane.showOptionDialog(null, "Which door would you like to go through?", "Door", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "wood", "glass", "stone" }, null);
	if (door == 0) {
		JOptionPane.showMessageDialog(null,"Player died from fire");
	}
	else if (door == 2) {
		JOptionPane.showMessageDialog(null,"Play fell down a pit and died");
	}
	
	else {
		JOptionPane.showMessageDialog(null,"You have found yourself in the riddle room");
		
		for (int i = 0; i < 3; i++) {

		String answer = JOptionPane.showInputDialog("Answer this riddle: What has roads with no cars, mountains with no snow, rivers with no water, oceans with no fish, and cities with no people?");

		if (answer.equalsIgnoreCase("map")) {
		JOptionPane.showMessageDialog(null, "correct! You escaped the room");
		break;
	}
	else {
		JOptionPane.showMessageDialog(null, "incorrect");
	}
	}
	}
}

}
}
