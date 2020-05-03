import java.awt.event.*;
import javax.swing.*;

public class Success implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (validLogin()) {
			JDialog success = new JDialog(Main.frame, "Success!", false);
			success.setSize(250, 80);
			success.setLocationRelativeTo(null);
			success.add(new JLabel("Login successful"));
			success.setVisible(true);
		} else {
			JDialog success = new JDialog(Main.frame, "nice try", true);
			success.setSize(250, 80);
			success.setLocationRelativeTo(null);
			success.add(new JLabel("Wrong password. Please try again"));
			Main.userfield.setText("");
			Main.passfield.setText("");
			Main.cpchfield.setText("");
			success.setVisible(true);
		}

	}
	
	private static boolean validLogin() {
		String pass = new String(Main.passfield.getPassword());
		String cpch = Main.cpchfield.getText();
		return pass.equals("12345678") && cpch.equals("quxg4h");
	}

}
