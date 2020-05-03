import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Shuffler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		JFrame frame = Main.frame;
		ArrayList<JPanel> panels = new ArrayList<>();
		panels.add(Main.userpanel);
		panels.add(Main.passpanel);
		panels.add(Main.cpchpanel);
		for (JPanel p : panels) frame.remove(p);
		Collections.shuffle(panels);
		for (JPanel p : panels) {
			frame.add(p, 1);
		}
		frame.revalidate();
		frame.repaint();
	}

}
