import java.awt.*;
import javax.swing.*;

public class Main {
	
	public static JFrame frame;
	public static JPanel userpanel;
	public static JPanel passpanel;
	public static JPanel cpchpanel;
	static JTextField userfield;
	static JPasswordField passfield;
	static JTextField cpchfield;
	public static String INFO1 = "Login with our new system designed";
	public static String INFO2 = "to prevent brute force attacks";
	public static String USER = "Username:";
	public static String PASS = "Password:";
	public static String CPCH = "Enter the words in the captcha below:";

	public static void main(String[] args) {
		
		
		frame = new JFrame("LOGIN");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(6, 1));
		
		JPanel infopanel = new JPanel();
		JLabel infotxt1 = new JLabel(INFO1);
		JLabel infotxt2 = new JLabel(INFO2);
		
		userpanel = new JPanel();
		userpanel.setLayout(new GridLayout(2, 1));
		JLabel usertxt = new JLabel(USER);
		userfield = new JTextField();
		userfield.addKeyListener(new Shuffler());
		
		passpanel = new JPanel();
		passpanel.setLayout(new GridLayout(2, 1));
		JLabel passtxt = new JLabel(PASS);
		passfield = new JPasswordField();
		passfield.addKeyListener(new Shuffler());
		
		cpchpanel = new JPanel();
		cpchpanel.setLayout(new GridLayout(2, 1));
		JLabel cpchtxt = new JLabel(CPCH);
		cpchfield = new JTextField();
		cpchfield.addKeyListener(new Shuffler());
		
		JLabel cpchimg = new JLabel(new ImageIcon("captchas/captcha1.png"));
		
		JButton loginbutton = new JButton("Login");
		loginbutton.addActionListener(new Success());
		
		infopanel.add(infotxt1);
		infopanel.add(infotxt2);
		userpanel.add(usertxt);
		userpanel.add(userfield);
		passpanel.add(passtxt);
		passpanel.add(passfield);
		cpchpanel.add(cpchtxt);
		cpchpanel.add(cpchfield);
		frame.add(infopanel);
		frame.add(userpanel);
		frame.add(passpanel);
		frame.add(cpchpanel);
		frame.add(cpchimg);
		frame.add(loginbutton);
		
		frame.setVisible(true);

		

	}

}
