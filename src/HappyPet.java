import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.


for (int i = 0; i < 7; i++) {	
	
int task = JOptionPane.showOptionDialog(null, "What do you want to do", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food" /*option 0*/, "take a walk" /*option1*/, "pet" /*option2*/}, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel == 4) {
	JOptionPane.showMessageDialog(null, "You love your pet");
	break;
}

			 if (task == 2) {
				JOptionPane.showMessageDialog(null, "purrr");
				happinessLevel += 1;
			}
			else if (task == 1) {
				JOptionPane.showMessageDialog(null, "your pet is happy");
				happinessLevel += 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "nom nom");
				happinessLevel += 1;
			}
			
			 
				
				}
	}


	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
