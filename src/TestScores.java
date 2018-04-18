import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What did you get on the math test?");
	double score = Double.parseDouble(test); //test scores can have decimals
	if(score<51) {
		JOptionPane.showMessageDialog(null, "yikes");
	}
	else if(score<76 && score>50) {
		JOptionPane.showMessageDialog(null, "you should've studied more");
	}
	else if(score<89 && score>75) {
		JOptionPane.showMessageDialog(null, "not bad");
	}
	else if(score<101 && score>88) {
		JOptionPane.showMessageDialog(null, "nice");
	}
	else {
		JOptionPane.showMessageDialog(null, "that's not possible");
	}
}
}
