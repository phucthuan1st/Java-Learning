import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "What your name?";
		String name = JOptionPane.showInputDialog(message);
		JOptionPane.showMessageDialog(null, "Your name is: " + name);
	}

}
